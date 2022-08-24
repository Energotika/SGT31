package oop;

public class Callinganimal {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Cat", "Maicoon", 10.4f,16);
        animal1.printAnimalInfo();
        Animal animal2 = new Animal("Dog","Toy Poodle",3f);
        animal2.printAnimalInfo();

    }

}
