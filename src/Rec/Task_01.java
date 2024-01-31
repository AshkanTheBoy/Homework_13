package Rec;

import java.util.Arrays;

/*
Дан массив целых чисел, в котором каждый элемент равен его индексу, например [0,1,2].
Вывести все перестановки его n элементов, в которых элементы a и b не соседствуют.
 */
public class Task_01 {
    static int n = 3,
            a = 2,
            b = 1;
    static int[] arr = new int[n];

    public static void main(String[] args) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        printResult(0);
    }

    static void printResult(int i) {
        if (i >= n) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j]==a){
                    if (j==0&&arr[j+1]!=b){
                        System.out.println(Arrays.toString(arr));
                    } else if (j== arr.length-1&&arr[j-1]!=b){
                        System.out.println(Arrays.toString(arr));
                    } else if (j!=0&&j!=arr.length-1){
                        if (arr[j-1]!=b&&arr[j+1]!=b){
                            System.out.println(Arrays.toString(arr));
                        }
                    }
                }
            }
        }
        for (int j = i; j < arr.length; j++) {
            swap(i,j);
            printResult(i + 1);
            swap(i,j);
        }


    }

    static void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
