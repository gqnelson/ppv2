package ppv2;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CombineTwoStringsTest {
    @Test
    public void testStartingLetter() {
        CombineTwoStrings cts = new CombineTwoStrings();
        assertFalse(cts.validCombinationRecursive("abc", "def", "frefef"));
        assertFalse(cts.validCombinationRecursive("abc", "def", "abc"));

        assertTrue(cts.validCombinationRecursive("a", "d", "ad"));
        assertTrue(cts.validCombinationRecursive("a", "d", "da"));

        assertTrue(cts.validCombinationRecursive("ad", "da", "adda"));
        assertTrue(cts.validCombinationRecursive("ad", "da", "adad"));
        assertFalse(cts.validCombinationRecursive("ad", "da", "aadd"));

        assertTrue(cts.validCombinationRecursive("aaaddd", "aaaddd", "aaaaaadddddd"));
        assertTrue(cts.validCombinationRecursive("aaaddd", "aaaddd", "aaadadadaddd"));
        assertFalse(cts.validCombinationRecursive("aaaddd", "aaaddd", "aaadadadadda"));

        assertTrue(cts.validCombinationRecursive("ace", "ded", "acdeed"));
        assertTrue(cts.validCombinationRecursive("ace", "ded", "daecde"));
        assertFalse(cts.validCombinationRecursive("ace", "ded", "acdeee"));
    }
}