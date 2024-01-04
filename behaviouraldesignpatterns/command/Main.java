package behaviouraldesignpatterns.command;

/*
 * Command is a behavioral design pattern that turns a 
 * request into a stand-alone object that contains all 
 * information about the request. This transformation 
 * lets you parameterize methods with different requests, 
 * delay or queue a request’s execution, and support undoable 
 * operations.
 * 
 * Use the Command pattern when you want to parametrize 
 * objects with operations.
 * 
 * Use the Command pattern when you want to queue operations, 
 * schedule their execution, or execute them remotely.
 * 
 * Use the Command pattern when you want to implement reversible 
 * operations.
 */
public class Main {
  public static void main(String[] args) {
    Stock abcStock = new Stock("ABC", 10);

    BuyStock buyAbcStock = new BuyStock(abcStock);
    SellStock sellAbcStock = new SellStock(abcStock);

    Broker broker = new Broker();
    broker.takeOrder(buyAbcStock);
    broker.takeOrder(sellAbcStock);

    broker.placeOrders();
  }
}
