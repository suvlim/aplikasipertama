package edu.uph.m23si3.suvannaapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class calculator extends AppCompatActivity {
    EditText edtA, edtB;
    Button addbtn;
    Button multiplybtn;
    Button dividebtn;
    TextView txvHasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calculator);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        final Button addbutton = findViewById(R.id.addbtn);
        addbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String A = edtA.getText().toString();
                String B = edtB.getText().toString();
                int numberA = Integer.parseInt(A);
                int numberB = Integer.parseInt(B);
                int hasil = numberA + numberB;
                txvHasil.setText(String.valueOf(hasil));
            }
        });
        final Button multiplybutton = findViewById(R.id.multiplybtn);
        multiplybutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String A = edtA.getText().toString();
                String B = edtB.getText().toString();
                int numberA = Integer.parseInt(A);
                int numberB = Integer.parseInt(B);
                int hasil = numberA * numberB;
                txvHasil.setText(String.valueOf(hasil));
            }
        });
        final Button dividebutton = findViewById(R.id.dividebtn);
        dividebutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String A = edtA.getText().toString();
                String B = edtB.getText().toString();
                int numberA = Integer.parseInt(A);
                int numberB = Integer.parseInt(B);
                int hasil = numberA / numberB;
                txvHasil.setText(String.valueOf(hasil));
            }
        });

        edtA = findViewById(R.id.edtA);
        edtB = findViewById(R.id.edtB);
        addbtn = findViewById(R.id.addbtn);
        multiplybtn = findViewById(R.id.multiplybtn);
        dividebtn = findViewById(R.id.dividebtn);
        txvHasil = findViewById(R.id.txvHasil);
    }
}