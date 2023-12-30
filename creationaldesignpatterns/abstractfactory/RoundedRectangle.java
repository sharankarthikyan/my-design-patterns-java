package creationaldesignpatterns.abstractfactory;

public class RoundedRectangle implements Shape {
  
  @Override
  public void draw() {
    System.out.println("This is rounded rectangle...");
  }
}
