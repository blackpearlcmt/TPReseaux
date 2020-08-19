package com.example.tpreseaux;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.tpreseaux.api.ApiClient;
import com.example.tpreseaux.model.User;

import retrofit2.Call;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    private String Username;
    private String Password;
    private EditText edtUsername,edtPassword;
    Button btnValider;
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        reecupere les id des vues
         */
        edtUsername=findViewById( R.id.username);

        edtPassword=findViewById(R.id.password);
        btnValider = findViewById(R.id.exit_button);

        btnValider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Username = edtUsername.getText().toString();
                Password = edtPassword.getText().toString();
                if(TextUtils.isEmpty(Username)||TextUtils.isEmpty(Password)){
                    Toast.makeText(context,"Entrez a nouveau ",Toast.LENGTH_SHORT).show();
                }

                else{
                    btnValider= findViewById(R.id.exit_button);
                    //DO AN ONCLICLK LISTENER
                    btnValider.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            //INTENTS TO LINK THE VEXT BUTTON TO THE NEXTPAGE
                            Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                            startActivity(intent);



                        }
                    });
                }


                btnValider.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        String Username = edtUsername.getText().toString().trim();
                        String password = edtPassword.getText().toString().trim();
                        Bundle bundle = new Bundle();
                        bundle.putString("edtUsername", Username);
                        bundle.putString("edtPassword", password);
                        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }

                });
            }
        });

    }
    public void Login(String usern,String Pass){
        Retrofit LoginQ= ApiClient.getRetrofit();
    }

    }
