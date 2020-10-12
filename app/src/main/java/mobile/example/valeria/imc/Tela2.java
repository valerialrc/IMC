package mobile.example.valeria.imc;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.view.View;

import java.text.DecimalFormat;

import androidx.appcompat.app.AppCompatActivity;

public class Tela2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela2);

        Intent it = getIntent();
        Bundle params = it.getExtras();
        String nome = params.getString("nome");
        float p = params.getFloat("peso");
        float h = params.getFloat("altura");
        DecimalFormat df = new DecimalFormat("#0.00");
        float imc = (float) p/(h*h);

        TextView nome2 = (TextView) findViewById(R.id.nome2);
        nome2.setText(nome);

        TextView idade2 = (TextView) findViewById(R.id.idade2);
        idade2.setText(params.getInt("idade") + " anos");

        TextView peso2 = (TextView) findViewById(R.id.peso2);
        peso2.setText(df.format(p) + " Kg");

        TextView altura2 = (TextView) findViewById(R.id.altura2);
        altura2.setText(df.format(h) + " m");

        TextView imc2 = (TextView) findViewById(R.id.imc2);
        imc2.setText(df.format(imc) + " Kg/m²");

        String cls;

        TextView cl = (TextView) findViewById(R.id.cl2);

        if (imc < 18.5)
            cls = "Abaixo do Peso";
        else if(imc < 25)
            cls = "Saudável";
        else if (imc < 30)
            cls = "Sobrepeso";
        else if (imc < 35)
            cls = "Obesidade Grau I";
        else if(imc < 40)
            cls = "Obesidade Grau II (severa)";
        else
            cls = "Obesidade Grau III (mórbida)";

        cl.setText(cls);


    }

    private String getClassName(){
        return getClass().getName();
    }
    protected void onStart(){
        super.onStart();
        Log.i("Ciclo de vida", getClassName() + ".onStart chamado.");
    }

    protected void onResume(){
        super.onResume();
        Log.i("Ciclo de vida", getClassName() + ".onResume chamado.");
    }

    protected void onRestart(){
        super.onRestart();
        Log.i("Ciclo de vida", getClassName() + ".onRestart chamado.");
    }

    protected void onPause(){
        super.onPause();
        Log.i("Ciclo de vida", getClassName() + ".onPause chamado.");
    }

    protected void onStop(){
        super.onStop();
        Log.i("Ciclo de vida", getClassName() + ".onStop chamado.");
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.i("Ciclo de vida", getClassName() + ".onDestroy chamado.");
    }

    public void navegarTela1(View view) {
        finish();
    }
}
