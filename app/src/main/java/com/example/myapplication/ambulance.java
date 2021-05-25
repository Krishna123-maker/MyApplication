package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.google.android.material.textfield.TextInputLayout;

public class ambulance extends AppCompatActivity {
    private TextInputLayout textInputLayout_month;
    private AutoCompleteTextView dropDownText_month;

    private TextInputLayout textInputLayout_day;
    private AutoCompleteTextView dropDownText_day;

    private TextInputLayout textInputLayout_year;
    private AutoCompleteTextView dropDownText_year;

    private TextInputLayout textInputLayout_gender;
    private AutoCompleteTextView dropDownText_gender;

    private TextInputLayout textInputLayout_department;
    private AutoCompleteTextView dropDownText_department;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ambulance);

        /////Date DropDown

                        ///Months
        dropDownText_month=findViewById(R.id.autoComplete_month);
        textInputLayout_month=findViewById(R.id.textInputLayout_month);
        String[] month= new String[]{
                "Month",
                "January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "October",
                "November",
                "December",
        };
        
        ArrayAdapter<String> monthadapter=new ArrayAdapter<>(ambulance.this,
                R.layout.months_items,
                month
        );
        dropDownText_month.setAdapter(monthadapter);

                    ///Days
        dropDownText_day=findViewById(R.id.autoComplete_day);
        textInputLayout_day=findViewById(R.id.textInputLayout_day);
        String[] day= new String[]{
                "Day","1","2","3","4","5","6","7","8","9","10",
                "11","12","13","14","15","16","17","18","19","20",
                "21","22","23","24","25","26","27","28","29","30","31",
                "32"
        };

        ArrayAdapter<String> dayadapter=new ArrayAdapter<>(ambulance.this,
                R.layout.days_items,
                day
        );
        dropDownText_day.setAdapter(dayadapter);

                //Year
        dropDownText_year=findViewById(R.id.autoComplete_year);
        textInputLayout_year=findViewById(R.id.textInputLayout_year);
        String[] year= new String[]{
                "Year","2010","2009","2008","2007","2006","2005","2004","2003","2002","2001",
                "2000","1999","1998","1997","1996","1995","1994","1993","1992","1991",
                "1990","1989","1988","1987","1986","1985","1984","1983","1982","1981",
                "1980","1979","1978","1977","1976","1975","1974","1973","1972","1971",
                "1970","1969","1968","1967","1966","1965"
        };

        ArrayAdapter<String> yearadapter=new ArrayAdapter<>(ambulance.this,
                R.layout.year_items,
                year
        );
        dropDownText_year.setAdapter(yearadapter);



            //////Gender DropDown
        dropDownText_gender = findViewById(R.id.autoComplete_gender);
        textInputLayout_gender = findViewById(R.id.textInputLayout_gender);
        String[] gender= new String[]{
                "Please Select",
                "Male",
                "Female",
                "None"
        };
        ArrayAdapter<String> genderadapter=new ArrayAdapter<>(ambulance.this,
                R.layout.gender_items,
                gender
        );
        dropDownText_gender.setAdapter(genderadapter);


    }
}