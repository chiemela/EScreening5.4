package com.eliamtechnologies.escreening;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class StartScreeningActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screening3);

        Button imageViewPassport = (Button) findViewById(R.id.imageViewPassport);
        Button imageViewTranscripts = (Button) findViewById(R.id.imageViewTranscripts);
        Button imageViewResults = (Button) findViewById(R.id.imageViewResults);
        Button imageViewTestimonial = (Button) findViewById(R.id.imageViewTestimonial);
        Button imageViewValidID = (Button) findViewById(R.id.imageViewValidID);
        Button imageViewBirthCertificate = (Button) findViewById(R.id.imageViewBirthCertificate);
        Button imageViewIELTS = (Button) findViewById(R.id.imageViewIELTS);
        Button imageViewPersonalStatement = (Button) findViewById(R.id.imageViewPersonalStatement);
        Button imageViewCV = (Button) findViewById(R.id.imageViewCV);


        imageViewPassport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startScreeningIntent = new Intent(v.getContext(), PassportActivity.class);
                startActivity(startScreeningIntent);
            }
        });

        imageViewTranscripts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startScreeningIntent = new Intent(v.getContext(), TranscriptsActivity.class);
                startActivity(startScreeningIntent);
            }
        });

        imageViewResults.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startScreeningIntent = new Intent(v.getContext(), ResultsActivity.class);
                startActivity(startScreeningIntent);
            }
        });

        imageViewTestimonial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startScreeningIntent = new Intent(v.getContext(), TestimonialActivity.class);
                startActivity(startScreeningIntent);
            }
        });

        imageViewValidID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startScreeningIntent = new Intent(v.getContext(), ValidIDActivity.class);
                startActivity(startScreeningIntent);
            }
        });

        imageViewBirthCertificate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startScreeningIntent = new Intent(v.getContext(), BirthCertificateActivity.class);
                startActivity(startScreeningIntent);
            }
        });

        imageViewIELTS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startScreeningIntent = new Intent(v.getContext(), IELTSActivity.class);
                startActivity(startScreeningIntent);
            }
        });

        imageViewPersonalStatement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startScreeningIntent = new Intent(v.getContext(), PersonalStatementActivity.class);
                startActivity(startScreeningIntent);
            }
        });

        imageViewCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startScreeningIntent = new Intent(v.getContext(), CVActivity.class);
                startActivity(startScreeningIntent);
            }
        });


    }
}