package com.example.basicui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

public class FormActivity extends AppCompatActivity {

    DatePicker datePicker;
    EditText editBirthday;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        datePicker = findViewById(R.id.date_picker);
        editBirthday = findViewById(R.id.edit_birthday);

        findViewById(R.id.btn_select).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (datePicker.getVisibility() == View.GONE) {
                    datePicker.setVisibility(View.VISIBLE);
                } else {
                    datePicker.setVisibility(View.GONE);

                    int day = datePicker.getDayOfMonth();
                    int month = datePicker.getMonth() + 1;
                    int year = datePicker.getYear();

                    editBirthday.setText(String.format("%d/%d/%d", day, month, year));
                }
            }
        });
    }
}