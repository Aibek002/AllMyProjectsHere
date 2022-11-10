
import java.util.*;
public class Svidanie {
 
    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int a,b,s,d;
        a= in.nextInt();
        b=in.nextInt();
        s=in.nextInt();
        d=Math.abs(a)+Math.abs(b);
if(d>s || ((d-s)%2!=0)){
System.out.println("No");
}else {
    System.out.println("Yes");
}
    }
}
