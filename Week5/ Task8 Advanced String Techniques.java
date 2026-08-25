import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (isMatch(word, pattern)) {
                result.add(word);
            }
        }
        return result;
    }

    private boolean isMatch(String word, String pattern) {
        if (word.length() != pattern.length()) {
            return false;
        }
        Map<Character, Character> patternToWord = new HashMap<>();
        Map<Character, Character> wordToPattern = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char charWord = word.charAt(i);
            char charPattern = pattern.charAt(i);

            if (!patternToWord.containsKey(charPattern)) {
                patternToWord.put(charPattern, charWord);
            } else if (patternToWord.get(charPattern) != charWord) {
                return false;
            }

            if (!wordToPattern.containsKey(charWord)) {
                wordToPattern.put(charWord, charPattern);
            } else if (wordToPattern.get(charWord) != charPattern) {
                return false;
            }
        }
        return true;
    }
}
