package creationaldesignpatterns.builder;

/*
 * Builder is a creational design pattern that lets you construct 
 * complex objects step by step. The pattern allows you to produce 
 * different types and representations of an object using the same 
 * construction code.
 * 
 * Use the Builder pattern when you want your code to be able to 
 * create different representations of some product (for example, 
 * stone and wooden houses).
 * 
 * Use the Builder to construct Composite trees or other complex 
 * objects.
 */
public class Main {
  public static void main(String[] args) {
    MealBuilder mealBuilder = new MealBuilder();

    Meal vegMeal = mealBuilder.prepareVegMeal();
    System.out.println("=============== Veg Meal ===============");
    vegMeal.showItems();
    System.out.println("Total cost: " + vegMeal.getCost());

    Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
    System.out.println("=============== Non Veg Meal ===============");
    nonVegMeal.showItems();
    System.out.println("Total cost: " + nonVegMeal.getCost());
  }
}
