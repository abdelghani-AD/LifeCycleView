package com.example.lifecycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText num1, num2;
    Button calcule;
    TextView resultat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "On Create ", Toast.LENGTH_LONG).show();
        num1 = findViewById(R.id.num01);
        num2 = findViewById(R.id.num02);
        resultat = findViewById(R.id.resultat);
        calcule = findViewById(R.id.btn);

        calcule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n01 = Integer.parseInt(num1.getText().toString().trim());
                int n02 = Integer.parseInt(num2.getText().toString().trim());
                int res = n01 * n02;
                resultat.setText("Resultat est : "+ res);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "On Start ", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "On Resume ", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "On Pause ", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "On Stop ", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "On Destroy", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "On Restart ", Toast.LENGTH_LONG).show();
    }
}