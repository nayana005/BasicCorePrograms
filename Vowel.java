package com.bridgelabz.basicprograms;

public class Vowel {
	
	public static void main(String[] args) {

        char ch = 'g';

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
        }
    }
}


