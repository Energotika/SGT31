public class DimArr {
    public static void main(String[] args) {
        //two dymn array
        int[][] age = new int [][]{{4,5,3,6,5},{34,44,28,38,41}};//fist row for storing children ages in {},secound in {} parents
    //print secound column values
        System.out.println("Child - " +age[0][1]);//[1]row;[2] columns
        System.out.println("parent- " +age[1][1]);

        //example 2
        String[][] names = new String[2][5];//2 rows and 5 columns

        names[0][0] = "Alice";
        names[0][1] = "Bob";
        names[0][2] = "John";
        names[0][3] = "Lucas";
        names[0][4] = "Joshua";
        //2nd row
        names[1][0] = "Tyron";
        names[1][1] = "Daren";
        names[1][2] = "Israel";
        names[1][3] = "Cyril";
        names[1][4] = "Lewis";

        //number of rows in 2nd array
        System.out.println(names.length);

        //names of colomns in specific row
        System.out.println(names[0].length);

        //number of columns in specific row
        System.out.println(names[0].length);

        //i - row
        //j = colomn

        for (int i = 0; i < names.length; i++){
            for (int j = 0; j< names[i].length; j++){
                System.out.println(names[i][j]);
            }
        }


        //how ro print out all elements
        for(int i = 0; i<names.length; i++){
            System.out.println(names[i][i]);
        }
            for (String [] tempNames : names){

                for (String name : tempNames) {
                    System.out.print(name + " ");
                }
                System.out.println();

            }
    }

}
