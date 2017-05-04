import java.util.Scanner;

public class Speed_limit {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        String output = "";
        while ((n = in.nextInt()) > 0) {
            int total = 0;
            int[] s = new int[n];
            int[] t = new int[n];
            for (int i = 0; i < n; i++) {
                s[i] = in.nextInt();
                t[i] = in.nextInt();
                if (i == 0) total += s[i] * t[i];
                else total += s[i] * (t[i] - t[i - 1]);
            }
            output += total + " miles \n";
        }
        System.out.println(output);
    }
}
