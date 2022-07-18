public class MathexMPLE {
    public static void main(String[] args) {

        float num = 5.154f;

        System.out.println(num);
        //rounding down
        System.out.println(Math.floor(num));

        //rounding up
        System.out.println(Math.ceil(num));

        //rounding according to match principals
        System.out.println(Math.round(num));
        //absolute value
        System.out.println(Math.abs(-2));

        //power raise
        System.out.println(Math.pow(2,2));
        //kvadr'atsakne
        System.out.println(Math.sqrt(64));

        //compearing values and finding max
        System.out.println(Math.max(100,103.5));
        //finding min
        System.out.println(Math.min(64,43));

        //random value
        System.out.println(Math.random() * 2);
    //random value from 1 to 20
        System.out.println((int) (Math.random() * 20));
        //casting
        System.out.println((int) 99.989);

        System.out.println((10 + 5) * 2);


    }
}
