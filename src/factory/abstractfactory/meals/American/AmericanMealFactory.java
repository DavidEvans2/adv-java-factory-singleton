package factory.abstractfactory.meals.American;

import factory.abstractfactory.meals.Meal;
import factory.abstractfactory.meals.MealFactory;

public class AmericanMealFactory implements MealFactory {
    @Override
    public Meal getMeal (String typeMeals){
        switch (typeMeals){
            case "Breakfast":
                return new Breakfast();
            case "Lunch":
                return new Lunch();
            case "Dinner":
                return new Dinner();
            default:
                return null;
        }
    }
}
