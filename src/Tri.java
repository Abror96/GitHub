import java.util.Scanner;

/**
 * Created by Abror on 27.05.2017.
 */
public class Tri {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        if(num1 == 1 && num2 == 1 && num3 == 1)
            System.out.println(num1+"+"+num2+"="+num3);
        else if(num1 == num2) {
            if (num3 == 1)
                System.out.println(num1 + "/" + num2 + "=" + num3);
        }
        else if(num2 == num3){
            if(num1 == 1)
                System.out.println(num1 + "*" + num2 + "=" + num3);
        }
        else if(num1 == num3){
            if(num2 == 1)
                System.out.println(num1 + "*" + num2 + "=" + num3);
        }
        else {
            if (num1 + num2 == num3) System.out.println(num1 + "+" + num2 + "=" + num3);
            if (num1 - num2 == num3) System.out.println(num1 + "-" + num2 + "=" + num3);
            if (num1 / num2 == num3) System.out.println(num1 + "/" + num2 + "=" + num3);
            if (num1 * num2 == num3) System.out.println(num1 + "*" + num2 + "=" + num3);
            if (num2 + num3 == num1) System.out.println(num1 + "=" + num2 + "+" + num3);
            if (num2 - num3 == num1) System.out.println(num1 + "=" + num2 + "-" + num3);
            if (num2 / num3 == num1) System.out.println(num1 + "=" + num2 + "/" + num3);
            if (num2 * num3 == num1) System.out.println(num1 + "=" + num2 + "*" + num3);
        }
    }
}
