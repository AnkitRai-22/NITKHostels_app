package com.example.nitkhostels;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {
    private EditText std_name;
    private EditText admin_name;
    private EditText std_pass;
    private EditText admin_pass;
    private Button std;
    private Button admin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        std_name = (EditText) findViewById(R.id.std_Name);
        admin_name = (EditText) findViewById(R.id.admin_Name);
        std_pass = (EditText)findViewById(R.id.std_pass);
        admin_pass = (EditText)findViewById(R.id.admin_pass);
        std = (Button)findViewById(R.id.std_button);
        admin = (Button)findViewById(R.id.admin_button);


        std.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valid_Std(std_name.getText().toString(),std_pass.getText().toString());
            }
        });
        admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                valid_Admin(admin_name.getText().toString(),admin_pass.getText().toString());
            }
        });
    }

    private void valid_Std(String std_username,String std_password){
        if((std_username.equals("181870"))&&(std_password.equals("18192224"))){
            Intent intent = new Intent(Login.this,Student_Workspace.class);
            startActivity(intent);
        }
        else
        {   std.setEnabled(false);
    }}
        private void valid_Admin(String admin_username,String admin_password){
        if((admin_username.equals("1"))&&(admin_password.equals("1234"))){
            Intent intent2 = new Intent(Login.this,Admin_Workspace.class);
            startActivity(intent2);
        }
        else{
            admin.setEnabled(false);
        }
    }
}
