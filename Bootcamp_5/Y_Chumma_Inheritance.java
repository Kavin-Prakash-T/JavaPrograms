/**
 * * This file is part of the Boot Camp project.
 * * File created for experimenting with Inheritance.
 * * Ignore this file 

 * @author Kavin Prakash T
 * @since 10-07-2025
 * @version 1.0
 */

class Vehicle {
  void run() {
    System.out.println("Vehicle is running.");
  }
}

class Car extends Vehicle {
  void run() {
    System.out.println("Car is running.");
  }
}

public class Y_Chumma_Inheritance {
  public static void main(String[] args) {
    Vehicle obj1 = new Car();
    obj1.run();

    Vehicle obj2 = new Vehicle();
    obj2.run();
  }
}