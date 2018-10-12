package com.example.stiiv.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnPunto;
    Button btnClear, btnSuma, btnResta, btnDivision, btnMultiplicar, btnSin, btnTan, btnCos, btnIgual, btnBorrar;
    TextView txtView_resultado;
    double double_resultado;
    String operador, mostrar, reserva;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TextView
        txtView_resultado = (TextView) findViewById(R.id.textView2);
        mostrar = "";
        //Botones
        btn0 = (Button) findViewById(R.id.btn_0);
        btn1 = (Button) findViewById(R.id.btn_1);
        btn2 = (Button) findViewById(R.id.btn_2);
        btn3 = (Button) findViewById(R.id.btn_3);
        btn4 = (Button) findViewById(R.id.btn_4);
        btn5 = (Button) findViewById(R.id.btn_5);
        btn6 = (Button) findViewById(R.id.btn_6);
        btn7 = (Button) findViewById(R.id.btn_7);
        btn8 = (Button) findViewById(R.id.btn_8);
        btn9 = (Button) findViewById(R.id.btn_9);
        btnBorrar = (Button) findViewById(R.id.btn_borrar);
        btnMultiplicar = (Button) findViewById(R.id.btn_multiplicar);
        btnDivision = (Button) findViewById(R.id.btn_dividir);
        btnSuma = (Button) findViewById(R.id.btn_suma);
        btnResta = (Button) findViewById(R.id.btn_resta);
        btnSin = (Button) findViewById(R.id.btn_sen);
        btnTan = (Button) findViewById(R.id.btn_tan);
        btnCos = (Button) findViewById(R.id.btn_cos);
        btnIgual = (Button) findViewById(R.id.btn_igual);
        btnClear = (Button) findViewById(R.id.btn_clear);
        btnPunto = (Button) findViewById(R.id.btn_punto);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = mostrar + "0";
                txtView_resultado.setText(mostrar);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = mostrar + "1";
                txtView_resultado.setText(mostrar);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = mostrar + "2";
                txtView_resultado.setText(mostrar);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = mostrar + "3";
                txtView_resultado.setText(mostrar);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = mostrar + "4";
                txtView_resultado.setText(mostrar);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = mostrar + "5";
                txtView_resultado.setText(mostrar);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = mostrar + "6";
                txtView_resultado.setText(mostrar);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = mostrar + "7";
                txtView_resultado.setText(mostrar);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = mostrar + "8";
                txtView_resultado.setText(mostrar);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = mostrar + "9";
                txtView_resultado.setText(mostrar);
            }
        });
        btnPunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = mostrar + ".";
                txtView_resultado.setText(mostrar);
            }
        });
        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reserva = mostrar;
                operador = "/";
                mostrar = "";
                txtView_resultado.setText(mostrar);
            }
        });
        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reserva = mostrar;
                operador = "+";
                mostrar = "";
                txtView_resultado.setText(mostrar);
            }
        });
        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reserva = mostrar;
                operador = "-";
                mostrar = "";
                txtView_resultado.setText(mostrar);
            }
        });
        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reserva = mostrar;
                operador = "*";
                mostrar = "";
                txtView_resultado.setText(mostrar);
            }
        });
        btnCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reserva = mostrar;
                operador = "cos(";
                mostrar = "";
                txtView_resultado.setText(mostrar);
            }
        });
        btnSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reserva = mostrar;
                operador = "sin(";
                mostrar = "";
                txtView_resultado.setText(mostrar);
            }
        });
        btnTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reserva = mostrar;
                operador = "tan(";
                mostrar = "";
                txtView_resultado.setText(mostrar);
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = "";
                txtView_resultado.setText(mostrar);
            }
        });
        btnBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador = "";
                reserva = "";
                mostrar = "";
                txtView_resultado.setText(mostrar);
            }
        });

        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (operador){
                    case "+":
                        double_resultado = Double.parseDouble(reserva) + Double.parseDouble(mostrar);
                        mostrar = String.valueOf(double_resultado);
                        txtView_resultado.setText(String.format("%.2f", double_resultado));
                        break;
                    case "-":
                        double_resultado = Double.parseDouble(reserva) - Double.parseDouble(mostrar);
                        mostrar = String.valueOf(double_resultado);
                        txtView_resultado.setText(String.format("%.2f", double_resultado));
                        break;
                    case "*":
                        double_resultado = Double.parseDouble(reserva) * Double.parseDouble(mostrar);
                        mostrar = String.valueOf(double_resultado);
                        txtView_resultado.setText(String.format("%.2f", double_resultado));
                        break;
                    case "/":
                        double_resultado = Double.parseDouble(reserva) / Double.parseDouble(mostrar);
                        mostrar = String.valueOf(double_resultado);
                        txtView_resultado.setText(String.format("%.2f", double_resultado));
                        break;

                    case "cos(":
                        double_resultado = Math.cos(Double.parseDouble(reserva));
                        mostrar = String.valueOf(double_resultado);
                        txtView_resultado.setText(String.format("%.2f", double_resultado));
                        break;
                    case "sin(":
                        double_resultado = Math.sin(Double.parseDouble(reserva));
                        mostrar = String.valueOf(double_resultado);
                        txtView_resultado.setText(String.format("%.2f", double_resultado));
                        break;
                    case "tan(":
                        double_resultado = Math.tan(Double.parseDouble(reserva));
                        mostrar = String.valueOf(double_resultado);
                        txtView_resultado.setText(String.format("%.2f", double_resultado));
                        break;
                    default:
                        Toast.makeText(getApplicationContext(), "No", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }


}
