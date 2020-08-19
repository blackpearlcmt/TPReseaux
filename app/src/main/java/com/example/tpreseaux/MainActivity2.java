package com.example.tpreseaux;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView tv1, tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String Username = bundle.getString("Username");
            String password = bundle.getString("password");
            TextView tvUsername = findViewById(R.id.Bienvenu);
            TextView tvpassword = findViewById(R.id.pass);
            tvUsername.setText(Username);
            tvpassword.setText(password);


        }



            }

        }
