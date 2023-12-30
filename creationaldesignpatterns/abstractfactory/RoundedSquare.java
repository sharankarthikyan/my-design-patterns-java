package creationaldesignpatterns.abstractfactory;

public class RoundedSquare implements Shape {
  
  @Override
  public void draw() {
    System.out.println("This is rounded square...");
  }
}
