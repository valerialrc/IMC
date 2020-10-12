package mobile.example.valeria.imc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;

public class Tela1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela1);
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

    public void navegaTela1p2(View view){
        EditText nome = (EditText) findViewById(R.id.nome1);
        EditText idade = (EditText) findViewById(R.id.idade1);
        EditText peso = (EditText) findViewById(R.id.peso1);
        EditText alt = (EditText) findViewById(R.id.altura1);

        Intent it = new Intent(getBaseContext(), Tela2.class);

        Bundle params = new Bundle();

        params.putString("nome", nome.getText().toString() );
        params.putInt("idade", Integer.parseInt(idade.getText().toString()));
        params.putFloat("peso", Float.parseFloat(peso.getText().toString()));
        params.putFloat("altura", Float.parseFloat(alt.getText().toString()));
        it.putExtras(params);
        it.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(it);

    }


}
