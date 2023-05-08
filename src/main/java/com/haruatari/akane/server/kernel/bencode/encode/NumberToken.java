package com.haruatari.akane.server.kernel.bencode.encode;

public class NumberToken implements EncodableToken {
    private int value;

    public NumberToken(int value) {
        this.value = value;
    }

    @Override
    public String encode() {
      return "i" + value + "e";
    }
}
