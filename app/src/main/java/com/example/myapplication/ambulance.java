package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.google.android.material.textfield.TextInputLayout;

public class ambulance extends AppCompatActivity {

    private TextInputLayout textInputLayout;
    private AutoCompleteTextView dropDownText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ambulance);

        dropDownText = findViewById(R.id.autoComplete_gender);
        textInputLayout = findViewById(R.id.select_gender);
        String[] gender= new String[]{
                "Please Select",
                "Male",
                "Female",
                "None"
        };
        ArrayAdapter<String> adapter=new ArrayAdapter<>(ambulance.this,
                R.layout.gender_items,
                gender
        );
        dropDownText.setAdapter(adapter);
    }
}