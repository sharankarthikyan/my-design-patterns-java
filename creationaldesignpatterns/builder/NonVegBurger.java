package creationaldesignpatterns.builder;

public class NonVegBurger extends Burger {

  @Override
  public String name() {
    return "Non Veg Burger";
  }

  @Override
  public float price() {
    return 100.0f;
  }
}
