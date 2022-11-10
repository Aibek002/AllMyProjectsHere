
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Bendzhic2 {
  static Scanner in=new Scanner(System.in);
    static Integer[] scannerArray(int n) {
        Integer[] array = new Integer[n];
        for(int i=0; i<n; ++i){
            array[i] = in.nextInt();
        }
        return array;
    }
    public static void main(String[] args) {
        Integer n = in.nextInt();
        Integer[] firstarray = scannerArray(n);
        Set<Integer> setOf = new HashSet<>();
        int i=0;
        if (i < n) {
            do {
                int numberofHash = i;
                setOf.add(i);
                do {
                    if (setOf.contains(firstarray[numberofHash] - 1)) break;
                    numberofHash = firstarray[numberofHash] - 1;
                    setOf.add(numberofHash);
                } while (true);
                System.out.print(firstarray[numberofHash] + " ");
                setOf.clear();
                ++i;
            } while (i < n);
        }
    }
}

