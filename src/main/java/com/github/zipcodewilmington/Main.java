package com.github.zipcodewilmington;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        char guess;
        String word = "";
        int tries = 0;
        String guessLines = "";
        String quit = "y";
        StringBuilder sb = new StringBuilder(guessLines);

        String[] words = {"violin", "guitar", "cello", "viola", "tuba", "saxophone", "drums", "bass", "harp", "accordion", "trumpet", "trombone", "oboe", "clarinet"};

        //needs to be a new word after each run throuh
        int randomNum = rand.nextInt(words.length);
        //NEEDS WHILE LOOP
        word = words[randomNum];
        for (int i = 0; i < word.length(); i++) {
            sb.append("_");
        }

        System.out.println("Let's Play WordGuess!");

        while (quit.equals("y")) {

        //Check to see if any letter is the same
            //.contains? how do we check the index of the letter
            //use charAt?
            // and remove the guess line above?
 //is this 1 - 10?



        //Welcome

        //recurring guess prompt
        System.out.println("Current Guesses: ");
        System.out.println(sb);
        System.out.println("Checking randomizer: " + word);


        //creates the scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a single character: ");
        guess = scanner.next().charAt(0);

//            System.out.println(guess);
            if(String.valueOf(guess).equals("-")) {
                System.out.println("quitting...");
                break;
            }


            if(word.contains(String.valueOf(guess))) {
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guess) {
                        sb.setCharAt(i, guess);
                    }
                }
            } //could add a for loop if I want the user to lose tries for same letters

            tries++;

        if (String.valueOf(sb).equals(word)) {
            System.out.println(sb);
            System.out.println("YOU GOT IT!");
            Scanner scan = new Scanner(System.in);
            System.out.println("Would you like to play again? (y/n)");
            quit = scan.nextLine();
            randomNum = rand.nextInt(words.length);
            word = words[randomNum]; //this isn't randomizing again
            sb.setLength(0);
            for (int i = 0; i < word.length(); i++) {
                sb.append("_");
                tries = 0;
            }
        }

            if (tries == word.length() && !String.valueOf(sb).equals(word)) {
                System.out.println("You lost...");
                Scanner scan = new Scanner(System.in);
                System.out.println("Would you like to play again? (y/n)");
                quit = scan.nextLine();
                randomNum = rand.nextInt(words.length);
                word = words[randomNum];
                sb.setLength(0);
                for (int i = 0; i < word.length(); i++) {
                    sb.append("_");
                    tries = 0;

                }
            }


    }
        //needs a loop for the number of tries left


    }
}
