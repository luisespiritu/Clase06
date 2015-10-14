package com.example.alumfial8.clase06;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends Activity {
    private EditText txtuser, txtclave;
    private Button enviar; Toast toast; String mensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtuser=(EditText) findViewById(R.id.edtusuario);
        txtclave=(EditText) findViewById(R.id.edtclave);
        enviar=(Button) findViewById(R.id.btnenviar);
    }
    public void validar (View view){
        String user, pass;
        user = txtuser.getText().toString();
        pass = txtclave.getText().toString();

        if (user.equals("")|| pass.equals("")){
            Toast.makeText(this, "Campos vacios", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);

        }else if (user.equals("noemi")&& pass.equals("123")){

            Toast.makeText(this, "Bienvenido", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this,PrincipalActivity.class);
           startActivity(intent);

        }else{
            Toast.makeText(this, "Clave Incorrecta", Toast.LENGTH_LONG).show();
        }
    }

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
}
