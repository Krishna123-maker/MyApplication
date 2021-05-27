package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.google.android.material.textfield.TextInputLayout;

public class Activity_blood extends AppCompatActivity {
    private TextInputLayout textInputLayout_blood;
    private AutoCompleteTextView dropDownText_blood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood);


        dropDownText_blood=findViewById(R.id.autoComplete_bloodgroup);
        textInputLayout_blood=findViewById(R.id.textInputLayout_blood);
        String[] blood_group= new String[]{
                "A+",
                "A-",
                "B+",
                "B-",
                "AB+",
                "AB-",
                "O+",
                "O-"
        };

        ArrayAdapter<String> bloodadapter=new ArrayAdapter<>(Activity_blood.this,
                R.layout.blood_items,
                blood_group
        );
        dropDownText_blood.setAdapter(bloodadapter);

    }
}