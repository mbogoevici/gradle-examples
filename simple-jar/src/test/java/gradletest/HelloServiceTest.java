package gradletest;

import org.junit.Test;
import org.junit.Assert;

/**
 * @author Marius Bogoevici
 */
public class HelloServiceTest {

  @Test
  public void testHelloService() {
     HelloService helloService = new SimpleHelloService();
     String message = helloService.sayHello("world");
     Assert.assertEquals("Hello, world", message);
  }
}
