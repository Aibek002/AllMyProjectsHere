import java.util.Scanner;
 
public class santa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s[] = new String[3];
        String ans = "NO";
        for (int i = 0; i < s.length; i++) {
            s[i] = sc.nextLine().toLowerCase();
        }
        toStr(s, ans);
    }
 
 
    public static String toStr(String[] s, String ans) {
 
        if (s[2].length() != s[0].length() + s[1].length()) {
            System.out.println(ans);
        } else {
            int[] alphArray = new int[26];
            {
                int i = 0;
                while (i < s[0].length()) {
                    alphArray[s[0].charAt(i) - 'a']++;
                    i++;
                }
            }
            {
                int i = 0;
                while (i < s[1].length()) {
                    alphArray[s[1].charAt(i) - 'a']++;
                    i++;
                }
            }
            int i = 0;
            while (i < s[2].length()) {
                alphArray[s[2].charAt(i) - 'a']--;
 
                if (alphArray[s[2].charAt(i) - 'a'] < 0) {
                    System.out.println(ans);
                    return ans;
                }
                i++;
            }
 
            ans = "YES";
            System.out.println(ans);
        }
        return null;
    }
 
}