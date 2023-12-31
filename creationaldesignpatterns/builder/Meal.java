package creationaldesignpatterns.builder;

import java.util.*;

public class Meal {
  private List<FoodItem> foodItems = new ArrayList<>();

  public void addItem(FoodItem item) {
    foodItems.add(item);
  }

  public float getCost() {
    float cost = 0.00f;

    for (FoodItem item : foodItems) {
      cost += item.price();
    }

    return cost;
  }

  public void showItems() {
    for (FoodItem item : foodItems) {
      System.out.print("Name: " + item.name());
      System.out.print(", Packing: " + item.packing().pack());
      System.out.println(", Price: " + item.price());
    }
  }
}
