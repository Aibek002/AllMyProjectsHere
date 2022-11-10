import java.util.Arrays;
import java.util.Scanner;
 
public class BitPlusPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h=0;
        String plus="X++";
        String pluss="++X";
    
        for (int i = 0; i < n; i++) {
            String s=sc.next();
            if(s.equals(plus)||s.equals(pluss)){
                h++;
            }else{
                h--;
            }
        }
        System.out.println(h);
        
    }
}