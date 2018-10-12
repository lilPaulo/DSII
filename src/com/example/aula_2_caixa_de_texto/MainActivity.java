package com.example.aula_2_caixa_de_texto;

import android.os.Bundle;
import android.widget.EditText;
import android.app.Activity;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {
	
	
	EditText nome_dg;
	EditText telefone_dg;
	EditText email_dg;
	EditText idade_dg;
	
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    public void maior_menor_idade(View v){
  nome_dg = (EditText) findViewById(R.id.nome);  
  telefone_dg = (EditText) findViewById(R.id.telefone);  
  email_dg = (EditText) findViewById(R.id.email);  
  idade_dg = (EditText) findViewById(R.id.idade);  
  
    }
    
}
