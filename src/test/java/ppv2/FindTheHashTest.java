package ppv2;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class FindTheHashTest {
    @Test
    public void testHash() {
        assertEquals(680131659347L, FindTheHash.hash("leepadg"));
    }

    @Test
    public void testRanges() {
        long targetHash = 956446786872726L;
        long hash = 0;
        int lengthOfString = 1;
        while (hash < targetHash) {
            hash = FindTheHash.hashBase(lengthOfString);
            System.out.println(String.format("length %d creates base hash of %,8d", lengthOfString, hash));
            lengthOfString++;
        }

        String letters10 = "acdegilmno";
        System.out.println(String.format("Hash is %,8d for %s", FindTheHash.hash(letters10), letters10));

        String letters11 = "acdegilmnop";
        System.out.println(String.format("Hash is %,8d for %s", FindTheHash.hash(letters11), letters11));

    }

    @Test
    public void testPermute() {
        Set<String> combinations = FindTheHash.permute("abc", new HashSet<>(Arrays.asList("a", "b", "c")), 3);
        System.out.println(String.format("There are %d combinations of %d letter combinations of these letters %s", combinations.size(), 3, "abc"));
        for (String combination : combinations) {
            System.out.println(combination);
        }
    }

    @Test
    public void testPermute2() {
        Set<String> combinations = FindTheHash.permute(FindTheHash.letters, new HashSet<>(Arrays.asList("a", "c", "d", "e", "g", "i", "l", "m", "n", "o", "p", "r", "s", "t", "u", "w")), 9);
        System.out.println(String.format("There are %d combinations of %d letter combinations of these letters %s", combinations.size(), 3, FindTheHash.letters));
//        for (String combination : combinations) {
//            System.out.println(combination);
//        }
    }

    @Test
    public void testUnHash() {
        System.out.println(String.format("%d produces unhashed word %s", 680131659347L, FindTheHash.unhash(680131659347L)));
    }
}
