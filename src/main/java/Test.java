import java.util.Arrays;

public class Test {
    public static void main(String[] args) {


        bar(7,4);
    }

    public static int[] bar(int len, int initialValue){
        int[] ints = new int[len];
       Arrays.fill(ints, initialValue);
        System.out.println(Arrays.toString(ints));
        return ints;

    }
}
