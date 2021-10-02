package com.company;
// LINE TEXT PROJECT 
//Counting Strings of an Input
// Bernard Owusu Sefah
public class Bernard_OwusuSefah_LineText {

    public static void main(String[] args) {
        // String input 
        String input = "Now is the time for all good men to come to the aid of their country.";
       // Convert the input to lower case 
        input = input.toLowerCase();
        String[] strTokens = input.split("\\s+");
        char[] chars = input.toCharArray();
        int chAmount = 0;
        int stringT = strTokens.length;
        //create a 26 array sized for frequency
        int[] frequency = new int[26]; // new frequency array
        String Alphabet = "abcdefghijklmnopqrstuvwxyz";
        // converts the string of alphabet into a character array
        char[] AlphabetA = Alphabet.toCharArray(); 
       // runs through the input to find every letter at each index and count it
        for (int i = 0; i < input.length(); i++) {
            char temp = input.charAt(i);
            int chValue = (int) temp;
            if (chValue >= 97 && chValue <= 122) {
                chAmount++;
            }
        }
      
        for (int i = 0; i < chars.length; i++) {
            if (Character.isLetter(chars[i])) {
                for (int a = 0; a < Alphabet.length(); a++) {
                    if (AlphabetA[a] == chars[i]) {
                        frequency[a] = frequency[a] + 1;
                    }
                }
            }
        }
        System.out.println("The line contains: ");
        System.out.println(chAmount   + " letters");
        System.out.println("The line contains: ");
        System.out.println(stringT  + "  string tokens");
        System.out.println("The frequency of letters is: ");
        // runs through the sentence and counts the number of times each alphabet shows up in the sentence
        // and prints it
            for (int i = 0; i < AlphabetA.length; i++) {
                AlphabetA[i] = Character.toUpperCase(AlphabetA[i]);
                if (frequency[i] > 0) {
                    System.out.printf("\n%1s%1s%1s", AlphabetA[i], " -- ", frequency[i]);

                }
            }
        }
    }
