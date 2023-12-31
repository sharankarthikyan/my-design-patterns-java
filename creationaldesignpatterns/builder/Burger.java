package creationaldesignpatterns.builder;

public abstract class Burger implements FoodItem {
  
  @Override
  public Packing packing() {
    return new Wrapper();
  }
}
