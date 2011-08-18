package multiproject.core;

import multiproject.api.Hello;

public class HelloService implements Hello {

    public String sayHello(String name) {
       return "Hello, " + name + "!";
    }
}
