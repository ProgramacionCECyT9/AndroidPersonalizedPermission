package edu.cecyt9.ipn.practica21_2_seguridad;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void verVideo (View view){
        Intent i = new Intent();
        i.setClassName("edu.cecyt9.ipn.practica21_seguridad",
                "edu.cecyt9.ipn.practica21_seguridad.VerVideo");
        startActivity(i);
    }
}
