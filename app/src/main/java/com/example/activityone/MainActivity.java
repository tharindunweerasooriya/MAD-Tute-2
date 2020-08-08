package com.example.activityone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        txtView2 = findViewById(R.id.textView2);
        txtView2.setText(R.string.Msg2);

        Log.i("Lifecysle", "OnCreate() invoke");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Lifecysle", "OnStart() invoke");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Lifecysle", "OnRestart() invoke");
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}
