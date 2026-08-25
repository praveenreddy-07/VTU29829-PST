import java.util.ArrayList;
import java.util.List;

public class NaivePatternSearch {

   
    public static List<Integer> search(String text, String pattern) {
        List<Integer> occurrences = new ArrayList<>();
        int n = text.length();
        int m = pattern.length();

       
        for (int i = 0; i <= n - m; i++) {
            int j;
         
            for (j = 0; j < m; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
        
                    break;
                }
            }

       
            if (j == m) {
                occurrences.add(i);
            }
        }
        return occurrences;
    }

    public static void main(String[] args) {
        
        String text1 = "geeksforgeeks";
        String pattern1 = "geeks";
        List<Integer> result1 = search(text1, pattern1);
        System.out.println("Input: text = \"" + text1 + "\", pattern = \"" + pattern1 + "\"");
        System.out.println("Output: " + result1); 

        
        String text2 = "aabaacaadaabaaba";
        String pattern2 = "aaba";
        List<Integer> result2 = search(text2, pattern2);
        System.out.println("\nInput: text = \"" + text2 + "\", pattern = \"" + pattern2 + "\"");
        System.out.println("Output: " + result2); 

        
        String textBest = "AABCCAADDEE";
        String patternBest = "FAA";
        List<Integer> resultBest = search(textBest, patternBest);
        System.out.println("\nBest Case Scenario:");
        System.out.println("Input: txt = \"" + textBest + "\", pat = \"" + patternBest + "\"");
        System.out.println("Output: " + resultBest); 

        
        String textWorst1 = "AAAAAAAAAAAAAAAAAA";
        String patternWorst1 = "AAAAA";
        List<Integer> resultWorst1 = search(textWorst1, patternWorst1);
        System.out.println("\nWorst Case Scenario (Case 1):");
        System.out.println("Input: txt = \"" + textWorst1 + "\", pat = \"" + patternWorst1 + "\"");
        System.out.println("Output: " + resultWorst1);  

     
        String textWorst2 = "AAAAAAAAAAAAAAB";
        String patternWorst2 = "AAAAB";
        List<Integer> resultWorst2 = search(textWorst2, patternWorst2);
        System.out.println("\nWorst Case Scenario (Case 2):");
        System.out.println("Input: txt = \"" + textWorst2 + "\", pat = \"" + patternWorst2 + "\"");
        System.out.println("Output: " + resultWorst2); 
    }
}
