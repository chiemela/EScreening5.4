package com.eliamtechnologies.escreening;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class StartScreeningActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screening3);

        bottomNavigationView = findViewById(R.id.bottom_navigation);

        Button imageViewPassport = (Button) findViewById(R.id.imageViewPassport);
        Button imageViewTranscripts = (Button) findViewById(R.id.imageViewTranscripts);
        Button imageViewResults = (Button) findViewById(R.id.imageViewResults);
        Button imageViewTestimonial = (Button) findViewById(R.id.imageViewTestimonial);
        Button imageViewValidID = (Button) findViewById(R.id.imageViewValidID);
        Button imageViewBirthCertificate = (Button) findViewById(R.id.imageViewBirthCertificate);
        Button imageViewIELTS = (Button) findViewById(R.id.imageViewIELTS);
        Button imageViewPersonalStatement = (Button) findViewById(R.id.imageViewPersonalStatement);
        Button imageViewCV = (Button) findViewById(R.id.imageViewCV);
        bottomNavigationView.setSelectedItemId(R.id.start_screening);


        //perform itemSelectedListener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.home_Activity:
                        startActivity(new Intent(getApplicationContext(),MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.dashboard:
                        startActivity(new Intent(getApplicationContext(),Dashboard.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.start_screening:
                        return true;
                    case R.id.about:
                        startActivity(new Intent(getApplicationContext(),About.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });


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