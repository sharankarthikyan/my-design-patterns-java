package creationaldesignpatterns.builder;

public abstract class ColdDrink implements FoodItem {
  
  @Override
  public Packing packing() {
    return new Bottle();
  }
}
