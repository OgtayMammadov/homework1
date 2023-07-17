package de.telran.mammadov.ogtay;

import java.util.Random;

public class Person {
    public String fullName;
    private int age;

    public Person(){

    }
    public Person (String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }
    public void talk(){
        System.out.println(fullName + " говорит.");
    }
    public int move(){
        Random random = new Random();
        return random.nextInt(0,100);
    }

    public int getAge() {
        return age;
    }
}
