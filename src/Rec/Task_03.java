package Rec;

import java.util.Arrays;

public class Task_03 {
    static int[] firstMeals = new int[3],
                secondMeals = new int[4],
                thirdMeals = new int[4];
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

