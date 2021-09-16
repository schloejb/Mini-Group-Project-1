/*
Mini Project 1
Group # 4: Luke Estey, Jacob Schloemer, Andrew Edelen, Ryan Schiell
Date: 9/16/21
*/

// Import scanner and random
import java.util.Scanner;
import java.util.*;

class Main {
  public static void main(String[] args) {
    //Define and initiate variables
    Scanner S = new Scanner(System.in);
    Random R = new Random();
    boolean isGuessed = false;
    int userNum;
    int toGuess;
    int numGuesses = 1;
    //Intro lines
    System.out.println("Welcome to the guessing game!");
    System.out.println("Please pick any positive number:");
    userNum = S.nextInt();
    toGuess = R.nextInt(userNum);
    //Notify player random has been generated and play game
    System.out.println("A random number to guess has been generated");
    playGame(isGuessed, toGuess, numGuesses, userNum);
  }
  public static void playGame(boolean isGuessed, int toGuess, int numGuesses, int userNum){
    //Create new scanner
    Scanner S = new Scanner(System.in);
    System.out.println("Guess a number between 0 and " + userNum);
    //Loop through the game
    while (isGuessed == false) {
      //Get new guess
      int userGuess = S.nextInt();
      //Guess is higher than actual
      if(userGuess > toGuess){
        System.out.println("Guess lower!");
        numGuesses++;
      }
      //Guess is lower than actual
      else if(userGuess < toGuess){
        System.out.println("Guess higher!");
        numGuesses++;
      }
      //Guess is correct
      else {
        isGuessed = true;
      }
    }
    //Notify player they won and tell them how many tries it took
    System.out.println("Great job, you win! It took you " + numGuesses + " tries.");
  }
}