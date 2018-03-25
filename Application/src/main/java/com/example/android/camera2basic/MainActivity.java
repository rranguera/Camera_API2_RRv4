package com.example.android.camera2basic;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void iniciarCam (View v){
        Intent intent = new Intent(this, CameraActivity.class);
        startActivity(intent);
    }



    public void infoInstrucciones (View v){
        Toast.makeText(this, "-PDT- instruccions", Toast.LENGTH_SHORT).show();
    }



    public void editarSubtitulos (View v){
        Toast.makeText(this, "-PDT- editor de subtítols", Toast.LENGTH_SHORT).show();
    }


}
