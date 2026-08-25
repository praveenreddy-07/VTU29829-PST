
import java.util.Scanner;

class Solution {

    public static int calculateSimilarity(String s1, String s2) {
        int similarity = 0;
        int minLength = Math.min(s1.length(), s2.length());
        for (int i = 0; i < minLength; i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                similarity++;
            } else {
                break;
            }
        }
        return similarity;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); 

        while (t-- > 0) {
            String s = scanner.nextLine();
            long totalSimilarity = 0;

            for (int i = 0; i < s.length(); i++) {
                String suffix = s.substring(i);
                totalSimilarity += calculateSimilarity(s, suffix);
            }
            System.out.println(totalSimilarity);
        }
        scanner.close();
    }
}

