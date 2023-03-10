package com.example.cps406;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

public class CustomerCard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_card);
        Stock bought[] = {new Stock("DogeCoin", "-123.50"),
                new Stock("Pepe", "13.50"),
                new Stock("PewDew", "163.75"),
                new Stock("Samshlong", "69.69"),
        };

        ListView lstView = (ListView) findViewById(R.id.StockListView);
        TextView balance = (TextView) findViewById(R.id.customerBalance);
        StockAdapter stc = new StockAdapter(getApplicationContext(),bought, null);
        lstView.setAdapter(stc);



    }
}