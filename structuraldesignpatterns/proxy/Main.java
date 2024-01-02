package structuraldesignpatterns.proxy;

/*
 *
 * Proxy is a structural design pattern that lets you provide a substitute or 
 * placeholder for another object. A proxy controls access to the original object, 
 * allowing you to perform something either before or after the request gets 
 * through to the original object.
 * 
 * Lazy initialization (virtual proxy). This is when you have a heavyweight 
 * service object that wastes system resources by being always up, even though 
 * you only need it from time to time.
 * Instead of creating the object when the app launches, you can delay the 
 * object’s initialization to a time when it’s really needed.
 * 
 * Local execution of a remote service (remote proxy). This is when the service 
 * object is located on a remote server. 
 * In this case, the proxy passes the client request over the network, handling 
 * all of the nasty details of working with the network.
 * 
 * Caching request results (caching proxy). This is when you need to cache results 
 * of client requests and manage the life cycle of this cache, especially if results 
 * are quite large.
 * The proxy can implement caching for recurring requests that always yield the same results. 
 * The proxy may use the parameters of requests as the cache keys.
 */
public class Main {
  public static void main(String[] args) {
    Image image = new ProxyImage("abc.jpg");
    image.display();
    System.out.println();
    image.display();
  }
}
