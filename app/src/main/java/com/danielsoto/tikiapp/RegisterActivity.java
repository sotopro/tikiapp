package com.danielsoto.tikiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class RegisterActivity extends AppCompatActivity {
    TextView textLogIn;
    MaterialButton registerButton;
    TextInputEditText inputFullName, inputNickname, inputPhoneNumber , inputPassword;
    String textFullName, textNickname, textPhoneNumber, textPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        textLogIn = findViewById(R.id.textLogIn);
        registerButton = findViewById(R.id.register_button);
        inputFullName = findViewById(R.id.register_input_fullName);
        inputNickname = findViewById(R.id.register_input_nickname);
        inputPhoneNumber = findViewById(R.id.register_input_phoneNumber);
        inputPassword = findViewById(R.id.register_input_password);

        textLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textFullName = inputFullName.getText().toString();
                textNickname = inputNickname.getText().toString().trim();
                textPhoneNumber = inputPhoneNumber.getText().toString().trim();
                textPassword = inputPassword.getText().toString().trim();
                Log.e("FULLNAME", textFullName);
                Log.e("NICKNAME", textNickname);
                Log.e("PHONENUMBER", textPhoneNumber);
                Log.e("PASSWORD", textPassword);
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

}