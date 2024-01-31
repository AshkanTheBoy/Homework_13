package Rec;
/*
В кафе есть меню из двух видов блюд на первое, трех - на второе и двух - на третье.
Выведите все возможные сочетания заказов из двух или трех блюд. Названия блюд подберите.
Вместо блюд - [0,1][2,3,4][5,6] - результат такой же
 */
import java.util.Arrays;

public class Task_03 {
    static int[] firstMeals = new int[2],
                secondMeals = new int[3],
                thirdMeals = new int[2];
    static int[][] allMeals = {firstMeals,secondMeals,thirdMeals};
    static int[] order = new int[3];

    public static void main(String[] args) {
        int number = 0;
        for (int[] cell: allMeals){
            for (int i = 0; i < cell.length; i++) {
                cell[i] = number++;
            }
        }
        System.out.println(Arrays.deepToString(allMeals));
        takeMeal(0);
    }

    static void takeMeal(int courseIndex){
        if (courseIndex>=3){
            System.out.println(Arrays.toString(order));
            return;
        }
        for (int i = 0; i < allMeals[courseIndex].length; i++) {
            order[courseIndex] = allMeals[courseIndex][i];
            takeMeal(courseIndex + 1);
        }
    }
}

