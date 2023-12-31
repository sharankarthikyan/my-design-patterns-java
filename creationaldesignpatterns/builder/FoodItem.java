package creationaldesignpatterns.builder;

public interface FoodItem {
  public String name();
  public Packing packing();
  public float price();
}
