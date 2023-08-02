package com.NeoPet.agenda_neo_pet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username;
    EditText password;
    Button loginButton;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editTextPassword = findViewById(R.id.password);
        final CheckBox checkBoxShowPassword = findViewById(R.id.checkBoxShowPassword);

        checkBoxShowPassword.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {

                if (isChecked) {
                    // Mostrar contraseña
                    editTextPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                } else {
                    // Ocultar contraseña
                    editTextPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                // Hacer que el cursor se posicione al final del texto
                editTextPassword.setSelection(editTextPassword.getText().length());












            }
        });







        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginButton = findViewById(R.id.LoginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("user")&&password.getText().toString().equals("user")){
                    Toast.makeText(MainActivity.this,"Login Succesful",Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this,"Login failed",Toast.LENGTH_SHORT).show();
                }
            }
        });







    }
}