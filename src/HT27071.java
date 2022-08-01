import java.util.Arrays;
public class HT27071 {
    public static void main(String[] args) {
    int[] my_array = {1, 7, 11, 15, 3, 27};
    int[] new_array = new int[6];

    System.out.println("Source Array : "+Arrays.toString(my_array));

    for (int i=0; i < my_array.length; i++) {
        new_array[i] = my_array[i];
    }
    System.out.println("New Array: "+Arrays.toString(new_array));
    }
}
