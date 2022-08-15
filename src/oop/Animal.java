package oop;

public class Abimal {
    //fields
    private String type;
    private String bread;
    private float weight;
    private int avgLifespan;

    //custom constructor
    public Abimal(String type, String bread, float weight, int avgLifespan){
        this.type = type;
        this.bread = bread;
        this.weight = weight;
        this.avgLifespan = avgLifespan;

    }
    public Abimal(String type, String bread, float weight) {
        this.type = type;
        this.bread = bread;
        this.weight = weight;
    }
    public void printAnimalInfo(){
        System.out.println("Type:" +type);
        System.out.println("Bread: " +bread);
        System.out.println("Weight:" + weight);
        System.out.println("Avg lifespan:" + avgLifespan);
    }



}
