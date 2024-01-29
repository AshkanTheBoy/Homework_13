import java.util.Arrays;
/*
12.28, но заполнение знаками для упрощенного понимания
 */
public class Task12_28_1 {
    static int size = 21;
    static int number = 1,
                upOffSet = 0,
                rightOffSet = 0,
                botOffSet = 0,
                leftOffSet = 0;

    static String[][] arr = new String[size][size];
    public static void main(String[] args) {
        fillArr();
        while (number!=size*size+1){
            fillUpRow();
            fillRightCol();
            fillBotRow();
            fillLeftCol();
        }
        print();
    }

    static void fillUpRow(){
        for (int index = leftOffSet; index < size; index++) {
            if (!(arr[leftOffSet][index].isEmpty())){
                break;
            }
            arr[leftOffSet][index] = " >";
            number++;
        }
        upOffSet++;
    }

    static void fillRightCol(){
        for (int index = upOffSet; index < size; index++) {
            if (!(arr[index][size-upOffSet].isEmpty())){
                break;
            }
            arr[index][size-upOffSet] = "\\/";
            number++;
        }
        rightOffSet++;
    }

    static void fillBotRow(){
        for (int index = size-1-rightOffSet; index >= 0; index--) {
            if (!(arr[size-rightOffSet][index].isEmpty())){
                break;
            }
            arr[size-rightOffSet][index] = " <";
            number++;
        }
        botOffSet++;
    }

    static void fillLeftCol(){
        for (int index = size-1-botOffSet; index >= 0 ; index--) {
            if (!(arr[index][leftOffSet].isEmpty())){
                break;
            }
            arr[index][leftOffSet] = "/\\";
            number++;
        }
        leftOffSet++;
    }

    static void fillArr(){
        for (String[] cell: arr){
            Arrays.fill(cell,"");
        }
    }

    static void print(){
        for (String[] cell: arr){
            System.out.println(Arrays.toString(cell));
        }
    }
}
