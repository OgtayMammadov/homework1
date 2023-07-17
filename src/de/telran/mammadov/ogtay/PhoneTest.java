package de.telran.mammadov.ogtay;

public class PhoneTest {
    public static void main(String[] args) {
        Phone phone1 = new Phone("018427834243", "IPhone", 300);
        Phone phone2 = new Phone("012423443443", "Huawei", 250);
        Phone phone3 = new Phone("024343444358", "Samsung", 150);



        System.out.println(phone1.getNumber() + " " + phone1.model + " " + phone1.weight);
        System.out.println(phone2.getNumber() + " " + phone2.model + " " + phone2.weight);
        System.out.println(phone3.getNumber() + " " + phone3.model + " " + phone3.weight);

        System.out.println();

        phone1.receiveCall("Ogtay");
        phone1.call("Ali");

        System.out.println();

        phone2.receiveCall("Ogtay");
        phone2.call("Ali");

        System.out.println();

        phone3.receiveCall("Ogtay");
        phone3.call("Ali");


    }
}
