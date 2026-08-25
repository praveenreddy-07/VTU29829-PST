import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int sLen = s.length();
        int pLen = p.length();

        if (sLen < pLen) {
            return result;
        }

        int[] pFreq = new int[26];
        int[] sFreq = new int[26];

        for (int i = 0; i < pLen; i++) {
            pFreq[p.charAt(i) - 'a']++;
            sFreq[s.charAt(i) - 'a']++;
        }

        if (areArraysEqual(pFreq, sFreq)) {
            result.add(0);
        }

        for (int i = pLen; i < sLen; i++) {
            sFreq[s.charAt(i) - 'a']++;
            sFreq[s.charAt(i - pLen) - 'a']--;

            if (areArraysEqual(pFreq, sFreq)) {
                result.add(i - pLen + 1);
            }
        }

        return result;
    }

    private boolean areArraysEqual(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
