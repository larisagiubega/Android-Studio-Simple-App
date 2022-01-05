package com.example.testdouaactivitati;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PrimaActivitate extends AppCompatActivity {

    private TextView txtPrimaAct;
    private EditText editTxtPrimaAct;
    private Button btnPrimaAct;
    private String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTxtPrimaAct = (EditText) findViewById(R.id.editTxtPrimaAct);

        btnPrimaAct=(Button)findViewById(R.id.btnPrimaAct);

        btnPrimaAct.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                DeschideADouaActivitate();
            }
        });
    }

    private void DeschideADouaActivitate() {

        text = editTxtPrimaAct.getText().toString();
        Intent intentADouaAct = new Intent(this, ADouaActivitate.class);
        intentADouaAct.putExtra("primaAct", text);
        startActivityForResult(intentADouaAct, 5);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // TODO Auto-generated method stub
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 5 && resultCode == RESULT_OK && data != null) {
                text = data.getStringExtra("aDouaAct");
                editTxtPrimaAct = (EditText) findViewById(R.id.editTxtPrimaAct);
                editTxtPrimaAct.setText(text, TextView.BufferType.EDITABLE);
        }
    }

   /*@Override
    protected void onStart() {
        super.onStart();

        txtPrimaAct = (TextView) findViewById(R.id.txtPrimaAct);
        txtPrimaAct.setText("onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        txtPrimaAct = (TextView) findViewById(R.id.txtPrimaAct);
        txtPrimaAct.setText("onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        txtPrimaAct = (TextView) findViewById(R.id.txtPrimaAct);
        txtPrimaAct.setText("onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        txtPrimaAct = (TextView) findViewById(R.id.txtPrimaAct);
        txtPrimaAct.setText("onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();

        txtPrimaAct = (TextView) findViewById(R.id.txtPrimaAct);
        txtPrimaAct.setText("onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        txtPrimaAct = (TextView) findViewById(R.id.txtPrimaAct);
        txtPrimaAct.setText("onDestroy");
    }*/
}