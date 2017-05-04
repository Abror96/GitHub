import java.util.Scanner;

/**
 * Created by Abror on 03.05.2017.
 */
public class Trik {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] bottles = {1, 0, 0};
        String moves = in.next();
        moves = moves.toLowerCase();
        for(int i = 0; i<moves.length(); i++){
            if(moves.charAt(i)=='a'){
                swap(bottles, 0, 1);
            } else if (moves.charAt(i) == 'b'){
                swap(bottles, 1 ,2);
            } else if (moves.charAt(i) == 'c'){
                swap(bottles, 0, 2);
            }
        }
        for (int i = 0; i<3; i++){
            if(bottles[i] == 1) System.out.println(i+1);
        }
    }

    private static int[] swap(int[] bottles, int a, int b) {
        int temp = bottles[a];
        bottles[a] = bottles[b];
        bottles[b] = temp;
        return bottles;
    }

}
