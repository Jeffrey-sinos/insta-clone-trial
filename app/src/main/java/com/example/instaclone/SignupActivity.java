package com.example.instaclone;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity {
    private Button btnSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        btnSignup = findViewById(R.id.btnSignup);

        btnSignup.setOnClickListener(v -> {
            // Navigate to HomeActivity
            Intent intent = new Intent(SignupActivity.this, HomeActivity.class);
            startActivity(intent);
        });
    }
}