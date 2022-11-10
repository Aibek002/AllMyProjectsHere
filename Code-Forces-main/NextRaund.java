import java.util.Arrays;
import java.util.Scanner;
 
public class NextRaund {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int sum=0;
        int[] person=new int[n];
        for (int i = 0; i < person.length; i++) {
            person[i]=sc.nextInt();
            if(person[i]==0){
               
            }else if(person[i]>=person[k-1]){
                sum++;
            }
        }
        System.out.println(sum);
        
 
    }
}