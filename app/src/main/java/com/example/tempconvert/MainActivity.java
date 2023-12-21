package com.example.tempconvert;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void cToF(View a){
        EditText t = findViewById(R.id.source);
        String input = t.getText().toString();
        double c = Double.parseDouble(input);
        double f = ((c*9)/5)+32;
        output(f);
        Log.d("info", input);
    }
    public void fToC(View b){
        EditText t = findViewById(R.id.source);
        String input = t.getText().toString();
        double f = Double.parseDouble(input);
        double c = ((f-32)*5)/9;

        output(c);
        Log.d("info", input);
    }

    public void output(double v){
        String s= Double.toString(v);
        ((TextView)findViewById(R.id.hello)).setText(s);
    }

}