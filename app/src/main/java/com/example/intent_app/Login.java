package com.example.intent_app;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        String messageEmail = getIntent().getStringExtra("RegisterEmail");
        String messagePass = getIntent().getStringExtra("RegisterPass");

        EditText LoginEmail = findViewById(R.id.editText_Login_Email);
        LoginEmail.setText(messageEmail);

        EditText LoginPass = findViewById(R.id.editText_Login_Password);
        LoginPass.setText(messagePass);

        Button btnLogin_ = findViewById(R.id.button_Login_Login);

        btnLogin_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}