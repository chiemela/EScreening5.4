package com.eliamtechnologies.escreening;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class StartScreeningActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screening2);

        ImageView imageViewPassport = (ImageView) findViewById(R.id.imageViewPassport);
        ImageView imageViewTranscripts = (ImageView) findViewById(R.id.imageViewTranscripts);
        ImageView imageViewResults = (ImageView) findViewById(R.id.imageViewResults);
        ImageView imageViewTestimonial = (ImageView) findViewById(R.id.imageViewTestimonial);
        ImageView imageViewValidID = (ImageView) findViewById(R.id.imageViewValidID);
        ImageView imageViewBirthCertificate = (ImageView) findViewById(R.id.imageViewBirthCertificate);
        ImageView imageViewIELTS = (ImageView) findViewById(R.id.imageViewIELTS);
        ImageView imageViewPersonalStatement = (ImageView) findViewById(R.id.imageViewPersonalStatement);
        ImageView imageViewCV = (ImageView) findViewById(R.id.imageViewCV);


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