import java.util.Scanner;

class Result {

    

    public static int palindromeIndex(String s) {
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - 1 - i)) {
                
                if (isPalindrome(s.substring(0, i) + s.substring(i + 1))) {
                    return i;
                }
                
                if (isPalindrome(s.substring(0, n - 1 - i) + s.substring(n - i))) {
                    return n - 1 - i;
                }
                
                return -1;
            }
        }
        
        return -1;
    }

    
    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < q; i++) {
            String s = scanner.nextLine();
            int result = Result.palindromeIndex(s);
            System.out.println(result);
        }

        scanner.close();
    }
}
