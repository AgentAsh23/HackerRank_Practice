import java.util.*;

public class Main {
    public int[] reverse(int[] array) {
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - 1 - i];
            array[n - 1 - i] = temp;
        }
        
        return array;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
        Main mainObj = new Main();
        int[] reversedArray = mainObj.reverse(array);
        for(int j=0;j<n;j++)
        {
            System.out.print(reversedArray[j]+" ");
        }

        sc.close();
    }
}
