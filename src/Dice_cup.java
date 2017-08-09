import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Abror on 14.05.2017.
 */
public class Dice_cup {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr;
        if (n > m) {
            arr = new int[n+1];
            for (int i = 0; i < n; i++) {
                arr[i] = i + 1;
            }
            arr = Arrays.copyOfRange(arr, m, n);
            for (int anArr : arr) System.out.println(anArr);
            System.out.println(arr[arr.length-1]+1);
        } else if (m > n) {
            arr = new int[m+1];
            for (int i = 0; i < m; i++) {
                arr[i] = i + 1;
            }
            arr = Arrays.copyOfRange(arr, n, m);
            for (int anArr : arr) System.out.println(anArr);
            System.out.println(arr[arr.length-1]+1);
        } else System.out.println(n+1);
    }

}
