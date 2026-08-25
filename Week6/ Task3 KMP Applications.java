import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {

    public static String twoStrings(String s1, String s2) {
       
        Set<Character> s1Chars = new HashSet<>();
        for (char c : s1.toCharArray()) {
            s1Chars.add(c);
        }

       
        for (char c : s2.toCharArray()) {
            if (s1Chars.contains(c)) {
                return "YES"; 
            }
        }

        
        return "NO";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt(); 
        scanner.nextLine(); 

        for (int i = 0; i < q; i++) {
            String s1 = scanner.nextLine();
            String s2 = scanner.nextLine();
            System.out.println(twoStrings(s1, s2));
        }

        scanner.close();
    }
}
