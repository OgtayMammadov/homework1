package de.telran.mammadov.ogtay;

import java.util.Random;

public class Phone {
    private String number;
    public String model;
    int weight;


    public Phone(String number, String model, int weight){
        this.number = number;
        this.model = model;
        this.weight = weight;

    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;

    }
    public void receiveCall(String name){
        System.out.println("Звонит " + name);

    }
    public void call(String name){
        Random random = new Random();
        if(random.nextBoolean()){
            System.out.println("Дозвонился до " + name);
        }else{
            System.out.println("Абонент " + name + " не доступен ");
        }
    }

    public void setWeight(int weight) {
        if(weight > 0){
            this.weight = weight;
        }


    }
}
