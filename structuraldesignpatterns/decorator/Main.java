package structuraldesignpatterns.decorator;

/*
 *
 * Decorator is a structural design pattern that lets you attach new behaviors 
 * to objects by placing these objects inside special wrapper objects that 
 * contain the behaviors.
 *  
 * Use the Decorator pattern when you need to be able to assign extra behaviors 
 * to objects at runtime without breaking the code that uses these objects.
 * 
 * Use the pattern when it’s awkward or not possible to extend an object’s 
 * behavior using inheritance.
 */
public class Main {
  public static void main(String[] args) {
    Shape circle = new Circle();

    Shape redCircle = new RedShapeDecorator(new Circle());

    Shape redRectangle = new RedShapeDecorator(new Rectangle());
    System.out.println("Circle with normal border");
    circle.draw();

    System.out.println("\nCircle of red border");
    redCircle.draw();

    System.out.println("\nRectangle of red border");
    redRectangle.draw();
  }
}
