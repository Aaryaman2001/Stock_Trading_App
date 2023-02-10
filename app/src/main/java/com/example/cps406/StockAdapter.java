package com.example.cps406;

import static java.lang.Float.parseFloat;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;

public class StockAdapter extends BaseAdapter{
//    String[] stockName;

    Context context;
//    int[] stockPrice;
    LayoutInflater inflater;
    Stock[] stocks;
    String job;
    private TextView balance;
    public StockAdapter (Context ctx, Stock[] stocks, TextView Balance){
        this.context = ctx;

        this.stocks = stocks;
        inflater = LayoutInflater.from(ctx);
        this.balance = Balance;






    }


    @Override
    public int getCount() {
        return stocks.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int i, View view, ViewGroup parent) {
        view = inflater.inflate(R.layout.activity_stockview, null);
        TextView stockn = (TextView) view.findViewById(R.id.stockn);
        TextView stockp = (TextView) view.findViewById(R.id.stockp);
        Button buy = (Button) view.findViewById(R.id.buybutton);
        Button sell = (Button) view.findViewById(R.id.sellbutton);





            buy.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if (balance != null) {
                        if (Float.parseFloat(balance.getText().toString()) >= Float.parseFloat(stocks[i].getPrice())) {
                            Float value = Float.parseFloat(balance.getText().toString()) - Float.parseFloat(stocks[i].getPrice());
                            balance.setText(String.valueOf(value));
                            Toast.makeText(context.getApplicationContext(), stocks[i].getName() + " has been bought for " + stocks[i].getPrice() + ".", Toast.LENGTH_LONG).show();
                        } else {
                            Toast.makeText(context.getApplicationContext(), "You do not have enough balance.", Toast.LENGTH_SHORT).show();
                        }
                    } else {


                        Toast.makeText(context.getApplicationContext(), "Error accessing balance", Toast.LENGTH_SHORT).show();
                    }


//                float bal = Float.parseFloat(balance.getText().toString());
//                float a = parseFloat(stocks[i].getPrice());

//                if(bal >= a){
//                    bal = bal - a;
//                    balance.setText(String.valueOf(bal));
//                    Toast.makeText(context.getApplicationContext(), stocks[i].getName() + " has been bought for " + stocks[i].getPrice() + ".", Toast.LENGTH_LONG).show();
//
//                }
//                else{
//                    Toast.makeText(context.getApplicationContext(), "You do not have enough balance.", Toast.LENGTH_LONG).show();
//                }

//

                }
            });







            sell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Float value = Float.parseFloat(balance.getText().toString()) + Float.parseFloat(stocks[i].getPrice());
                    balance.setText(String.valueOf(value));
                    Toast.makeText(context.getApplicationContext(), stocks[i].getName() + " has been sold for " + stocks[i].getPrice() + ".", Toast.LENGTH_SHORT).show();

                }
            });




;

        stockn.setText(stocks[i].getName());
        stockp.setText(stocks[i].getPrice());
        return view;


    }
}
