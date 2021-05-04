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
 * Register Activity to Register user
 */
public class Register extends AppCompatActivity {

    /**
     * EditText register_email_field
     * User email
     */
    private EditText register_email_field;

    /**
     * EditText register_pass_field
     * User password
     */
    private EditText register_pass_field;

    /**
     * EditText register_confir_pass_field
     * confirm the correct password
     */
    private EditText register_confir_pass_field;

    /**
     * Button to register user
     */
    private Button reg_btn;

    /**
     * Button to login
     */
    private Button reg_login_btn;

    /**
     * ProgressBar to visualize registration proces
     */
    private ProgressBar progressBar;

    /**
     * Display password if checked
     */
    private CheckBox checkBox;

    /**
     * FireBaseAuth mAuth for authorization
     */
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mAuth = FirebaseAuth.getInstance();

        checkBox = findViewById(R.id.register_checkbox);
        register_email_field = findViewById(R.id.register_email);
        register_pass_field = findViewById(R.id.register_password);
        register_confir_pass_field = findViewById(R.id.register_confirm_password);
        reg_btn = findViewById(R.id.register_button);
        reg_login_btn = findViewById(R.id.register_login_button);
        progressBar = findViewById(R.id.register_progressBar);

        // When password is checked, you can see password.
        // When password is not checked, you can not see password.
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b){
                if (b){
                    register_pass_field.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    register_confir_pass_field.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }else {
                    register_pass_field.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    register_confir_pass_field.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }
            }
        });

        reg_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String email = register_email_field.getText().toString();
                String pass = register_pass_field.getText().toString();
                String confirm_pass = register_confir_pass_field.getText().toString();

                // Check if empty or not
                if (!TextUtils.isEmpty(email) || !TextUtils.isEmpty(pass) || !TextUtils.isEmpty(confirm_pass)) {
                    if (pass.equals(confirm_pass)){
                        progressBar.setVisibility(View.VISIBLE);

                        mAuth.createUserWithEmailAndPassword(email,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()){
//                                    FirebaseUser
                                    sendtoMain();
                                }else {
                                    String error = task.getException().getMessage();
                                    Toast.makeText(getApplicationContext(), "Error: " + error, Toast.LENGTH_LONG).show();
                                }

                                progressBar.setVisibility(View.INVISIBLE);
                            }
                        });
                    }else {
                        Toast.makeText(getApplicationContext(), "Confirm password and password field doesn't match: ", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });

        reg_login_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Register.this,Login.class);
                startActivity(intent);
                finish();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();

        if (currentUser != null){
            sendtoMain();

        }
    }

    private void sendtoMain(){

        Intent intent = new Intent(Register.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}


