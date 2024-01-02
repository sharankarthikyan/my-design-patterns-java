package structuraldesignpatterns.composite;

/*
 * Composite is a structural design pattern that lets you compose objects 
 * into tree structures and then work with these structures as if they were 
 * individual objects.
 * 
 * Use the Composite pattern when you have to implement a tree-like object structure.
 * Use the pattern when you want the client code to treat both simple and complex elements uniformly.
 */
public class Main {
  public static void main(String[] args) {
    Employee emp1 = new Cashier(101, "Sohan Kumar", 20000.0);
    Employee emp2 = new Cashier(102, "Mohan Kumar", 25000.0);
    Employee emp3 = new Accountant(103, "Seema Mahiwal", 30000.0);
    Employee manager1 = new BankManager(100, "Ashwani Rajput", 100000.0);

    manager1.add(emp1);
    manager1.add(emp2);
    manager1.add(emp3);
    manager1.print();
  }
}
