package com.inzevision.truecalc;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TitulActivity extends AppCompatActivity implements View.OnClickListener{

    Button addNewOperation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_titul);

        addNewOperation = (Button) findViewById(R.id.addNewOperation);
        addNewOperation.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.addNewOperation:
                Intent intent = new Intent(this, AddOperationActivity.class);
                startActivity(intent);
                break;
        }
    }
}
