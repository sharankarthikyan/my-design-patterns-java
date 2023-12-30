package creationaldesignpatterns.abstractfactory;

public class Square implements Shape {
  
  @Override
  public void draw() {
    System.out.println("This is square...");
  }
}
