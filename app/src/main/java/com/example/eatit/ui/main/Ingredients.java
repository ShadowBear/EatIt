package com.example.eatit.ui.main;

import java.util.UUID;

public interface Ingredients {

    public enum valueType { Kg, g, x,L, ml};
    public enum categoryType { Fish, Meat, Fruit, Vegetable, Nut, Corn, Herbs, Dairy, Fluid, Spices };
    public enum consistenceType { Fresh, Dried, Frozen, Cold, Stored };

    public int amount = 0;
    public valueType type = null;
    public String name = null;
    public categoryType category = null;
    public consistenceType consistence = null;
    public float pricePerPiece = 0;
    public UUID IngredientsId = UUID.randomUUID();



}
