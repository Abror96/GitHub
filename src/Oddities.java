import java.util.Scanner;

/**
 * Created by Abror on 11.05.2017.
 */
public class Oddities {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i<n; i++){
            nums[i] = in.nextInt();
        }
        for (int i = 0; i<n; i++){
            if(nums[i]%2 == 0) System.out.println(nums[i] + " is even");
            else System.out.println(nums[i] + " is odd");
        }
    }

}
