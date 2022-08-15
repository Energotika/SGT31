package oop;

import java.sql.SQLOutput;

public class Callinganimal {
    public static void main(String[] args) {
        oop.Abimal animal1 = new oop.Abimal("Cat", "Maicoon", 10.4f,16);
        animal1.printAnimalInfo();
        oop.Abimal animal2 = new oop.Abimal("Dog","Toy Poodle",3,1f);
        animal2.printAnimalInfo();

    }

}
