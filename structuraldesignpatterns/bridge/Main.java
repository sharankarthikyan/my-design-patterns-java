package structuraldesignpatterns.bridge;

/*
 * The bridge pattern allows the Abstraction and the Implementation
 * to be developed independently and the client code can access only 
 * the Abstraction part without being concerned about the Implementation part.
 * 
 * It increases the loose coupling between class abstraction and it’s implementation.
 */
public class Main {
  public static void main(String[] args) {
    Shape redCircle = new Circle(4, 2, 2, new RedCircle());
    redCircle.draw();

    Shape blueCircle = new Circle(4, 2, 2, new BlueCircle());
    blueCircle.draw();
  }
}
