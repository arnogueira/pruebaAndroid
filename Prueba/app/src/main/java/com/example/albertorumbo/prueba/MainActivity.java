package com.example.albertorumbo.prueba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnOne;
    Button btnTwo;
    Button btnThree;

    TextView tvHola;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    tvHola = (TextView) findViewById(R.id.tv_hola);
    btnOne = (Button) findViewById(R.id.btn_one);
    btnTwo = (Button) findViewById(R.id.btn_two);
    btnThree = (Button) findViewById(R.id.btn_three);

    btnOne.setOnClickListener(this);
    btnTwo.setOnClickListener(this);
    btnThree.setOnClickListener(this);




    }


    public void onClick(View v){

        switch(v.getId()){
            case R.id.btn_three:
                Intent intent = new Intent (v.getContext(), cuentaAtras.class);
                startActivityForResult(intent, 0);
                break;
            case R.id.btn_two:
                Intent intent2 = new Intent (v.getContext(), Starlink.class);
                startActivityForResult(intent2, 0);
                break;
            case R.id.btn_one:
                tvHola.setText("7 de diciembre de 2018");
                break;

        }
    }
}
