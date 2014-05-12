import org.junit.Test;

import static org.junit.Assert.*;

public class CombineTwoStringsTest {
    @Test
    public void testStartingLetter() {
        CombineTwoStrings cts = new CombineTwoStrings();
        assertFalse(cts.validCombination("abc", "def", "fred"));
    }
}