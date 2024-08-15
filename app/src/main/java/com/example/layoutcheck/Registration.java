package com.example.layoutcheck;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Registration extends AppCompatActivity {
    private TextView fullnameTextView;
    private TextView enrolmentIdTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_registration);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        fullnameTextView = findViewById(R.id.fullname_textview);
        enrolmentIdTextView = findViewById(R.id.enrolment_no_textview);

        Intent intent = getIntent();
        String fullname = intent.getStringExtra("fullname");
        String enrolmentId = intent.getStringExtra("enrolment_id");

        fullnameTextView.setText(fullname);
        enrolmentIdTextView.setText(enrolmentId);
    }
}