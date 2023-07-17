package de.telran.mammadov.ogtay;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Ali Mammadov" , 16);

        person1.fullName = "Ogtay Mammadov";

        person1.talk();
        System.out.println(person1.move());

        person2.talk();
        System.out.println(person2.move());

    }
}
