package com.unpam.tugasnelasirait;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button login = findViewById(R.id.login);
        TextInputEditText username = findViewById(R.id.username);
        TextInputEditText password = findViewById(R.id.password);
        login.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                            if(username.getText().toString().equals("nelasirait") && password.getText().toString().equals("1234")) {
                                Intent intent = new Intent(MainActivity.this, home.class);
                                startActivity(intent);
                            }
                    }
                }
        );
    }
}