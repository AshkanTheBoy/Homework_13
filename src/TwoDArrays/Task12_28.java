package TwoDArrays;

import java.util.Arrays;
/*
12.28 | 12.29
Заполнить двумерный массив размером 5x5 по спирали
[1 , 2 , 3 , 4 , 5]
[16, 17, 18, 19, 6]
[15, 24, 25, 20, 7]
[14, 23, 22, 21, 8]
[13, 12, 11, 10, 9]
 */
public class Task12_28 {
    static int size = 5;
    static int number = 1,
                upOffSet = 0,
                rightOffSet = 0,
                botOffSet = 0,
                leftOffSet = 0;

    static int[][] arr = new int[size][size];
    public static void main(String[] args) {
        while (number<size*size+1){
            fillUpRow();
            fillRightCol();
            fillBotRow();
            fillLeftCol();
        }
        print();
    }

    static void fillUpRow(){
        for (int index = leftOffSet; index < size; index++) {
            if (arr[leftOffSet][index]>0){
                break;
            }
            arr[leftOffSet][index] = number++;
        }
        upOffSet++;
    }

    static void fillRightCol(){
        for (int index = upOffSet; index < size; index++) {
            if (arr[index][size-upOffSet]>0){
                break;
            }
            arr[index][size-upOffSet] = number++;
        }
        rightOffSet++;
    }

    static void fillBotRow(){
        for (int index = size-1-rightOffSet; index >= 0; index--) {
            if (arr[size-rightOffSet][index]>0){
                break;
            }
            arr[size-rightOffSet][index] = number++;
        }
        botOffSet++;
    }

    static void fillLeftCol(){
        for (int index = size-1-botOffSet; index >= 0 ; index--) {
            if (arr[index][leftOffSet]>0){
                break;
            }
            arr[index][leftOffSet] = number++;
        }
        leftOffSet++;
    }

    static void print(){
        for (int[] cell: arr){
            System.out.println(Arrays.toString(cell));
        }
    }
}
