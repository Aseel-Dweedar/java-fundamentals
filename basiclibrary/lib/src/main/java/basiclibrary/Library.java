/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import java.util.concurrent.ThreadLocalRandom;

public class Library {
    public static void main(String[] args) {
      int []sameArr = roll(4);
        containsDuplicates(sameArr);
        average(sameArr);
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57},
        };
        lowAverage(weeklyMonthTemperatures);
    }

    public static int[] roll(int n ) {
        int []arrRandom =new int[n];
        for (int i = 0; i < n; i++) {
            int randomNumber = ThreadLocalRandom.current().nextInt(1, 7);
            arrRandom[i] = randomNumber;
        System.out.println(arrRandom[i]);
        }
        return arrRandom;
    }

    public static boolean containsDuplicates(int[] arr) {
        boolean result = false;
        for (int i = 0 ; i < arr.length ; i++) {
            if (result) {
                break;
            }
            for (int j = i+1; j < arr.length  ; j++) {
                if (arr[i] == arr[j]) {
                    result = true;
                    break;
                }
            }
        }
        System.out.println(result);
        return result;
    }

    public static double average(int[] arr) {
        int total = 0;
        for (int i : arr) {
            total += i;
        }
        double average = (double)total/arr.length;
        System.out.println(average);
        return average;
    }

    public static int[] lowAverage(int[][] arr) {
        double lastAvg = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            int oneArrTotal = 0;
            for (int j = 0; j < arr[i].length ; j++) {
                oneArrTotal += arr[i][j];
            }
            double oneAvg = (double)oneArrTotal/arr[i].length;
            if (lastAvg == 0) {
                lastAvg = oneArrTotal;
            }
            if (oneAvg < lastAvg) {
                index = i;
                lastAvg = oneArrTotal;
            }
        }
        for (int i = 0; i < arr[index].length; i++) {
            System.out.println(arr[index][i]);
        }
        return arr[index];
    }
}