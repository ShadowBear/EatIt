package com.example.eatit.ui.main;

import java.util.List;
import java.util.UUID;

public class Meal {

    public UUID Id;
    public enum MealType { Vegan, Bio, Fruit, Meat, Glutenfree, Lactosefree, Fish, Veggie, Fast, Healthy, Heavy, FamilyDinner, Light};
    public enum MealAmount { Large, Medium, Small, Aperitif, Dessert, Snack};
    public enum MealDayType { Lunch, Dinner, Breakfast};
    public List<Ingredients> MealIngredients;
    public String name;
    public float rating;
    public float menuPrice;
    public int ingredientsAmount;
    public int cookingTime;
    public int prepareTime;
    public float healthiness;
    public List<MealType> mealTypeList;

    public Meal(List<Ingredients> mealIngredients, String name, float rating, float menuPrice, int ingredientsAmount, int cookingTime, int prepareTime, float healthiness, List<MealType> mealTypeList) {
        Id = UUID.randomUUID();
        MealIngredients = mealIngredients;
        this.name = name;
        this.rating = rating;
        this.menuPrice = menuPrice;
        this.ingredientsAmount = ingredientsAmount;
        this.cookingTime = cookingTime;
        this.prepareTime = prepareTime;
        this.healthiness = healthiness;
        this.mealTypeList = mealTypeList;
    }

    public int GetMealPrice(){
        return 0;
    }
}
