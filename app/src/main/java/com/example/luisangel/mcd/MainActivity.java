package com.example.luisangel.mcd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView resultado;
    EditText num1,num2;
    Button boton;
    int b,c;
    MCD mcd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultado = (TextView) findViewById(R.id.Resultado);
        num1 = (EditText) findViewById(R.id.editText);
        num2 = (EditText) findViewById(R.id.editText2);
        boton = (Button) findViewById(R.id.Boton);
        mcd = new MCD();

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String p = "" + num1.getText();
                String q = "" + num2.getText();
                b = Integer.parseInt(p);
                c = Integer.parseInt(q);
                resultado.setText(""+mcd.mcd(b,c));
            }
        });
    }

    public void calcula(View v){

    }
}
