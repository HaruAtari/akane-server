package com.haruatari.akane.server.kernel.bencode;

import com.haruatari.akane.server.kernel.bencode.encode.NumberToken;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberTokenTest {
    @Test
    public void enCodeTest() {
        assertEquals("i5e", new NumberToken(5).encode());

        assertEquals("i-5e", new NumberToken(-5).encode());

        assertEquals("i0e", new NumberToken(0).encode());

        assertEquals("i1000000e", new NumberToken(1000000).encode());
    }
}
