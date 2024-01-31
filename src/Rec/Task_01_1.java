package Rec;

import java.util.Arrays;

public class Task_01_1 {
    static int[] arr = {0,1,2};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arr));
        swap(arr[1],arr[2]);
        System.out.println(Arrays.toString(arr));
        swap(arr[1],arr[2]);
        swap(arr[0],arr[1]);
        System.out.println(Arrays.toString(arr));
        swap(arr[1],arr[2]);
        System.out.println(Arrays.toString(arr));
        swap(arr[1],arr[2]);
        swap(arr[0],arr[1]);
        swap(arr[0],arr[2]);
        System.out.println(Arrays.toString(arr));
        swap(arr[1],arr[2]);
        System.out.println(Arrays.toString(arr));
        swap(arr[1],arr[2]);
        swap(arr[0],arr[2]);
    }

    static void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
