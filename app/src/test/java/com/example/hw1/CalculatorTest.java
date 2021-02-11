package com.example.hw1;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    public void testSetBunPrice() {
        calc.setBunPrice(1.00);
        assertEquals(1.00, calc.getBunPrice(), 0.001);
    }

    @Test
    public void testSetPattyPrice() {
        calc.setPattyPrice(5.50);
        assertEquals( 5.50, calc.getPattyPrice(), 0.001);
    }

    @Test
    public void testToppingsPrice() {
        calc.addToppingsPrice(0.50);
        assertEquals( 0.50, calc.getToppingsPrice(), 0.001);

        calc.subtractToppingsPrice(0.25);
        assertEquals( 0.25, calc.getToppingsPrice(), 0.001);
    }

    @Test
    public void testSetBunCal() {
        calc.setBunCal(100);
        assertEquals( 100, calc.getBunCal());
    }

    @Test
    public void testSetPattyCal() {
        calc.setPattyCal(500);
        assertEquals( 500, calc.getPattyCal());
    }

    @Test
    public void testToppingsCal() {
        calc.addToppingsCal(50);
        assertEquals( 50, calc.getToppingsCal());

        calc.subtractToppingsCal(25);
        assertEquals( 25, calc.getToppingsCal());
    }

    @Test
    public void testGetPrice() {
        calc.setBunPrice(1.00);
        calc.setPattyPrice(5.50);
        calc.addToppingsPrice(0.50);
        assertEquals( 7.00, calc.getPrice(), 0.001);
    }

    @Test
    public void testGetCals() {
        calc.setBunCal(100);
        calc.setPattyCal(550);
        calc.addToppingsCal(30);
        calc.addToppingsCal(15);
        assertEquals(695, calc.getCals());
    }
}
