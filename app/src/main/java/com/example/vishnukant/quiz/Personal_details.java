package com.example.vishnukant.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.vishnukant.quiz.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Personal_details extends AppCompatActivity {


    private FirebaseAuth firebaseAuth;

    private EditText name;
    private EditText Phnno;
    private EditText address;
    private EditText tenth_percentage;
    private EditText twelfth_percentage;
    private Button submit;

    private DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_details);

        firebaseAuth.getInstance();

        databaseReference = FirebaseDatabase.getInstance().getReference().child("Users");


        name = (EditText)findViewById(R.id.name);
        Phnno = (EditText)findViewById(R.id.phnno);
        address = (EditText)findViewById(R.id.address);
        tenth_percentage = (EditText) findViewById(R.id.tenth_percentage);
        twelfth_percentage = (EditText)findViewById(R.id.twelfth_percentage);
        submit = (Button) findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AddData();
                Toast.makeText(Personal_details.this,"Information Saved",Toast.LENGTH_LONG).show();
                startActivity(new Intent(getApplicationContext(),Login.class));
            }
        });

    }
    public void AddData(){
        String Name = name.getText().toString().trim();
        String phnno =Phnno.getText().toString().trim();
        String Address =address.getText().toString().trim();
        Float Tenth_Percentage=Float.parseFloat(tenth_percentage.getText().toString().trim());
        Float Twelfth_Percentage=Float.parseFloat(twelfth_percentage.getText().toString().trim());

        if(TextUtils.isEmpty(Name) || TextUtils.isEmpty(phnno) || TextUtils.isEmpty(Address) ){
            Toast.makeText(Personal_details.this,"Fieds Cannot Be Empty",Toast.LENGTH_LONG).show();
            return;
        }

        SaveData saveData= new SaveData(Name,phnno,Address,Tenth_Percentage,Twelfth_Percentage);
        databaseReference.setValue(saveData);
    }
}
