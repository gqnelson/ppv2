package ppv2;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CombineTwoStringsTest {
    @Test
    public void testIsValidShuffleRecursive() {

        CombineTwoStrings cts = new CombineTwoStrings();
        assertFalse(cts.isValidShuffleRecursive("abc", "def", "frefef"));
        assertFalse(cts.isValidShuffleRecursive("abc", "def", "abc"));

        assertTrue(cts.isValidShuffleRecursive("a", "d", "ad"));
        assertTrue(cts.isValidShuffleRecursive("a", "d", "da"));

        assertTrue(cts.isValidShuffleRecursive("ad", "da", "adda"));
        assertTrue(cts.isValidShuffleRecursive("ad", "da", "adad"));
        assertFalse(cts.isValidShuffleRecursive("ad", "da", "aadd"));

        assertTrue(cts.isValidShuffleRecursive("aaaddd", "aaaddd", "aaaaaadddddd"));
        assertTrue(cts.isValidShuffleRecursive("aaaddd", "aaaddd", "aaadadadaddd"));
        assertFalse(cts.isValidShuffleRecursive("aaaddd", "aaaddd", "aaadadadadda"));

        assertTrue(cts.isValidShuffleRecursive("ace", "ded", "acdeed"));
        assertTrue(cts.isValidShuffleRecursive("ace", "ded", "daecde"));
        assertFalse(cts.isValidShuffleRecursive("ace", "ded", "acdeee"));
    }
}