package com.eliamtechnologies.escreening;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.OnProgressListener;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;



public class CVActivity extends AppCompatActivity {


    Button buttonChooseCV;
    Button buttonUploadCV;
    TextView text_cv;
    ;

    StorageReference storageReference;
    DatabaseReference databaseReference;


    FirebaseAuth fAuth;
    FirebaseFirestore fStore;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_v);


        fAuth = FirebaseAuth.getInstance();
        fStore = FirebaseFirestore.getInstance();

        text_cv = findViewById(R.id.text_BirthCertificate);
        buttonChooseCV = findViewById(R.id.buttonChooseCV);
        buttonUploadCV = findViewById(R.id.buttonUploadCV);

        storageReference = FirebaseStorage.getInstance().getReference();
        databaseReference = FirebaseDatabase.getInstance().getReference("MobileStudent/CV");

        buttonUploadCV.setEnabled(false);

        buttonChooseCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectPDF();
            }
        });


    }

    private void selectPDF() {

        Intent intent = new Intent();
        intent.setType("application/pdf");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(Intent.createChooser(intent, "Select PDF"), 12);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable final Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 12 && resultCode == RESULT_OK && data != null && data.getData() != null) {
            buttonUploadCV.setEnabled(true);
            //text_cv.setText(data.getDataString().substring(data.getDataString().lastIndexOf("/" + 1)));
            buttonUploadCV.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    uploadPDFFirebase(data.getData());

                }
            });
        }

    }

    private void uploadPDFFirebase(Uri data) {

        final ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setTitle("File is loading...");
        progressDialog.show();

        StorageReference reference = storageReference.child("MobileStudent/CV" + System.currentTimeMillis() + ".pdf");

        reference.putFile(data).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
            @Override
            public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {

                Task<Uri> uriTask = taskSnapshot.getStorage().getDownloadUrl();
                while (!uriTask.isComplete()) ;
                Uri uri = uriTask.getResult();

                putPDF putPDF = new putPDF("C.V", uri.toString());
                databaseReference.child(databaseReference.push().getKey()).setValue(putPDF);
                Toast.makeText(CVActivity.this, "File Upload", Toast.LENGTH_LONG).show();
                progressDialog.dismiss();

            }
        }).addOnProgressListener(new OnProgressListener<UploadTask.TaskSnapshot>() {
            @Override
            public void onProgress(@NonNull UploadTask.TaskSnapshot snapshot) {

                double progress = (100.0 * snapshot.getBytesTransferred()) / snapshot.getTotalByteCount();
                progressDialog.setMessage("File Uploaded..." + (int) progress + "%");

            }
        });

    }
}