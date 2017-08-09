import java.util.Scanner;

/**
 * Created by Abror on 28.05.2017.
 */
public class Lets_review {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] cases = new String[n];
        String case1 = "";
        for(int i = 0; i<n; i++){
            cases[i] = in.next();
        }
        for(int i = 0; i<n; i++){
            for(int j = 0; j<cases[i].length(); j+=2){
                case1 += cases[i].charAt(j);
            }
            System.out.print(case1+" ");
            case1 = "";
            for(int j = 1; j<cases[i].length(); j+=2){
                case1 += cases[i].charAt(j);
            }
            System.out.println(case1);
            case1 = "";
        }
    }
}
