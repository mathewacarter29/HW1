package com.example.hw1;
import org.junit.Test;

import static org.junit.Assert.*;

public class BurgerTest {
    Burger burger = new Burger();

    @Test
    public void testAddBun() {
        assertNull(burger.getBun());
        burger.addBun("Wheat");
        assertEquals("Wheat", burger.getBun());

        burger.addBun("White");
        assertEquals("White", burger.getBun());
    }

    @Test
    public void testAddPatty() {
        assertNull(burger.getPatty());
        burger.addPatty("Beef");
        assertEquals("Beef", burger.getPatty());

        burger.addPatty("Chicken");
        assertEquals("Chicken", burger.getPatty());

        burger.addPatty("Turkey");
        assertEquals("Turkey", burger.getPatty());

        burger.addPatty("Salmon");
        assertEquals("Salmon", burger.getPatty());

        burger.addPatty("Veggie");
        assertEquals("Veggie", burger.getPatty());
    }

    @Test
    public void testAddTopping() {
        assertEquals(burger.getToppings().size(), 0);
        assertTrue(burger.addTopping("Mushroom"));
        assertEquals("Mushroom", burger.getToppings().get(0));

        assertFalse(burger.addTopping("Mushroom"));
        assertEquals(burger.getToppings().size(), 1);

        assertTrue(burger.addTopping("Lettuce"));
        assertTrue(burger.addTopping("Tomato"));
        assertEquals(burger.getToppings().size(), 3);
        assertEquals(burger.getToppings().get(1), "Lettuce");
        assertEquals(burger.getToppings().get(2), "Tomato");

        assertFalse(burger.addTopping("Pickle"));
    }

    @Test
    public void testRemoveTopping() {
        burger.addTopping("Mayo");
        burger.addTopping("Mustard");

        assertFalse(burger.removeTopping("Pickle"));

        assertTrue(burger.removeTopping("Mayo"));
        assertEquals(burger.getToppings().size(), 1);
        assertEquals(burger.getToppings().get(0), "Mustard");
    }
}
