package com.example.trial6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import java.util.Calendar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void buttonisClicked(View ButtonView)
    {
        TextView text_1=findViewById(R.id.txt1);
        TextView text_2=findViewById(R.id.txt2);
        int year;
        // Calendar instance is important
        year=Calendar.getInstance().get(Calendar.YEAR)-Integer.parseInt(text_1.getText().toString());
        String s;
        s=Integer.toString(year);
        text_2.setText(s);
        Log.i("INPUT YEAR",text_1.getText().toString());
        Toast.makeText(MainActivity.this,"Your pets age is : "+ year,1).show();
        
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Log.i("Tag","Hi there ");

    }
}

