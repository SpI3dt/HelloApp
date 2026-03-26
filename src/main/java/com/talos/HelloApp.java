package com.talos;

/**
 * Hello world!
 * Implemented using a condition where if no argument is given, name is assigned as world and hello world is printed
 * @author Siddharth B
 * @version 3.0
 * @since UC1
 * 
 */

public class HelloApp {
    public static void main(String[] args) {

        String name;

        if (args.length > 0) {
            name = args[0];
        } else {
            name = "World";
        }

        System.out.println("Hello " + name);
    }
}
