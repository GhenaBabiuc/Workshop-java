package alternativeStructure;

import java.util.*;

public class ProblemVIII {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            list.add(cin.nextLine());
        }

        System.out.println(" ");

        Collections.sort(list);
        for (String n : list) {
            System.out.println(n);
        }
    }
}
