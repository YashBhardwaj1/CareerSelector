package com.example.vishnukant.quiz;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity implements View.OnClickListener {

    private Button Login;
    private EditText editTextEmail;
    private EditText editTextPassword;
    private TextView userRegister;

    //firebase auth object
    private FirebaseAuth firebaseAuth;

    //progress dialog
    private ProgressDialog progressDialog;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //getting firebase auth object
        firebaseAuth = FirebaseAuth.getInstance();



        //initializing views
        editTextEmail = (EditText) findViewById(R.id.username);
        editTextPassword = (EditText) findViewById(R.id.password);
        Login = (Button) findViewById(R.id.login);
        userRegister =(TextView)findViewById(R.id.Register);

        progressDialog = new ProgressDialog(this);

        //attaching click listener
        Login.setOnClickListener(this);
        userRegister.setOnClickListener(this);

    }

    private void LoginUser(){
        String email = editTextEmail.getText().toString().trim();
        String password  = editTextPassword.getText().toString().trim();


        //checking if email and passwords are empty
        if(TextUtils.isEmpty(email)){
            Toast.makeText(this,"Please enter email",Toast.LENGTH_LONG).show();
            return;
        }

        if(TextUtils.isEmpty(password)){
            Toast.makeText(this,"Please enter password",Toast.LENGTH_LONG).show();
            return;
        }

        //if the email and password are not empty
        //displaying a progress dialog

        progressDialog.setMessage("Logging in Please Wait...");
        progressDialog.show();

        //registering the user
        firebaseAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    progressDialog.dismiss();
                    Toast.makeText(getApplicationContext(),"Logged in Successfully",Toast.LENGTH_LONG).show();
                    startActivity(new Intent(getApplicationContext(),user_dashboard.class));

                }else{
                    progressDialog.dismiss();
                    Toast.makeText(getApplicationContext(),"Could Not Login",Toast.LENGTH_LONG).show();
                }
            }
        });


    }



    @Override
    public void onClick(View view) {
        if(view == Login){
            LoginUser();
        }
        if(view == userRegister){
            finish();
            startActivity(new Intent(this,Registration_Activity.class));
        }

    }

}
