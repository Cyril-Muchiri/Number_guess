package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int guess,result;
    int correct=15;
String msg;
int rand;

public void generateRand(){
    Random random=new Random();
    rand=random.nextInt(20)+1;
}

    public void onGuess(View view){
        EditText editText=(EditText) findViewById(R.id.editTextNumber);
        guess=Integer.parseInt(editText.getText().toString());

        if (guess>correct) {
            msg="lower!";
        }else if (guess<correct){
            msg="Higher!";
        }else {
            msg="you are correct!";
            generateRand();
        }
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






    }
}