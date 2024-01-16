package creationaldesignpatterns.abstractfactory;

/*
 * Abstract Factory is a creational design pattern that lets you 
 * produce families of related objects without specifying their 
 * concrete classes.
 * 
 * Use the Abstract Factory when your code needs to work with various 
 * families of related products, but you don’t want it to depend on 
 * the concrete classes of those products—they might be unknown beforehand 
 * or you simply want to allow for future extensibility.
 */
public class Main {
  public static void main(String[] args) {
    AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
    Shape shape1 = shapeFactory.getShape("RECTANGLE");
    shape1.draw();
    Shape shape2 = shapeFactory.getShape("SQUARE");
    shape2.draw();

    AbstractFactory roundedShapeFactory = FactoryProducer.getFactory(true);
    Shape shape3 = roundedShapeFactory.getShape("RECTANGLE");
    shape3.draw();
    Shape shape4 = roundedShapeFactory.getShape("SQUARE");
    shape4.draw();
  }
}
