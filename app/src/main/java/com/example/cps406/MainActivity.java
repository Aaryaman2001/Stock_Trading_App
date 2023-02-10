package com.example.cps406;


import static java.lang.Float.parseFloat;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static Adapter adapter;
    Context context;
    private Button buy;
    private Button sell;
    private TextView bal;







//    List<Stock> stocks = new ArrayList<Stock>();




        Stock stocks[] = {new Stock("Apple", "123.50"),
                new Stock("Microsoft", "13.50"),
                new Stock("BMX", "163.75"),
                new Stock("Samsung", "83.54"),
                new Stock("Apple", "123.50"),
                new Stock("Microsoft", "13.50"),
                new Stock("BMX", "163.75"),
                new Stock("Samsung", "83.54"),
                new Stock("Apple", "123.50"),
                new Stock("Microsoft", "13.50"),
                new Stock("BMX", "163.75"),
                new Stock("Samsung", "83.54"),
                new Stock("Apple", "123.50"),
                new Stock("Microsoft", "13.50"),
                new Stock("BMX", "163.75"),
                new Stock("Samsung", "83.54"),
                new Stock("Apple", "123.50"),
                new Stock("Microsoft", "13.50"),
                new Stock("BMX", "163.75"),
                new Stock("Samsung", "83.54"),
                new Stock("Jack Daniels", "13.50")};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        Intent intent = new Intent(this, stockview.class);
//        intent.putExtra("balance", bal.getText().toString());
        context = this;

//        bal.setText("This works?!");
//        startActivity(intent);
//        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
//        getSupportActionBar().setCustomView(R.layout.activity_app_bar);




        setContentView(R.layout.activity_main);
        ListView lstView = (ListView) findViewById(R.id.StockListView);

        TextView bal = findViewById(R.id.showBalance);
        StockAdapter stc = new StockAdapter(getApplicationContext(),stocks, bal);
        lstView.setAdapter(stc);


        ImageView customer = findViewById(R.id.goToWallet);
        customer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CustomerCard.class);
                startActivity(intent);
            }
        });








    }
//    public static void setBal(String x){
//        String sol = String.valueOf(parseFloat(bal.toString()) - parseFloat(x));
//        bal.setText(sol);
//    }
//
//    public static String getBal() {
//        return bal.toString();
//    }
}