package com.github.zipcodewilmington;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int index;
        String guess = "";

        String words[] = {"violin", "guitar", "cello", "viola", "tuba", "saxophone", "drums", "bass", "harp", "accordion", "trumpet", "trombone", "oboe", "clarinet"};

        //needs to be a new word after each run through
        int randomNum = rand.nextInt(words.length); //is this 1 - 10?
        String word = words[randomNum];
        String guessLines = "";

        //NEEDS WHILE LOOP

        for (int i = 0; i < word.length(); i++) {
            //might be in the wrong place
            if(word.contains(guess)) {
                index = word.indexOf(guess);
            }

            guessLines = guessLines + "_ ";

        }
        //Check to see if any letter is the same
            //.contains? how do we check the index of the letter
            //use charAt?
            // and remove the guess line above?


        //Welcome
        System.out.println("Let's Play WordGuess!");

        //recurring guess prompt
        System.out.println("Current Guesses: ");
        System.out.println(guessLines);
        System.out.println("Checking randomizer: " + word);


        //creates the scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a single character: ");
        guess = scanner.nextLine().toLowerCase(); //added toLowerCase

        //needs a loop for the number of tries left


    }
}
