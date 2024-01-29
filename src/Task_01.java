import java.util.Arrays;
import java.util.Random;

public class Task_01 {
    static int[][] arr;
    static int rows;
    static int cols;

    public static void main(String[] args) {

        Random random = new Random();
        rows = random.nextInt(20) + 10;
        arr = new int[rows][];
        for (int i = 0; i < arr.length; i++) {
            cols = random.nextInt(20) + 1;
            arr[i] = new int[cols];
            System.out.println(Arrays.toString(arr[i]));
        }

        System.out.println();
        sortLengths();
        System.out.println();
        printResult();

    }

    static int[][] sortLengths(){
        int[] lengths = new int[arr.length];
        for (int i = 0; i < lengths.length; i++) {
            lengths[i] = arr[i].length;
        }
        Arrays.sort(lengths);
        System.out.println(Arrays.toString(lengths));
        System.out.println();
        for (int i = 0; i < lengths.length; i++) {
            int[] temp;
            for (int j = i; j < rows; j++) {
                if (arr[j].length==lengths[i]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    break;
                }
            }
        }
        return arr;
    }

    static void printResult(){
        for (int[] cell: arr){
            System.out.println(Arrays.toString(cell));
        }
    }
}