package com.example.qno218arid2982;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class BillDetail extends AppCompatActivity {

    TextView cusNameField;
    TextView cusBillNumberField;
    TextView cusMeterNumberField;
    TextView cusAmountField;
    TextView cusLastUnitsField;
    TextView cusCurrentUnitsField;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill_detail);

        cusNameField = findViewById(R.id.cusname);
        cusBillNumberField = findViewById(R.id.cusbillnumber);
        cusMeterNumberField = findViewById(R.id.cusmeternumber);
        cusAmountField = findViewById(R.id.cusamount);
        cusLastUnitsField = findViewById(R.id.cuslastunits);
        cusCurrentUnitsField = findViewById(R.id.cuscurrentunits);

        String name = getIntent().getStringExtra("name");
        String bill = getIntent().getStringExtra("bill");
        String meter = getIntent().getStringExtra("meter");
        String amount = getIntent().getStringExtra("amount");
        String lUnits = getIntent().getStringExtra("lunits");
        String cUnits = getIntent().getStringExtra("cunits");

        cusNameField.setText(name);
        cusBillNumberField.setText(bill);
        cusMeterNumberField.setText(meter);
        cusAmountField.setText(amount + " PKR");
        cusLastUnitsField.setText(lUnits);
        cusCurrentUnitsField.setText(cUnits);



    }
}