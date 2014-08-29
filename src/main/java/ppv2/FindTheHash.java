package ppv2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class FindTheHash {
    public static String letters = "acdegilmnoprstuw";

    public static String unhash(long hash) {
        ArrayList<Integer> indices = new ArrayList<>();
        while (hash > 37) {
            indices.add((int) (hash % 37));
            hash = hash / 37;
        }

        String unhashWord = "";
        for (int i = indices.size() - 1; i >= 0; i--) {
            unhashWord += letters.charAt(indices.get(i));
        }

        return unhashWord;
    }

    public static long hash(String s) {
        long h = 7;
        for (int i = 0; i < s.length(); i++) {
            h = (h * 37 + letters.indexOf(s.charAt(i)));
        }
        return h;
    }

    public static long hashBase(int length) {
        long h = 7;
        for (int i = 0; i < length; i++) {
            h = h * 37;
        }
        return h;
    }

    public static Set<String> permute(String letters, Set<String> combinations, int length) {
        if (length < 1) return combinations;
        Set<String> nextCombinations = new HashSet<>();
        for (String combination : combinations) {
            for (int i = 0; i < letters.length(); i++) {
                nextCombinations.add(combination + letters.charAt(i));
            }
        }
        System.out.println(String.format("%d combinations at length %d", nextCombinations.size(), length));
        return permute(letters, nextCombinations, length - 1);
    }

}
