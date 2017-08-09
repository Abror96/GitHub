import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Abror on 05.05.2017.
 */
public class Modulo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nums[] = new int[10];
        for(int i = 0; i<10; i++){
            nums[i] = in.nextInt();
        }
        ArrayList<Integer> results = new ArrayList<>();
        for(int i = 0; i<10; i++){
            results.add(nums[i]%42);
        }
        int count = 0;
        ArrayList<Integer> check = new ArrayList<>();
        for(int i = 0; i<10; i++){
            if(!check.contains(results.get(i))) {
                check.add(results.get(i));
                count++;
            }
        }
        System.out.println(count);
    }

}
