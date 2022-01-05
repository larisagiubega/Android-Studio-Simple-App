package com.example.testdouaactivitati;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ADouaActivitate extends AppCompatActivity {

    //    private TextView txtADouaAct;

    private EditText editTxtADouaAct;
    private Button btnADouaAct;
    private String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity_main);

        editTxtADouaAct = (EditText) findViewById(R.id.editTxtADouaAct);

        Intent intentPrimaAct = getIntent();
        text = intentPrimaAct.getStringExtra("primaAct");
        ScrieTextDinPrimaActivitate();

        btnADouaAct=(Button)findViewById(R.id.btnADouaAct);

        btnADouaAct.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                DeschidePrimaActivitate();
            };
        });
    }

    void ScrieTextDinPrimaActivitate(){
        editTxtADouaAct.setText(this.text, TextView.BufferType.EDITABLE);
    }

    void DeschidePrimaActivitate(){
        Intent resultIntent = new Intent();
        text = editTxtADouaAct.getText().toString();
        resultIntent.putExtra("aDouaAct", text);
        setResult(Activity.RESULT_OK, resultIntent);
        finish();
    }
}