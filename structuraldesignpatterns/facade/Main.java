package structuraldesignpatterns.facade;

/*
 * Facade is a structural design pattern that provides a simplified 
 * interface to a library, a framework, or any other complex set of classes.
 * 
 * Use the Facade pattern when you need to have a limited but 
 * straightforward interface to a complex subsystem.
 * 
 * Use the Facade when you want to structure a subsystem into layers.
 */
public class Main {
  public static void main(String[] args) {
    ShapeMaker shapeMaker = new ShapeMaker();
    shapeMaker.drawCircle();
    shapeMaker.drawRectangle();
    shapeMaker.drawSquare();
  }
}
