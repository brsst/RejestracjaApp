package com.example.rejestracjaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText emailEditText;
    private EditText passwordEditText;
    private EditText repeatPasswordEditText;
    private TextView messageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailEditText = findViewById(R.id.emailEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        repeatPasswordEditText = findViewById(R.id.repeatPasswordEditText);
        messageTextView = findViewById(R.id.messageTextView);
        Button confirmButton = findViewById(R.id.confirmButton);

        messageTextView.setText("Autor: Aleksandro Akulov");


        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailEditText.getText().toString();
                String password = passwordEditText.getText().toString();
                String repeatPassword = repeatPasswordEditText.getText().toString();

                if (!email.contains("@")) {
                    messageTextView.setText("Nieprawidłowy adres e-mail");
                } else if (!password.equals(repeatPassword)) {
                    messageTextView.setText("Hasła się różnią");
                } else {
                    messageTextView.setText("Witaj " + email);
                }
            }
        });
    }
}