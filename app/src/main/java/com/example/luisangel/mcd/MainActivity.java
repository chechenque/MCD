package com.example.luisangel.mcd;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView resultado;
    EditText num1,num2;
    Button boton,boton2,boton3;
    int b,c,pulasiones;
    Funciones func;
    Log log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultado = (TextView) findViewById(R.id.Resultado);
        num1 = (EditText) findViewById(R.id.editText);
        num2 = (EditText) findViewById(R.id.editText2);
        boton = (Button) findViewById(R.id.Boton);
        boton2 = (Button) findViewById(R.id.Boton2);
        boton3 = (Button) findViewById(R.id.Boton3);
        func = new Funciones();

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String p = "" + num1.getText();
                String q = "" + num2.getText();
                b = Integer.parseInt(p);
                c = Integer.parseInt(q);
                resultado.setText(""+func.mcd(b,c));
            }
        });

        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String p = "" + num1.getText();
                String q = "" + num2.getText();
                b = Integer.parseInt(p);
                c = Integer.parseInt(q);
                resultado.setText(""+func.mcm(b,c));
            }
        });

        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                String prox = "Diganle a erik";
                String eric = "Diganle a Erik que traiga cacachuates para desbloquear esta opcion";
                int duration = Toast.LENGTH_SHORT;
                log.d("Aqui","aqui");
                Toast toast = Toast.makeText(context,eric,duration);
                toast.show();
            }
        });
    }
}
