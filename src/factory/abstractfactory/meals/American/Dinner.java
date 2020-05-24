package factory.abstractfactory.meals.American;
import factory.abstractfactory.meals.Meal;

public class Dinner implements Meal {
    private String foodLabel;

    public Dinner() {
        foodLabel = " Crazy Spicy Sizzlin' Skillet \n" +
                "Chorizo sausage, fire-roasted bell peppers & onions, mushrooms, " +
                "jalapeños and seasoned red-skinned potatoes. \n" +
                "Topped with grilled seasoned chicken breast, " +
                "Cheddar cheese, a spicy five pepper sauce and Pepper Jack queso.";
    }
    @Override
    public void displayMeal(){
        System.out.println(foodLabel);
    }
}
