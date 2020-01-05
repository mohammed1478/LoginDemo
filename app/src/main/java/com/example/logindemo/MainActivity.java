package com.example.logindemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    void LoginClick (View view){
        EditText UsernameET = (EditText) findViewById(R.id.UsernameET);
        EditText PassowordET = (EditText) findViewById(R.id.PassowordET);

        Log.i("Username is", UsernameET.getText().toString());
        Log.i("password is", PassowordET.getText().toString());
        Toast.makeText(this,"You logged the login information", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
