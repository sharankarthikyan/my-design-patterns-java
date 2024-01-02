package structuraldesignpatterns.composite;

import java.util.*;

/*
 * This is the BankManager class i.e. Composite.  
 */
public class BankManager implements Employee {
  int id;
  String name;
  double salary;

  List<Employee> employees = new ArrayList<Employee>();

  public BankManager(int id, String name, double salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
  }

  @Override
  public int getId() {
    return id;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public double getSalary() {
    return salary;
  }

  @Override
  public void print() {
    System.out.println("===========================");
    System.out.println("Id = " + getId());
    System.out.println("Name = " + getName());
    System.out.println("Salary = " + getSalary());
    System.out.println("===========================");

    Iterator<Employee> it = employees.iterator();

    while (it.hasNext()) {
      Employee employee = it.next();
      employee.print();
    }
  }

  @Override
  public void add(Employee employee) {
    employees.add(employee);
  }

  @Override
  public void remove(Employee employee) {
    employees.remove(employee);
  }

  @Override
  public Employee getChild(int i) {
    return employees.get(i);
  }

}
