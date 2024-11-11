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

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button registerBtn = findViewById(R.id.button_Register_Register);
        EditText registerEmail = findViewById(R.id.editText_Register_Email);
        EditText registerPass = findViewById(R.id.editText_Register_Password);

        Intent intent = new Intent(this, Login.class);

        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String messageEmail = registerEmail.getText().toString();
                String messagePass = registerPass.getText().toString();

                intent.putExtra("RegisterEmail", messageEmail);
                intent.putExtra("RegisterPass", messagePass);
                startActivity(intent);
                finish();
            }
        });
    }
}