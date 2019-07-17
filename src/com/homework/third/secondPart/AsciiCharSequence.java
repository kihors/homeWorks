package com.homework.third.secondPart;

public class AsciiCharSequence implements CharSequence {
    private byte[] content;

    public AsciiCharSequence(byte[] content) {
        this.content = content;
    }

    @Override
    public int length() {
        return content.length;
    }

    @Override
    public char charAt(int index) {
        return (char) content[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        byte[] result = new byte[end - start];
        int i = start;
        while (i < end) {
            result[i - start] = content[i];
            i++;
        }
        return new AsciiCharSequence(result);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(content.length);
        for (byte b : content) {
            result.append((char) b);
        }
        return result.toString();
    }
}
