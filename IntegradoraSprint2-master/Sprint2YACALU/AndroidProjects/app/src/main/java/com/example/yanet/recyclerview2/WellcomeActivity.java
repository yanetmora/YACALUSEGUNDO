package com.example.yanet.recyclerview2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class WellcomeActivity extends AppCompatActivity {
    public static final String user="names";
    TextView txtUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wellcome);

        txtUser = (TextView) findViewById(R.id.textUser);
        String user = getIntent().getStringExtra("names");
        txtUser.setText("Bienvenido " + user +"!!");

    }
}
