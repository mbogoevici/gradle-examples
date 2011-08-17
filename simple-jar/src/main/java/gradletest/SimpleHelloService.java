package gradletest;

/**
 * @author Marius Bogoevici
 */
public class SimpleHelloService implements HelloService {
  public String sayHello(String name) {
    return "Hello, " + name;
  }
}
