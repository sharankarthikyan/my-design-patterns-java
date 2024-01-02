package structuraldesignpatterns.bridge;

/*
 * The bridge pattern allows the Abstraction and the Implementation
 * to be developed independently and the client code can access only 
 * the Abstraction part without being concerned about the Implementation part.
 * 
 * It increases the loose coupling between class abstraction and it’s implementation.
 * 
 * Use the Bridge pattern when you want to divide and organize a monolithic 
 * class that has several variants of some functionality 
 * (for example, if the class can work with various database servers).
 * 
 * Use the pattern when you need to extend a class in several orthogonal (independent) dimensions.
 * 
 * Use the Bridge if you need to be able to switch implementations at runtime.
 */
public class Main {
  public static void main(String[] args) {
    Shape redCircle = new Circle(4, 2, 2, new RedCircle());
    redCircle.draw();

    Shape blueCircle = new Circle(4, 2, 2, new BlueCircle());
    blueCircle.draw();
  }
}
