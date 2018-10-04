package com.example.developer.spinner;

import android.Manifest;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Permissions extends AppCompatActivity {
    Button btn_click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_permissions);

        btn_click = findViewById(R.id.btn_click);

        btn_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                askforPermissions();
            }
        });
    }

    private void askforPermissions() {
        ActivityCompat.shouldShowRequestPermissionRationale(this,
                Manifest.permission.CAMERA);
        Toast.makeText(this, "permissions granted", Toast.LENGTH_SHORT).show();
    }
}
