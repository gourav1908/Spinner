package com.example.developer.spinner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    /*String[] items = new String[] {"One", "Two", "Three"};*/
    EditText et1;
    Spinner spn;
    String val;
    Button btn_p;
   /* String nothing;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spn=(Spinner)findViewById(R.id.spinner);
        et1=(EditText)findViewById(R.id.editText);
        btn_p = findViewById(R.id.btn_p);
        btn_p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Permissions.class);
                startActivity(intent);
            }
        });

        spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                val=spn.getSelectedItem().toString();
                et1.setText(val);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                val=spn.getSelectedItem().toString();
                et1.setText(val);
                if(val.equals("UAE"))
                {
                    Toast.makeText(MainActivity.this, "nothing selected", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
