package ru.oleg520.kitchen;

import ru.oleg520.Tablet;

import java.io.IOException;
import java.util.ArrayList;

public class TestOrder extends Order {
    public TestOrder(Tablet tablet) throws IOException {
        super(tablet);
    }

    protected void initDishes() throws IOException {
        this.dishes = new ArrayList<>();

        Dish[] values = Dish.values();
        int countDishes = (int) (Math.random() * 3 + 2);
        for (int i = 0; i < countDishes; i++) {
            int dishIndex = (int) (Math.random() * values.length);
            dishes.add(values[dishIndex]);
        }
    }

}
