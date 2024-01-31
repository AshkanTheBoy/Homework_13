package TwoDArrays;

import java.util.Arrays;

/*
Дан двумерный массив размером 9x9.
Построить последовательность чисел,
получающуюся при чтении этого массива по спирали
 */
public class Task12_30 {
    static int size = 9,
                count = 0,
                upOffSet = 0,
                rightOffSet = 0,
                botOffSet = 0,
                leftOffSet = 0,
                startNumber = 1,
                numberOffSet = 1,
                currentNumber = startNumber+numberOffSet;


    static int[][] arr = new int[size][size];
    public static void main(String[] args) {
        System.out.print(startNumber+" ");
        while (count<size*size-1){
            fillUpRow();
            fillRightCol();
            fillBotRow();
            fillLeftCol();
        }
        System.out.println();
        print();
    }

    static void fillUpRow(){
        for (int index = leftOffSet; index < size; index++) {
            if (arr[leftOffSet][index]>0){
                break;
            }
            arr[leftOffSet][index] = currentNumber;
            count++;
            printNumber();
            addOffset();
        }
        upOffSet++;
    }

    static void fillRightCol(){
        for (int index = upOffSet; index < size; index++) {
            if (arr[index][size-upOffSet]>0){
                break;
            }
            arr[index][size-upOffSet] = currentNumber;
            count++;
            printNumber();
            addOffset();
        }
        rightOffSet++;
    }

    static void fillBotRow(){
        for (int index = size-1-rightOffSet; index >= 0; index--) {
            if (arr[size-rightOffSet][index]>0){
                break;
            }
            arr[size-rightOffSet][index] = currentNumber;
            count++;
            printNumber();
            addOffset();
        }
        botOffSet++;
    }

    static void fillLeftCol(){
        for (int index = size-1-botOffSet; index >= 0 ; index--) {
            if (arr[index][leftOffSet]>0){
                break;
            }
            arr[index][leftOffSet] = currentNumber;
            count++;
            printNumber();
            addOffset();
        }
        leftOffSet++;
    }

    static void printNumber(){
        System.out.print(currentNumber+" ");
    }

    static void addOffset(){
        currentNumber+=numberOffSet;
    }

    static void print(){
        for(int[] cell: arr){
            System.out.println(Arrays.toString(cell));
        }
    }
}
