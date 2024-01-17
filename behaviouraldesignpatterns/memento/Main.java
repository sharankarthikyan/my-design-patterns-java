package behaviouraldesignpatterns.memento;

/*
 * Memento is a behavioral design pattern that lets you save and 
 * restore the previous state of an object without revealing the 
 * details of its implementation.
 * 
 * Use the Memento pattern when you want to produce snapshots of 
 * the object’s state to be able to restore a previous state of 
 * the object.
 * 
 * Use the pattern when direct access to the object’s fields/geters/setters 
 * violates its encapsulation.
 */
public class Main {
  public static void main(String[] args) {
    Originator originator = new Originator();
    CareTaker careTaker = new CareTaker();

    originator.setState("State #1");
    originator.setState("State #2");
    careTaker.add(originator.saveStateToMemento());

    originator.setState("State #3");
    careTaker.add(originator.saveStateToMemento());

    originator.setState("State #4");
    System.out.println("Current State: " + originator.getState());

    originator.getStateFromMemento(careTaker.get(0));
    System.out.println("First saved State: " + originator.getState());
    originator.getStateFromMemento(careTaker.get(1));
    System.out.println("Second saved State: " + originator.getState());
  }
}
