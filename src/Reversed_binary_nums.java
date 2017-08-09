import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Abror on 04.05.2017.
 */
public class Reversed_binary_nums {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        ArrayList<Integer> binary = new ArrayList<>();
        while (number>=1){
            if(number%2 == 0) binary.add(0);
            else if (number%2 != 0) binary.add(1);
            number = number/2;
        }
        Collections.reverse(binary);
        int output = 0;
        for (int i = 0; i<binary.size(); i++){
            output += binary.get(i)*Math.pow(2,i);
        }
        System.out.println(output);
    }

}
