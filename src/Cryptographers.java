import java.util.Scanner;

/**
 * Created by Abror on 14.05.2017.
 */
public class Cryptographers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String cipher = in.nextLine();
        cipher = cipher.toLowerCase();
        String name = "per";
        int k = 0;
        int count = 0;
        for(int i = 0; i<cipher.length(); i++){
            if(k==3) k = 0;
            if(cipher.charAt(i) != name.charAt(k)){
                cipher.replace(cipher.charAt(i),name.charAt(k));
                count++;
            }
            k++;
        }
        if(count == 0) count = 1;
        System.out.println(count);
    }

}
