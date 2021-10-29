package com.example.memesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView textView;
    EditText userName,password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        textView=findViewById(R.id.textView);
        userName=findViewById(R.id.userName);
        password=findViewById(R.id.password);
        Intent intent=new Intent(this,MainActivity2.class);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user=userName.getText().toString();
                String pass=password.getText().toString();
                if(user.equals("Admin") && pass.equals("Pass")) {
                    startActivity(intent);
                }else {
                    Toast.makeText(MainActivity.this, "Wrong Username or Password!! Please try again!!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}