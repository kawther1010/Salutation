package com.example.appexo02;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText editText;
    RadioButton radioButton1;
    RadioButton radioButton2;
    Button btn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView= findViewById(R.id.textView);
        editText= findViewById(R.id.editText);
        radioButton1= findViewById(R.id.radioButton1);
        radioButton2= findViewById(R.id.radioButton2);
        btn= findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(radioButton1.isChecked()){
                    textView.setText("Bonjour monsieur");
                } else{
                    textView.setText("Bonjour madame");
                }
            }
        });

        //question 3
        Toast.makeText(this, "Tapez ici votre text", Toast.LENGTH_LONG).show();

        // question 4
        //View view = null;
        //Snackbar.make(view, "Tapez votre text". Snackbar.LENGTH_LONG).show();
    }
}