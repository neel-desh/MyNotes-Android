package com.neel.mynotes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.neel.mynotes.database.DatabaseHelper;
import com.neel.mynotes.helpers.InputValidation;

public class Login extends AppCompatActivity {

    private TextInputLayout textInputLayoutEmail;
    private TextInputLayout textInputLayoutPassword;
    private TextInputEditText textInputEditTextEmail;
    private TextInputEditText textInputEditTextPassword;
    private MaterialButton loginBtn, registerBtn;
    private InputValidation inputValidation;
    private DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        textInputLayoutEmail = (TextInputLayout) findViewById(R.id.edit_email);
        textInputLayoutPassword = (TextInputLayout) findViewById(R.id.edit_password);
        textInputEditTextEmail = (TextInputEditText) findViewById(R.id.edit_email_text);
        textInputEditTextPassword = (TextInputEditText) findViewById(R.id.edit_password_text);
        loginBtn = findViewById(R.id.button_login);
        registerBtn = findViewById(R.id.button_register);

        databaseHelper = new DatabaseHelper(getApplicationContext());
        inputValidation = new InputValidation(getApplicationContext());




    }
}