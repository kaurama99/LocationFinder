package com.kr.locationfinder;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UpdateActivity extends AppCompatActivity {

    EditText address_input2;
    Button inject_button2;

    String address, id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);
        address_input2 = findViewById(R.id.address_input2);
        getAndSetIntentData();
        ActionBar ab = getSupportActionBar();
        if(ab != null){
            ab.setTitle(address);
        }
        inject_button2 = findViewById(R.id.inject_button2);
        inject_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyDatabase myDB = new MyDatabase(UpdateActivity.this);
                myDB.updateData(id, address);
            }
        });


    }
    void getAndSetIntentData(){
        if(getIntent().hasExtra("id") && getIntent().hasExtra("address")){
            id = getIntent().getStringExtra("id");
            address = getIntent().getStringExtra("address");
            address_input2.setText(address);

        }else {
            Toast.makeText(this, "No data!", Toast.LENGTH_SHORT).show();
        }
    }
}