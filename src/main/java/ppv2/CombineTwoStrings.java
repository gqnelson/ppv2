package ppv2;

public class CombineTwoStrings {
    public boolean isValidShuffleRecursive(String first, String second, String combination) {
        if ((first.length() + second.length()) != combination.length()) {
            //Combination of strings is either too short or too long
            return false;
        }

        if (combination.equals(first + second) || combination.equals(second + first)) {
            return true;
        }

        if (first.length() > 0 && combination.charAt(0) == first.charAt(0) && isValidShuffleRecursive(first.substring(1), second, combination.substring(1))) {
            return true;
        }

        if (second.length() > 0 && combination.charAt(0) == second.charAt(0) && isValidShuffleRecursive(first, second.substring(1), combination.substring(1))) {
            return true;
        }

        return false;
    }
}
