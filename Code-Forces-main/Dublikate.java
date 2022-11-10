import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Dublikate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            HashSet<Integer> set = new HashSet<>();
            for (int j = 0; j < m; j++) {
                set.add(sc.nextInt());
            }
            if (set.size() != m) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

    }
}
