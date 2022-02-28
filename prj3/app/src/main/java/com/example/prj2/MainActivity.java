package com.example.prj2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private EditText txtUserName;
    private EditText txtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.button);
        txtUserName =  findViewById(R.id.txtUserName);
        txtPassword =  findViewById(R.id.txtPassword);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this, MainActivity2.class);
                Bundle bundle = new Bundle();
                bundle.putString("userName", txtUserName.getText().toString());
                bundle.putString("password",txtPassword.getText().toString());
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }

}