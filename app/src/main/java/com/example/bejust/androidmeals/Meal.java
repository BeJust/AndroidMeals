package com.example.bejust.androidmeals;


import java.util.Map;

public class Meal {
    public String mealName, mealImage, mealInstructions, mealArea, mealCategory, mealTags, mealYoutube;
    public Map<String,String> ingredients;

    public Meal(){}

    public Meal(String mealName, String mealImage, String mealInstructions, String mealArea, String mealCategory, String mealTags, String mealYoutube, Map<String, String> ingredients) {
        this.mealName = mealName;
        this.mealImage = mealImage;
        this.mealInstructions = mealInstructions;
        this.mealArea = mealArea;
        this.mealCategory = mealCategory;
        this.mealTags = mealTags;
        this.mealYoutube = mealYoutube;
        this.ingredients = ingredients;
    }

    public String getMealName() {
        return mealName;
    }

    public void setMealName(String mealName) {
        this.mealName = mealName;
    }

    public String getMealImage() {
        return mealImage;
    }

    public void setMealImage(String mealImage) {
        this.mealImage = mealImage;
    }

    public String getMealInstructions() {
        return mealInstructions;
    }

    public void setMealInstructions(String mealInstructions) {
        this.mealInstructions = mealInstructions;
    }

    public String getMealArea() {
        return mealArea;
    }

    public void setMealArea(String mealArea) {
        this.mealArea = mealArea;
    }

    public String getMealCategory() {
        return mealCategory;
    }

    public void setMealCategory(String mealCategory) {
        this.mealCategory = mealCategory;
    }

    public String getMealTags() {
        return mealTags;
    }

    public void setMealTags(String mealTags) {
        this.mealTags = mealTags;
    }

    public String getMealYoutube() {
        return mealYoutube;
    }

    public void setMealYoutube(String mealYoutube) {
        this.mealYoutube = mealYoutube;
    }

    public Map<String, String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Map<String, String> ingredients) {
        this.ingredients = ingredients;
    }
}
