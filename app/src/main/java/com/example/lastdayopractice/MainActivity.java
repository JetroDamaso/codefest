package com.example.lastdayopractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ONLY CLICK 1 BUTTON
        Button button1 = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button1);
        Button button3 = findViewById(R.id.button2);


        //DROPDOWN MENU
        TextInputLayout textInputLayout = findViewById(R.id.inputlayout);
        AutoCompleteTextView autoCompleteTextView = findViewById(R.id.autoCompleteTextView2);




        //ONLY CLICK 1 BUTTON
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                button1.setBackgroundColor(Color.parseColor("#76ABAE"));
                button1.setTextColor(Color.parseColor("#EEEEEE"));
                buttonsGrey();

            }
            private void buttonsGrey(){
                button2.setBackgroundColor(Color.parseColor("#222831"));
                button3.setBackgroundColor(Color.parseColor("#222831"));

                button2.setTextColor(Color.parseColor("#EEEEEE"));
                button3.setTextColor(Color.parseColor("#EEEEEE"));

            }

        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                button2.setBackgroundColor(Color.parseColor("#76ABAE"));
                button2.setTextColor(Color.parseColor("#EEEEEE"));
                buttonsGrey();

            }
            private void buttonsGrey(){
                button1.setBackgroundColor(Color.parseColor("#222831"));
                button3.setBackgroundColor(Color.parseColor("#222831"));

                button1.setTextColor(Color.parseColor("#EEEEEE"));
                button3.setTextColor(Color.parseColor("#EEEEEE"));

            }

        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                button3.setBackgroundColor(Color.parseColor("#76ABAE"));
                button3.setTextColor(Color.parseColor("#EEEEEE"));
                buttonsGrey();

            }
            private void buttonsGrey(){
                button1.setBackgroundColor(Color.parseColor("#222831"));
                button2.setBackgroundColor(Color.parseColor("#222831"));

                button1.setTextColor(Color.parseColor("#EEEEEE"));
                button2.setTextColor(Color.parseColor("#EEEEEE"));

            }

        });
        //ONLY CLICK 1 BUTTON


        //FRAGMENT
        private void replaceFragment(Fragment fragmentName){
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.inputlayout, fragmentName);
            fragmentTransaction.commit();
        }
    }
}