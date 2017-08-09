import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Abror on 05.07.2017.
 */
public class Zanzibar {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num_case = in.nextInt();
        int num_turtles;
        int migrated, initial;
        ArrayList<Integer> cases;
        for(int i = 0; i<num_case; i++){
            cases = new ArrayList<>();
            for(int j = 0; true; j++){
                num_turtles = in.nextInt();
                if(num_turtles == 0) break;
                cases.add(num_turtles);
            }
            initial = cases.get(0);
            migrated = 0;
            for(int l = 1; l<cases.size(); l++){
                if(cases.get(l)-(2*initial)>0)
                {
                    migrated += cases.get(l)-(2*initial);
                }
                initial = cases.get(l);
            }
            System.out.println(migrated);
        }
    }
}
