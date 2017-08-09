import java.util.Scanner;

/**
 * Created by Abror on 04.05.2017.
 */
public class Pet {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] grades = new int[5][4];
        for(int i = 0; i<5; i++){
            for(int j = 0; j<4; j++){
                grades[i][j] = in.nextInt();
            }
        }
        int results[] = new int[5];
        for(int i = 0; i<5; i++){
            for(int j = 0; j<4; j++){
                results[i] += grades[i][j];
            }

        }
        int max = results[0];
        int index = 0;
        for(int i = 0; i<5; i++) {
            if(results[i] > max) {
                max = results[i];
                index = i;
            }
        }
        System.out.println((index+1)+" "+max);
    }

}
