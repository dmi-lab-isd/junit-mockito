package org.labisd.sum;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SommatoreTest {
    Sommatore c;

    @Before
    public void setUp() { // DRY
        c = new Sommatore();
    }

    @Test
    public void testSumWithNonNegativeValues() {
        double res = c.sum(10, 50);
        assertEquals(60, res, 0);
    }

    @Test
    public void testSumWithNegativeValues_withTryCatch() {
        try {
            c.sum(-10, 50);
            fail();
        } catch (NegativeValuesException e) {
            assertTrue(true);
        }
    }

    @Test(expected = NegativeValuesException.class)
    public void testSumWithNegativeValues_withoutTryCatch() {
        c.sum(-10, 50);
    }
}
