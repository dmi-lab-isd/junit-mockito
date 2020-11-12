package org.labisd.misc;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class HobbitTest {

    final String hobbit = "Frodo";

    @Test
    public void testHobbitHasNameFrodo() {
        assertThat(hobbit)
                .startsWith("Fro")
                .endsWith("do")
                .isEqualToIgnoringCase("frodo");
    }
}
