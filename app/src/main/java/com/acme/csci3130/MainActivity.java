package com.acme.csci3130;

import android.app.Activity;
import android.os.Bundle;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText = (EditText) findViewById(R.id.editText);
        final TextView helloText = (TextView) findViewById(R.id.helloText);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String s = editText.getText().toString().trim();
                helloText.setText(s);

            }
        });
    }
}
