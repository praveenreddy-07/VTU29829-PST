import java.util.Scanner;

public class PalindromicRotations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        scanner.close();

        for (int k = 0; k < n; k++) {
            
            String rotatedString = s.substring(k) + s.substring(0, k);

           
            int maxPalindromeLength = findMaxPalindromeLength(rotatedString);
            System.out.println(maxPalindromeLength);
        }
    }

    
    public static int findMaxPalindromeLength(String str) {
        int n = str.length();
        if (n == 0) {
            return 0;
        }
        int maxLength = 1;

        
        for (int i = 0; i < n; i++) {
            int left = i - 1;
            int right = i + 1;
            int currentLength = 1;
            while (left >= 0 && right < n && str.charAt(left) == str.charAt(right)) {
                currentLength += 2;
                left--;
                right++;
            }
            maxLength = Math.max(maxLength, currentLength);
        }

       
        for (int i = 0; i < n - 1; i++) {
            int left = i;
            int right = i + 1;
            int currentLength = 0;
            while (left >= 0 && right < n && str.charAt(left) == str.charAt(right)) {
                currentLength += 2;
                left--;
                right++;
            }
            maxLength = Math.max(maxLength, currentLength);
        }

        return maxLength;
    }
}
