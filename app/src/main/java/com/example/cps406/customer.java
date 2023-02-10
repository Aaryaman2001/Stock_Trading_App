package com.example.cps406;

import static java.lang.Float.parseFloat;

import java.util.ArrayList;
import java.util.List;

class Customer implements Actor {
    private float balance;
    private String name;
    private List<Stock> bought;
    private List<Stock> sold;

    public Customer(float balance, String name, String information) {
        this.balance = balance;
        this.name = name;

        this.bought = new ArrayList<Stock>();
        this.sold = new ArrayList<Stock>();
    }

    @Override
    public float getBalance() {

        return balance;
    }

    @Override
    public void setBalance(float balance) {

        this.balance = balance;
    }

    @Override
    public String getName() {

        return name;
    }

    @Override
    public void setName(String name) {

        this.name = name;
    }



    public void buy(Stock stock) {
        if (balance >= parseFloat(stock.getPrice())) {
            balance -= parseFloat(stock.getPrice());
            bought.add(stock);
        }
    }

    public void sell(Stock stock) {
        if (bought.contains(stock)) {
            balance += parseFloat(stock.getPrice());
            bought.remove(stock);
            bought.add(stock);
        }
    }
}
