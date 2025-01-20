package main.java.monteur;

import java.util.ArrayList;

public interface Builder {
    void setSize(int size);
    void setBase(Base base);
    void setMeat(Meat meat);
    void setVegetables(Vegetable... vegetables);
}
