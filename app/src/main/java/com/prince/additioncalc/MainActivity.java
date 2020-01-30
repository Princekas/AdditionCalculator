package com.prince.additioncalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
private EditText editText1;
private EditText editText2;
int value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1=(EditText)findViewById(R.id.text1);
        editText2=(EditText)findViewById(R.id.text2);

                Button button =(Button)findViewById(R.id.button1);

                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        String value11=editText1.getText().toString();
                        String value22=editText2.getText().toString();
                        value=Integer.parseInt(value11)+Integer.parseInt(value22);

                        Toast.makeText(MainActivity.this, "value"+value, Toast.LENGTH_SHORT).show();
                    }
                });
    }
}
