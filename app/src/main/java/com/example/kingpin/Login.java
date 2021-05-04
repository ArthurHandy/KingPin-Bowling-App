package com.example.kingpin;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

/**
 * Login Page
 * Uses Firebase authentication
 */
public class Login extends AppCompatActivity {

    /**
     * EditText loginEmailtext;
     * User email
     */
    private EditText loginEmailtext;
    /**
     * EditText loginPasswordtext;
     * User password
     */
    private EditText loginPasswordtext;
    /**
     * Button logintn;
     * Button to login
     */
    private Button loginbtn;
    /**
     * Button to register
     */
    private Button loginregisterbtn;

    /**
     * FireBaseAuth mAuth for authorization
     */
    private FirebaseAuth mAuth;

    /**
     * ProgressBar visual for logging in
     */
    private ProgressBar progressBar;

    /**
     * CheckBox to display password
     */
    private CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mAuth = FirebaseAuth.getInstance();

        progressBar = findViewById(R.id.login_progressBar);
        loginEmailtext = findViewById(R.id.login_email);
        checkBox = findViewById(R.id.login_checkbox);
        loginPasswordtext = findViewById(R.id.login_password);
        loginbtn = findViewById(R.id.login_button);
        loginregisterbtn = findViewById(R.id.login_register_button);

        loginbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String loginEmail = loginEmailtext.getText().toString();
                String loginpass = loginPasswordtext.getText().toString();

                if (!TextUtils.isEmpty(loginEmail) || !TextUtils.isEmpty(loginpass)) {
                    progressBar.setVisibility(View.VISIBLE);
                    mAuth.signInWithEmailAndPassword(loginEmail, loginpass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()){
                                sendtoMain();
                            }else {
                                String error = task.getException().getMessage();
                                Toast.makeText(getApplicationContext(),"Error :" + error, Toast.LENGTH_LONG).show();
                            }
                        }
                    });
                }
            }
        });

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b){
                if (b){
                    loginPasswordtext.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }else {
                    loginPasswordtext.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            }
        });

        loginregisterbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this,Register.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
        if (currentUser != null){

            Intent intent = new Intent(Login.this,MainActivity.class);
            startActivity(intent);
            finish();
        }
    }

    private void sendtoMain(){
        Intent intent = new Intent(Login.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}