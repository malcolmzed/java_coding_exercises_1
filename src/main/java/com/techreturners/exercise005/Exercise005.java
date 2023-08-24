package com.techreturners.exercise005;

public class Exercise005 {

    public boolean isPangram(String input) {

        String lowerInput = input.toLowerCase();
        String letters26 = "abcdefghijklmnopqrstuvwxyz";

        int ascii;
        int offset;

        char aChar = 'a';
        int aInt = aChar;

        char[] chars = letters26.toCharArray();
        int counter = 0;

        for (int i = 0; i < lowerInput.length(); i++) {
            ascii = lowerInput.charAt(i);
            offset = ascii - aInt;

            if (offset >= 0 && offset < 26 && chars[offset] != '+') {
                counter++;
                chars[offset] = '+';
            }


        }
        return (counter == 26) ?  true : false;
    }
}
