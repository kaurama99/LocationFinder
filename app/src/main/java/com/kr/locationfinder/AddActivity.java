package com.kr.locationfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddActivity extends AppCompatActivity {
    EditText address_input;
    Button inject_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        address_input = findViewById(R.id.address_input);
        inject_button = findViewById(R.id.inject_button);
        inject_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyDatabase myDB = new MyDatabase(AddActivity.this);
                myDB.addADDRESS(address_input.getText().toString().trim());
            }
        });
    }
}