package creationaldesignpatterns.builder;

// The actual builder class responsible to create Meal objects
public class MealBuilder {
  public Meal prepareVegMeal() {
    Meal meal = new Meal();
    FoodItem vegBurger = new VegBurger();
    meal.addItem(vegBurger);
    FoodItem coke = new Coke();
    meal.addItem(coke);
    return meal;
  }

  public Meal prepareNonVegMeal() {
    Meal meal = new Meal();
    FoodItem nonVegBurger = new NonVegBurger();
    meal.addItem(nonVegBurger);
    FoodItem pepsi = new Pepsi();
    meal.addItem(pepsi);
    return meal;
  }
}
