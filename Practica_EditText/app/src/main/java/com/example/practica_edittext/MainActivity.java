package com.example.practica_edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText nombre;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = (EditText) findViewById(R.id.nombre);
        password = (EditText) findViewById(R.id.password);
    }

    public void Registrar(View view){
        String name = nombre.getText().toString(), pass = password.getText().toString();

        if(name.length() == 0 && pass.length() == 0){
            Toast.makeText(this,"Los campos 'Nombre' y 'Contraseña' están vacíos", Toast.LENGTH_LONG).show();
        }
        else if(name.length() == 0 && pass.length() > 0){
            Toast.makeText(this,"El campo 'Nombre' está vacío", Toast.LENGTH_LONG).show();
        }
        else if(name.length() > 0 && pass.length() == 0){
            Toast.makeText(this,"El campo 'Contraseña' está vacío", Toast.LENGTH_LONG).show();
        }
        else
            Toast.makeText(this,"Registro en proceso...", Toast.LENGTH_LONG).show();

    }
}
