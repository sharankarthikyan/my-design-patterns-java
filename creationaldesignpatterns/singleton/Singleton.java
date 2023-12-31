package creationaldesignpatterns.singleton;

public class Singleton {
  /*
   * The volatile keyword is typically used in multithreaded applications 
   * where data is shared between threads. When a thread updates a volatile 
   * variable, it must also ensure that the updated value is visible to all 
   * other threads. The volatile keyword ensures this by forcing all threads 
   * to read the variable from main memory, rather than from their local caches.
   */
  private volatile static Singleton instance = null;

  private Singleton() {
  }

  public static Singleton getInstance() {
    // Double Checked Locking for multi threading environment
    // Single Checked 
    if (instance == null) {
      synchronized (Singleton.class) {
        // Double checked
        if (instance == null) {
          instance = new Singleton();
        }
      }
    }
    return instance;
  }

  public void showMessage() {
    System.out.println("Hello");
  }
}
