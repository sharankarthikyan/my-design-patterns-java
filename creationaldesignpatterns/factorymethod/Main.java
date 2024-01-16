/*
 * Factory Method is a creational design pattern that provides an 
 * interface for creating objects in a superclass, but allows 
 * subclasses to alter the type of objects that will be created.
 * 
 * Use the Factory Method when you don’t know beforehand the exact 
 * types and dependencies of the objects your code should work with.
 * 
 * Use the Factory Method when you want to provide users of your 
 * library or framework with a way to extend its internal components.
 * 
 * Use the Factory Method when you want to save system resources by 
 * reusing existing objects instead of rebuilding them each time.
 */
public class Main {
  public static void main(String[] args) {
    ShapeFactory shapeFactory = new ShapeFactory();
    Shape circle = shapeFactory.getShape("circle");
    circle.draw();

    Shape rectangle = shapeFactory.getShape("rectangle");
    rectangle.draw();

    Shape square = shapeFactory.getShape("square");
    square.draw();
  }
}
