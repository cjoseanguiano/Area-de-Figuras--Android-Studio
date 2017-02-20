package com.determinarcalificacion.devix.areadefiguras;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtRadio;
    private EditText edtBaseTriangulo;
    private EditText edtAlturaTriangulo;
    private EditText edtBaseRectangulo;
    private EditText edtAlturaRectangulo;
    private Button btnCirculo;
    private Button btnRectangulo;
    private Button btnTriangulo;
    private TextView txtValores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtRadio = (EditText) findViewById(R.id.edtradioCirculo);
        edtBaseTriangulo = (EditText) findViewById(R.id.edtbaseTriangulo);
        edtAlturaTriangulo = (EditText) findViewById(R.id.edtalturaTriangulo);
        edtBaseRectangulo = (EditText) findViewById(R.id.edtbaseRectangulo);
        edtAlturaRectangulo = (EditText) findViewById(R.id.edtalturaRectangulo);
        btnCirculo = (Button) findViewById(R.id.btnCirculo);
        btnTriangulo = (Button) findViewById(R.id.btnTriangulo);
        btnRectangulo = (Button) findViewById(R.id.btnRectangulo);
        txtValores = (TextView) findViewById(R.id.txtValores);

        btnCirculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Circulo", Toast.LENGTH_SHORT).show();

                boolean VR = edtRadio.getText().toString().equals("");

                if (VR == false) {


                    String valorRadio = edtRadio.getText().toString();
                    // TODO: 19/02/17 Formula A=PI * R^2
                    double thisRadio = Double.parseDouble(valorRadio);
                    double PI = 3.1416;
                    thisRadio = PI * thisRadio * thisRadio;
                    txtValores.setText("El valor del Circulo es : " + thisRadio);
                } else {
                    Toast.makeText(MainActivity.this, "VERIFICA LOS VALORES DE RADIO", Toast.LENGTH_SHORT).show();
                    limpiarValores();
                    edtRadio.requestFocus();

                }
            }
        });


        btnTriangulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Triangulo", Toast.LENGTH_SHORT).show();
                // TODO: 19/02/17 Formula A= Base * Altura / 2
                boolean BT = edtBaseTriangulo.getText().toString().equals("");
                boolean AT = edtAlturaTriangulo.getText().toString().equals("");

                if (BT == false && AT == false) {


                    String valorBaseTriangulo = edtBaseTriangulo.getText().toString();
                    String valorAlturaTriangulo = edtAlturaTriangulo.getText().toString();

                    double RvalorBaseTriangulo = Double.parseDouble(valorBaseTriangulo);
                    double RvalorAlturaTriangulo = Double.parseDouble(valorAlturaTriangulo);
                    double ResultadoTriangulo;
                    int dividiendo = 2;
                    ResultadoTriangulo = RvalorBaseTriangulo * RvalorAlturaTriangulo / dividiendo;
                    txtValores.setText("El valor del Triangulo es : " + ResultadoTriangulo);

                } else {
                    Toast.makeText(MainActivity.this, "VERIFICA LOS VALORES DE TRIANGULO", Toast.LENGTH_SHORT).show();
                    limpiarValores();
                    edtBaseTriangulo.requestFocus();

                }
            }
        });
        btnRectangulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO: 19/02/17 Formula A= Base * Altura
//                Toast.makeText(MainActivity.this, "Rectangulo", Toast.LENGTH_SHORT).show();
                boolean edtBR = edtBaseRectangulo.getText().toString().equals("");
                boolean edtAR = edtAlturaRectangulo.getText().toString().equals("");

                if (edtBR == false && edtAR == false) {


                    String valorAnchoRectangulo = edtBaseRectangulo.getText().toString();
                    String valorAlturaRectagulo = edtAlturaRectangulo.getText().toString();
                    double RvalorAnchoRectangulo = Double.parseDouble(valorAnchoRectangulo);
                    double RvalorAlturaRectagulo = Double.parseDouble(valorAlturaRectagulo);
                    double ResultadoRectangulo = RvalorAlturaRectagulo * RvalorAnchoRectangulo;

                    txtValores.setText("El valor del Rectangulo es : " + ResultadoRectangulo);
                } else {
                    Toast.makeText(MainActivity.this, "VERIFICA LOS VALORES DE RECTANGULO", Toast.LENGTH_SHORT).show();
                    limpiarValores();
                    edtBaseRectangulo.requestFocus();
                }
            }
        });


    }

    public void limpiarValores() {

        edtRadio.setText("");
        edtBaseTriangulo.setText("");
        edtAlturaTriangulo.setText("");
        edtBaseRectangulo.setText("");
        edtAlturaRectangulo.setText("");
        txtValores.setText("");
    }
}
