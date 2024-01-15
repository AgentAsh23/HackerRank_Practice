import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int[][] hourglassSums = calculateHourglassSums(arr);
        int maxElement = findMaxElement(hourglassSums);
        System.out.println(maxElement);
        sc.close();
    }
    
    private static int findMaxElement(int[][] arr) {
        int maxElement = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > maxElement) {
                    maxElement = arr[i][j];
                }
            }
        }

        return maxElement;
    }
    

    private static int[][] calculateHourglassSums(int[][] arr) {
        int[][] sums = new int[4][4];

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                sums[i][j] = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] +
                             arr[i + 1][j + 1] +
                             arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
            }
        }

        return sums;
    }
}

