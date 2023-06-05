package Java100;

import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] words) {
        Map<String, List<String>> map = new HashMap<>();
        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
            List<String> anagrams = map.getOrDefault(sortedWord, new ArrayList<>());
            anagrams.add(word);
            map.put(sortedWord, anagrams);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> anagramGroups = groupAnagrams(words);
        System.out.println(anagramGroups);
    }
}
