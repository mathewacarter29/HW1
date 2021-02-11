package com.example.hw1;

import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Burger {

    private String bun;
    private String patty;
    private ArrayList<String> toppings;
    private final int MAX_TOPPINGS = 3;

    public Burger() {
        this.bun = null;
        this.patty = null;
        this.toppings = new ArrayList<String>();
    }

    public void addBun(String bunType) {
        this.bun = bunType;
    }

    public void addPatty(String pattyType) {
        this.patty = pattyType;
    }

    public boolean addTopping(String topping) {
        if (this.toppings.size() < MAX_TOPPINGS && !this.toppings.contains(topping)) {
            this.toppings.add(topping);
            return true;
        }
        else {
            return false;
        }
    }

    public boolean removeTopping(String topping) {
        return this.toppings.remove(topping);
    }

    public String getBun() {
        return this.bun;
    }

    public String getPatty() {
        return this.patty;
    }

    public ArrayList<String> getToppings() {
        return this.toppings;
    }


}