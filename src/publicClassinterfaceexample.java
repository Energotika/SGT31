im
public class ArrayList {
    public static void main(String[] args) {
        //arraylist decl
        ArrayList<String> car = new ArrayList<String>();

        //add elements
        car.add("Volvo");
        car.add("Mercedes");
        car.add("BMW");
        car.add("Jeep");
        car.add("Opel");
        //print out all elements
        System.out.println(car);

        //get elements by index
        System.out.println(car.get(1));
        car.add(2, "Ford");
        System.out.println(car);

    }
}
