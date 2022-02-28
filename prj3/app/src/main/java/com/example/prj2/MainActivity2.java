package com.example.prj2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private TextView txtViewUserName;
    private TextView txtViewPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toast.makeText(this,"xin chao day la activity 2",Toast.LENGTH_LONG).show();
        txtViewUserName = findViewById(R.id.txtUserName2);
        txtViewPassword = findViewById(R.id.txtPassword2);

        Bundle bundle = getIntent().getExtras();
        String userName = bundle.getString("userName");
        String password = bundle.getString("password");
        txtViewUserName.setText("userName: "+userName);
        txtViewPassword.setText("password: "+password);
    }
}