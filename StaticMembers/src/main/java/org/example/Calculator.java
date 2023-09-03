package org.example;

public class Calculator {

    public static final Double PI = 3.14159;

    public static Double circumference(Double radius){
        return 2.0 * PI * radius;
    }
    public static Double volume(Double radius){
        return 4 * PI * radius * radius * radius / 3.0;
    }

}
