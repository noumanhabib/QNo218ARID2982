package com.example.qno218arid2982;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    Button register;
    Button forgotPassword;
    Button loginBtn;

    EditText usernameField;
    EditText passwordField;

    String[] users;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_view);
        register = findViewById(R.id.register);
        register.setOnClickListener(this::startRegister);

        forgotPassword = findViewById(R.id.forgot_pass);
        forgotPassword.setOnClickListener(this::startForgotPassword);

        loginBtn = findViewById(R.id.login);
        loginBtn.setOnClickListener(this::login);

        usernameField = (EditText) findViewById(R.id.username);
        passwordField = (EditText) findViewById(R.id.password);

        Resources res = getResources();
        users = res.getStringArray( R.array.users );

    }

    public void startRegister(View v){
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }
    public void startForgotPassword(View v){

    }

    public void login(View v){
        String username = usernameField.getText().toString();
        String password = passwordField.getText().toString();

        if(username.compareTo(users[1]) == 0 && password.compareTo(users[2]) == 0){
            Intent intent = new Intent(this, MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
        }
        else{
            usernameField.setError("No such record found");
        }
    }
}