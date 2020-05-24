package factory.abstractfactory.meals.American;
import factory.abstractfactory.meals.Meal;

public class Breakfast implements Meal {
    private String foodLabel;
    private int calories;

    public Breakfast() {
        foodLabel = "Grand Slam Breakfast \n " + "Scrambled eggs, sausage, bacon, ham and American cheese " +
                "on potato bread grilled with a maple spice spread. Served with hash browns.";
        calories = 1150;
    }

        @Override
        public void displayMeal(){
            System.out.println(foodLabel);
        }
    }
