package factory.abstractfactory.meals.American;
import factory.abstractfactory.meals.Meal;

public class Lunch implements Meal {
    private String foodLabel;

    public Lunch(){
        foodLabel = "America's Diner Double \n 100% beef burger with American cheese, " +
                "caramelized onions and new All-American sauce on a brioche bun. Served with wavy-cut fries.";
    }
    @Override
    public void displayMeal(){
        System.out.println(foodLabel);
    }
}
