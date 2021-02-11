package com.example.hw1;

public class Calculator {

    private double bunPrice;
    private double pattyPrice;
    private double toppingsPrice;

    private int bunCal;
    private int pattyCal;
    private int toppingsCal;

    public Calculator() {
        this.bunPrice = 0.00;
        this.pattyPrice = 0.00;
        this.toppingsPrice = 0.00;

        this.bunCal = 0;
        this.pattyCal = 0;
        this.toppingsCal = 0;
    }

    public void setBunPrice(double bunPrice) {
        this.bunPrice = bunPrice;
    }

    public double getBunPrice() {
        return bunPrice;
    }

    public void setPattyPrice(double pattyPrice) {
        this.pattyPrice = pattyPrice;
    }

    public double getPattyPrice() {
        return this.pattyPrice;
    }

    public double getToppingsPrice() {
        return this.toppingsPrice;
    }

    public void addToppingsPrice(double price) {
        this.toppingsPrice += price;
    }

    public void subtractToppingsPrice(double price) {
        this.toppingsPrice -= price;
    }

    public void setBunCal(int cals) {
        this.bunCal = cals;
    }

    public int getBunCal() {
        return this.bunCal;
    }

    public void setPattyCal(int cals) {
        this.pattyCal = cals;
    }

    public int getPattyCal() {
        return this.pattyCal;
    }

    public void addToppingsCal(int cals) {
        this.toppingsCal += cals;
    }

    public void subtractToppingsCal(int cals) {
        this.toppingsCal -= cals;
    }

    public int getToppingsCal() {
        return this.toppingsCal;
    }

    public double getPrice() {
        return this.bunPrice + this.pattyPrice + this.toppingsPrice;
    }

    public int getCals() {
        return this.bunCal + this.pattyCal + this.toppingsCal;
    }
}
