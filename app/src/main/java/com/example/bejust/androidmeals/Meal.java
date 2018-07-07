package com.example.bejust.androidmeals;


public class Meal {
    public String strMeal, strMealThumb, strInstructions, strArea, strCategory, strTags, strYoutube;
    public String strIngredient1;

    public Meal(){}

    public Meal(String strMeal, String strMealThumb, String strInstructions, String strArea, String strCategory, String strTags, String strYoutube, String strIngredient1) {
        this.strMeal = strMeal;
        this.strMealThumb = strMealThumb;
        this.strInstructions = strInstructions;
        this.strArea = strArea;
        this.strCategory = strCategory;
        this.strTags = strTags;
        this.strYoutube = strYoutube;
        this.strIngredient1 = strIngredient1;
    }

    public String getstrMeal() {
        return strMeal;
    }

    public void setstrMeal(String strMeal) {
        this.strMeal = strMeal;
    }

    public String getstrMealThumb() {
        return strMealThumb;
    }

    public void setstrMealThumb(String strMealThumb) {
        this.strMealThumb = strMealThumb;
    }

    public String getstrInstructions() {
        return strInstructions;
    }

    public void setstrInstructions(String strInstructions) {
        this.strInstructions = strInstructions;
    }

    public String getstrArea() {
        return strArea;
    }

    public void setstrArea(String strArea) {
        this.strArea = strArea;
    }

    public String getstrCategory() {
        return strCategory;
    }

    public void setstrCategory(String strCategory) {
        this.strCategory = strCategory;
    }

    public String getstrTags() {
        return strTags;
    }

    public void setstrTags(String strTags) {
        this.strTags = strTags;
    }

    public String getstrYoutube() {
        return strYoutube;
    }

    public void setstrYoutube(String strYoutube) {
        this.strYoutube = strYoutube;
    }

    public String getstrIngredient1() {
        return strIngredient1;
    }

    public void setstrIngredient1(String strIngredient1) {
        this.strIngredient1 = strIngredient1;
    }
}
