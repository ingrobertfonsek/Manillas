package com.example.android.manillas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private Bundle b;
    private Intent i;
    private RadioButton r1, r2,r3,r4;
    private  Spinner combotipo;
    private ArrayAdapter<String> adapter;
    private String[] opc;
    private Button calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       calcular= (Button)findViewById(R.id.btncalc);
        combotipo =(Spinner)findViewById(R.id.cmbtipo);
        r1 = (RadioButton)findViewById(R.id.r1);
        r2 = (RadioButton)findViewById(R.id.r2);
        r3 = (RadioButton)findViewById(R.id.r3);
        r4 = (RadioButton)findViewById(R.id.r4);

        b = new Bundle();
        opc = this.getResources().getStringArray(R.array.Tipo);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,opc);

        combotipo.setAdapter(adapter);

    }
public void calcular (View v){
    String Material,Tipo;
    if(r1.isChecked()) Material = getResources().getString(R.string.Cuero);{
        if(r3.isChecked()) Material = getResources().getString(R.string.Cuerda);
    }

}
}
