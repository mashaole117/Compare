package com.compare;

import java.util.Scanner;

public class Compare {
  public static void main(String[] args) {
    int numStrings;
    int similarStringCount = 0, similarLetterCount = 0;

    Scanner in = new Scanner(System.in);

    System.out.println("How many strings are you comparing?\n");

    numStrings = in.nextInt();
    in.nextLine();

    String[] strings = new String[numStrings];

    for (int i = 0; i < numStrings; i++) {
      System.out.println("Enter a string: ");
      strings[i] = in.nextLine();
    }

    for (int i = 0; i < numStrings; i++) {
      for (int j = 0; j < numStrings; j++) {
        if (strings[i].length() == strings[j].length() && i != j) {
          int numLetters = strings[i].length();

          char[] chars1 = strings[i].toCharArray();
          char[] chars2 = strings[j].toCharArray();

          for (int k = 0; k < numLetters; k++) {
            for (int l = 0; l < numLetters; l++) {
              if (chars1[k] == chars2[l]) {
                similarLetterCount++;
                chars2[l] = '_';
              }
            }
          }
          if (similarLetterCount == numLetters) {
            System.out.println("\nString " + strings[i] + " is equal to " + strings[j]);
            similarStringCount++;
          }
          similarLetterCount = 0;
        }
      }
    }
    System.out.println("\nThere are " + similarStringCount + " similar strings");
  }

}

