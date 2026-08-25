import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Result {

    

    public static List<Long> maxSubarray(List<Integer> arr) {
        long maxSubarraySum = Long.MIN_VALUE;
        long currentSubarraySum = 0;
        long maxSubsequenceSum = Long.MIN_VALUE;
        boolean allNegative = true;
        long maxSingleElement = Long.MIN_VALUE;

        for (int x : arr) {
            if (x >= 0) {
                allNegative = false;
            }
            maxSingleElement = Math.max(maxSingleElement, x);

          
            currentSubarraySum += x;
            if (currentSubarraySum > maxSubarraySum) {
                maxSubarraySum = currentSubarraySum;
            }
            if (currentSubarraySum < 0) {
                currentSubarraySum = 0;
            }

           
            if (x > 0) {
                maxSubsequenceSum = (maxSubsequenceSum == Long.MIN_VALUE) ? x : maxSubsequenceSum + x;
            }
        }

     
        if (maxSubarraySum == Long.MIN_VALUE || maxSubarraySum == 0 && !arr.contains(0)) {
             
             boolean foundPositive = false;
             for(int x : arr) {
                 if (x > 0) {
                     foundPositive = true;
                     break;
                 }
             }
             if (!foundPositive) {
                 maxSubarraySum = maxSingleElement;
             } else {
               
                 if (maxSubarraySum < maxSingleElement) { 
                     maxSubarraySum = maxSingleElement;
                 }
             }
        }
        
        
        if (allNegative) {
            maxSubsequenceSum = maxSingleElement;
        } else if (maxSubsequenceSum == Long.MIN_VALUE) {
            
            maxSubsequenceSum = 0;
        }

        List<Long> result = new ArrayList<>();
        result.add(maxSubarraySum);
        result.add(maxSubsequenceSum);
        return result;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            List<Integer> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr.add(scanner.nextInt());
            }

            List<Long> result = Result.maxSubarray(arr);
            System.out.println(result.get(0) + " " + result.get(1));
        }
        scanner.close();
    }
}
