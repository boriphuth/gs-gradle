package hello;

import java.util.logging.Logger;

import org.joda.time.LocalTime;

public class HelloWorld {
  public static void main(String[] args) {
    LocalTime currentTime = new LocalTime();
    Logger.getLogger("The current local time is: " + currentTime);

    Greeter greeter = new Greeter();
    Logger.getLogger(greeter.sayHello());
  }
}