package com.example.pocketwallet;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int balance = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvBalance = findViewById(R.id.tvBalance);
        EditText etAmount = findViewById(R.id.etAmount);
        Button btnAdd = findViewById(R.id.btnAdd);
        Button btnSpend = findViewById(R.id.btnSpend);

        btnAdd.setOnClickListener(v -> {
            String s = etAmount.getText().toString();
            if(!s.isEmpty()) {
                int amount = Integer.parseInt(s);
                balance += amount;
                tvBalance.setText("Balance: $" + balance);
            }
        });

        btnSpend.setOnClickListener(v -> {
            String s = etAmount.getText().toString();
            if(!s.isEmpty()) {
                int amount = Integer.parseInt(s);
                balance -= amount;
                tvBalance.setText("Balance: $" + balance);
            }
        });
    }
}
