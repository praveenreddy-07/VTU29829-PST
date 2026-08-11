import java.util.*;

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        
     
        HashMap<Integer, String> map = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            map.put(heights[i], names[i]);
        }
        
        
        Arrays.sort(heights);
        
        String[] result = new String[n];
        
        for (int i = 0; i < n; i++) {
            result[i] = map.get(heights[n - 1 - i]);
        }
        
        return result;
    }
}
