package com.example.zork1_000.se21;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static TextView ausgabe;
    static EditText input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ausgabe = (TextView) findViewById(R.id.textView3);
        input = (EditText) findViewById(R.id.editText);
    }


    public static void btnStringcheck_onClick(View view) {
        String palindrom;
        palindrom = input.getText().toString();
        if (palindrom.length()>=5){
        if (isPalindrome(palindrom)== true){
        ausgabe.setText(palindrom + " ist ein Palindrom.");
        }else {
            ausgabe.setText(palindrom + " ist kein Palindrom.");
        }}
        else {
            ausgabe.setText(" Bitte mind. 5 Zeichen lang.");
        }
    }

    public static boolean isPalindrome(String str)	{
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
