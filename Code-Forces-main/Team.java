import java.util.Scanner;
 
 
public class Team {
    
    public static void main(String args[]) {
        
      Scanner sc=new Scanner(System.in);
      int a = sc.nextInt();
      int check=0;
      for(int i=0;i<a;i++){
          int[] option=new int[3];
          for(int j=0;j<3;j++){
              option[j]=sc.nextInt();
          }
         if ((option[0] == 1 || option[1] == 1) && (option[1] == 1 || option[2] == 1) && (option[0] == 1 || option[2] == 1))
    {
        check++;
    }
      }
      System.out.println(check);
    }
}