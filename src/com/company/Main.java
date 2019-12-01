package com.company;

public class Main {

    public static void main(String[] args) {
        Dog rex = new Dog("rex");
        Dog fluppy = new Dog("fluppy");
        rex.printName();
        fluppy.printName();
    }
}

class Dog {
    //private static String name;
    private static String name;

    public Dog(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("name = " + name);
    }
}
