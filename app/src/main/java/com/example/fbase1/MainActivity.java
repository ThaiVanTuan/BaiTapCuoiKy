package com.example.fbase1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        getSupportActionBar().setBackgroundDrawable(
//                new ColorDrawable(Color.parseColor("#FF03DAC5")));

        TextView tvopen = (TextView) findViewById(R.id.gotoRegister);
        tvopen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doOpenRegester();
            }

            public void doOpenRegester() {
                Intent myIntent = new Intent(MainActivity.this, RegesterActivity.class);
                startActivity(myIntent);
            }
        });
        Button btnOpen = (Button)
                findViewById(R.id.btnLogin);
        btnOpen.setOnClickListener(arg0 -> doOpenChildActivity());
    }

    public void doOpenChildActivity() {
        TextView inputEmail = (TextView)
                findViewById(R.id.inputEmail);
        TextView inputPassword = (TextView)
                findViewById(R.id.inputPassrowd);
        if (inputEmail.getText().length() != 0 && inputPassword.getText().length() != 0) {
            if (inputEmail.getText().toString().equals("thaivantuan") && inputPassword.getText().toString().equals("12345")) {
                Intent myIntent = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(myIntent);
                Toast.makeText(MainActivity.this, "Logged in successfully!", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(MainActivity.this, "Wrong account or password!", Toast.LENGTH_SHORT).show();
                inputEmail.setText("");
                inputPassword.setText("");
            }
        }else{
            Toast.makeText(MainActivity.this, "Fill in all the information!", Toast.LENGTH_SHORT).show();
        }

    }
}

