package structuraldesignpatterns.composite;

/*
 * In this class,there are many methods which are not applicable to accountant 
 * because it is a leaf node. 
 */
public class Accountant implements Employee {
  int id;
  String name;
  double salary;

  public Accountant(int id, String name, double salary) {
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
  }

  @Override
  public void add(Employee employee) {
    // this is leaf node so this method is not applicable to this class.
  }

  @Override
  public void remove(Employee employee) {
    // this is leaf node so this method is not applicable to this class.
  }

  @Override
  public Employee getChild(int i) {
    // this is leaf node so this method is not applicable to this class.
    return null;
  }
}
