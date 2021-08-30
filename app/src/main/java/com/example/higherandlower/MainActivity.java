package com.example.higherandlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomnumber;
    public void guess(View view){

        EditText editText = (EditText) findViewById(R.id.editTextNumberSigned);

        int guessvalue = Integer.parseInt(editText.getText().toString());

        String ans;
        if(guessvalue>randomnumber){
            ans = "lower";
        }else if(guessvalue<randomnumber){
            ans = "Higher";
        }else{
            ans = "You got I !";
        }
        Toast.makeText(this, ans,Toast.LENGTH_LONG).show();

        Log.i("Entered Number",editText.getText().toString());
        Log.i("Random number", Integer.toString(randomnumber));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Random rand = new Random();
        randomnumber = rand.nextInt(20) + 1;

    }
}