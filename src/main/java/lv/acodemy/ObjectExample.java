package lv.acodemy;

import lv.acodemy.object.Car;
import lv.acodemy.object.Dog;

public class ObjectExample {
    public static void main(String[] args) {

        //Encapsulation
        //Inheritance
        // Polymorphism
        // Abstraction

        Car audi = new Car("blue","RS6");
        audi.start();
        System.out.println(audi);

//        audi.color = "Blue";
//        audi.model = "RS6";
        audi.setColor ("Blue");
        audi.setModel ("RS6");

        System.out.println(audi);

        // Create BMW object
        // Start you BMW
        //Set color and model

        Car bmw = new Car();
        bmw.start();
        bmw.setColor ("Bleck");
        bmw.setModel("STOSHKA");
        System.out.println(bmw);

        //print text: My car model is %s, and color is: &s

        System.out.println(String.format("My car model is %s, and color is: %s", audi.getModel(), audi.getColor()));
        System.out.println(String.format("My car model is %s, and color is: %s", bmw.getModel(), bmw.getColor()));
        System.out.println( "My car model is: " + audi.getModel() + " and color is: " + audi.getColor());

        Dog theSharik = new Dog();
        theSharik.bark();
        theSharik.eat();



    }
}
