package com.example.hw1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    private RadioButton whiteRB, wheatRB, beefRB, chickenRB, turkeyRB, salmonRB, veggieRB;
    private CheckBox mushroomCB, mayoCB, lettuceCB, tomatoCB, pickleCB, mustardCB;

    private EditText numBurgers;
    private TextView price, calories;

    private Burger burger;
    private Calculator calc;
    private int burgerNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.burger = new Burger();
        this.calc = new Calculator();
        this.burgerNum = 1;
    }


    public void whiteRbAction(View view) {
        whiteRB = (RadioButton) findViewById(R.id.whiteRB);

        if (whiteRB.isChecked()) {
            burger.addBun("White");
            calc.setBunPrice(1.00);
            calc.setBunCal(140);
        }
        this.update();
    }

    public void wheatRbAction(View view) {
        wheatRB = (RadioButton) findViewById(R.id.wheatRB);

        if (wheatRB.isChecked()) {
            burger.addBun("Wheat");
            calc.setBunPrice(1.00);
            calc.setBunCal(100);
        }
        this.update();
    }

    public void beefRbAction(View view) {
        beefRB = (RadioButton) findViewById(R.id.beefRB);

        if (beefRB.isChecked()) {
            burger.addPatty("Beef");
            calc.setPattyPrice(5.50);
            calc.setPattyCal(240);
        }
        this.update();
    }

    public void chickenRbAction(View view) {
        chickenRB = (RadioButton) findViewById(R.id.chickenRB);

        if (chickenRB.isChecked()) {
            burger.addPatty("Chicken");
            calc.setPattyPrice(5.00);
            calc.setPattyCal(180);
        }
        this.update();
    }

    public void turkeyRbAction(View view) {
        turkeyRB = (RadioButton) findViewById(R.id.turkeyRB);

        if (turkeyRB.isChecked()) {
            burger.addPatty("Turkey");
            calc.setPattyPrice(5.00);
            calc.setPattyCal(190);
        }
        this.update();
    }

    public void salmonRbAction(View view) {
        salmonRB = (RadioButton) findViewById(R.id.salmonRB);

        if (salmonRB.isChecked()) {
            burger.addPatty("Salmon");
            calc.setPattyPrice(7.50);
            calc.setPattyCal(95);
        }
        this.update();
    }

    public void veggieRbAction(View view) {
        veggieRB = (RadioButton) findViewById(R.id.veggieRB);

        if (veggieRB.isChecked()) {
            burger.addPatty("Veggie");
            calc.setPattyPrice(4.50);
            calc.setPattyCal(80);
        }
        this.update();
    }

    public void mushroomCbAction(View view) {
        mushroomCB = (CheckBox) findViewById(R.id.mushroomCB);

        if (mushroomCB.isChecked()) {
            if (burger.addTopping("Mushroom")) {
                calc.addToppingsPrice(1.00);
                calc.addToppingsCal(60);
            }
            else {
                Toast.makeText(this,"Only 3 Toppings Allowed", Toast.LENGTH_SHORT).show();
                mushroomCB.toggle();
            }
        }
        else {
            burger.removeTopping("Mushroom");
            calc.subtractToppingsPrice(1.00);
            calc.subtractToppingsCal(60);
        }
        this.update();
    }

    public void lettuceCbAction(View view) {
        lettuceCB = (CheckBox) findViewById(R.id.lettuceCB);

        if (lettuceCB.isChecked()) {
            if (burger.addTopping("Lettuce")) {
                calc.addToppingsPrice(0.30);
                calc.addToppingsCal(20);
            }
            else {
                Toast.makeText(this,"Only 3 Toppings Allowed", Toast.LENGTH_SHORT).show();
                lettuceCB.toggle();
            }
        }
        else {
            burger.removeTopping("Lettuce");
            calc.subtractToppingsPrice(0.30);
            calc.subtractToppingsCal(20);
        }
        this.update();
    }

    public void tomatoCbAction(View view) {
        tomatoCB = (CheckBox) findViewById(R.id.tomatoCB);

        if (tomatoCB.isChecked()) {
            if (burger.addTopping("Tomato")) {
                calc.addToppingsPrice(0.30);
                calc.addToppingsCal(20);
            }
            else {
                Toast.makeText(this,"Only 3 Toppings Allowed", Toast.LENGTH_SHORT).show();
                tomatoCB.toggle();
            }
        }
        else {
            burger.removeTopping("Tomato");
            calc.subtractToppingsPrice(0.30);
            calc.subtractToppingsCal(20);
        }
        this.update();
    }

    public void pickleCbAction(View view) {
        pickleCB = (CheckBox) findViewById(R.id.pickleCB);

        if (pickleCB.isChecked()) {
            if (burger.addTopping("Pickle")) {
                calc.addToppingsPrice(0.50);
                calc.addToppingsCal(30);
            }
            else {
                Toast.makeText(this,"Only 3 Toppings Allowed", Toast.LENGTH_SHORT).show();
                pickleCB.toggle();
            }
        }
        else {
            burger.removeTopping("Pickle");
            calc.subtractToppingsPrice(0.50);
            calc.subtractToppingsCal(30);
        }
        this.update();
    }

    public void mayoCbAction(View view) {
        mayoCB = (CheckBox) findViewById(R.id.mayoCB);

        if (mayoCB.isChecked()) {
            if (burger.addTopping("Mayo")) {
                calc.addToppingsCal(100);
            }
            else {
                Toast.makeText(this,"Only 3 Toppings Allowed", Toast.LENGTH_SHORT).show();
                mayoCB.toggle();
            }
        }
        else {
            burger.removeTopping("Mayo");
            calc.subtractToppingsCal(100);
        }
        this.update();
    }

    public void mustardCbAction(View view) {
        mustardCB = (CheckBox) findViewById(R.id.mustardCB);

        if (mustardCB.isChecked()) {
            if (burger.addTopping("Mustard")) {
                calc.addToppingsCal(60);
            }
            else {
                Toast.makeText(this,"Only 3 Toppings Allowed", Toast.LENGTH_SHORT).show();
                mustardCB.toggle();
            }
        }
        else {
            burger.removeTopping("Mustard");
            calc.subtractToppingsCal(60);
        }
        this.update();
    }

    public void findNumBurgers(View view) {
        numBurgers = (EditText) findViewById(R.id.burgerNum);
        if (numBurgers.getText().length() == 0) {
            burgerNum = 1;
        }
        else {
            burgerNum = Integer.valueOf(numBurgers.getText().toString());
        }

        if (burgerNum >= 100) {
            Toast.makeText(this, "Too Many Burgers", Toast.LENGTH_SHORT).show();
            burgerNum = 1;
            numBurgers.setText("1", TextView.BufferType.EDITABLE);
        }
        this.update();
    }

    public void update() {
        price = (TextView) findViewById(R.id.priceNum);
        calories = (TextView) findViewById(R.id.calorieNum);

        double totalPrice = this.calc.getPrice() * burgerNum;
        totalPrice = Math.round(totalPrice * 100.0) / 100.0;


        price.setText(String.valueOf(totalPrice + "0"), TextView.BufferType.NORMAL);
        calories.setText(String.valueOf(this.calc.getCals() * burgerNum), TextView.BufferType.NORMAL);
    }
}