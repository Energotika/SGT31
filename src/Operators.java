public class Operators {
    public static void main(String[] args) {

        //match operators + - / * %
        int x = 100;
        x +=100;
        //x=x+100 result vas 200
        x = 3;
        //result is 3
        System.out.println("x = " + x);
        //%modular takes reminder from devision
        //used for task to determine if number is odd or even number - odd cant be devided by 2, ex 13, 7 lefts over, 2;4;6,12 even

        System.out.println(20 * 100);

        //incramentation operatoons diference just in print out
        //post-incrementation
        int num = 10;
        System.out.println("num = " + ++num);
        System.out.println("num = " + num++);
        //after num++ increases

        //pre-incrementation
        int num2 = 20;
        System.out.println("num2 = " + ++num2);
        //num2 =21

        //increase by 1 four ways
        int var = 10;
        var += 1;
        var = var +1;
        ++var;
        var++;

        //decrease by 1
        var -= 1;
        var = var -1;
        --var;
        var--;

        //logical - relational and logical, logical are for asking questions, if value a is equeal to be ==;
        //inequality != if a is not equal to b
        //grater or smaller <> grater or equal to

        //relational
        //equality ==
        int a = 1;
        int b = 10;
        System.out.println("Equality = " +(a == b)); //is a equal to b?
        //false

        //Inequality !=
        System.out.println("Inequality - " + (a != b)); // is a not equal to b?

        //Greater than > and greater than or equal to >=
        System.out.println(a > b); //if a is greater than b
        System.out.println(a >= b); // if a is greater or equal to b

        //Less than < and less than or equal to <=
        System.out.println(a < b);
        System.out.println(a <= b);

        //logical operators gives bulion value, false or true
        //logical and &&
        boolean wind = false;
        boolean weather = true;
        System.out.println(wind && weather);
//false
        //logical or - II vertical lines
        boolean sale = false;
        boolean ritch = true;
        System.out.println(sale || ritch);
//true

    }
}
