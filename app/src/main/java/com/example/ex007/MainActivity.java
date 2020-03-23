package com.example.ex007;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    Button btn2;
    TextView tv;
    int num=0;
    Random rnd= new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1= (Button)findViewById(R.id.btn1);
        btn2= (Button)findViewById(R.id.btn2);
        tv= (TextView)findViewById(R.id.tv);

    }

    public void click(View view) {
        num= rnd.nextInt(100)+1;
        tv.setText("Number="+num);
    }

    public void cancel(View view) {
        num=0;
        tv.setText("Number not found");
    }
}
