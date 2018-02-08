package com.example.kid_d_000.lab11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText texto;
    Button calcular;
    TextView area;
    String cad="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto=(EditText) findViewById(R.id.editText);
        calcular=(Button)findViewById(R.id.button);
        area=(TextView) findViewById(R.id.area);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i=0;i<10;i++){
                    cad+=texto.getText()+"X"+(i+1)+"="+(Integer.parseInt(texto.getText().toString())*(i+1))+"\n";
                }
                area.setText(cad);
            }
        });
    }
}
