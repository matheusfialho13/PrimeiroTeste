package com.example.matheus.primeiroteste;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//(R.layout.content_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                //        .setAction("Action", null).show();

                Intent it = new Intent(MainActivity.this, TesteWebViewActivity.class);
                MainActivity.this.startActivity(it);
                MainActivity.this.finish();
            }
        });
        /*
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        */
    }

    public void multiplicar(View view){

        EditText num1 = (EditText) findViewById(R.id.num1);
        double n1Num = Double.parseDouble(num1.getText().toString());

        EditText num2 = (EditText) findViewById(R.id.num2);
        double n2Num = Double.parseDouble(num2.getText().toString());

        double mult = n1Num*n2Num;
        TextView result = (TextView) findViewById(R.id.result);
        String x = String.valueOf(mult);
        result.setText("Resultado:\n"+x);

        //Toast.makeText(getBaseContext(),"Resultado: "+mult, Toast.LENGTH_LONG).show();//No lugar de "getBaseContext()" pode ser this
    }

    public void dividir(View view){
        EditText num1 = (EditText) findViewById(R.id.num1);
        double n1Num = Double.parseDouble(num1.getText().toString());

        EditText num2 = (EditText) findViewById(R.id.num2);
        double n2Num = Double.parseDouble(num2.getText().toString());

        double mult = n1Num/n2Num;
        TextView result = (TextView) findViewById(R.id.result);
        String x = String.valueOf(mult);
        result.setText("Resultado:\n"+x);
    }

    public void somar(View view){
        EditText num1 = (EditText) findViewById(R.id.num1);
        double n1Num = Double.parseDouble(num1.getText().toString());

        EditText num2 = (EditText) findViewById(R.id.num2);
        double n2Num = Double.parseDouble(num2.getText().toString());

        double mult = n1Num+n2Num;
        TextView result = (TextView) findViewById(R.id.result);
        String x = String.valueOf(mult);
        result.setText("Resultado:\n"+x);
    }

    public void subtrair(View view){
        EditText num1 = (EditText) findViewById(R.id.num1);
        double n1Num = Double.parseDouble(num1.getText().toString());

        EditText num2 = (EditText) findViewById(R.id.num2);
        double n2Num = Double.parseDouble(num2.getText().toString());

        double mult = n1Num-n2Num;
        TextView result = (TextView) findViewById(R.id.result);
        String x = String.valueOf(mult);
        result.setText("Resultado:\n"+x);
    }


    /* *Foi Colocado no onCreate*
    public void ConfigMudaTela (){
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                //        .setAction("Action", null).show();

                Intent it = new Intent(MainActivity.this, TesteWebViewActivity.class);
                MainActivity.this.startActivity(it);
                MainActivity.this.finish();
            }
        });
    }
    */



    protected void onStart() {
        super.onStart();
    }

    protected void onResume() { super.onResume(); }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    //protected void onPause() { super.onPause(); }

    //protected void onStop() { super.onStop(); }

    //protected void onDestroy() { super.onDestroy(); }
}
