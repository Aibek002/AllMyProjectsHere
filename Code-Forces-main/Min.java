import java.util.*;

public class mex {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        int b[] = new int[n - 1];
        int c[] = new int[n - 2];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 2; i++) {
            c[i] = sc.nextInt();
        }

        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        mSolve(a, b, c, n);
    }

    public static int mSolve(int[] a, int[] b, int[] c, int n) {

        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                System.out.println(a[i]);
                break;
            }
            if (a[i] == b[i]) {
                continue;
            }
            System.out.println(a[i]);
            break;
        }

        for (int i = 0; i < n - 1; i++) {
            if (i == n - 2) {
                System.out.println(b[i]);
                break;
            }
            if (b[i] == c[i]) {
                continue;
            }
            System.out.println(b[i]);
            break;
        }
        return 0;
    }

}
