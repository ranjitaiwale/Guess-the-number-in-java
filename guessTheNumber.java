package com.company;

import java.util.Random;

import java.util.Scanner;

class Game {
    public int number;
    public int inputNumber;
    //  public int getNoOfGuesses(){
    //    return noOfGuesses;
    //}
    // public void setNoOfGuesses(int noOfGuesses){
    //   this.noOfGuesses = noOfGuesses;
    //}

    // public int noOfGuesses;
    Game() {
        Random rand = new Random();
        this.number = rand.nextInt(1000);

    }

    void takeUserInput() {
        System.out.println("Guess The Number: ");
        Scanner sc = new Scanner(System.in);

        inputNumber = sc.nextInt();
    }

    boolean isCorrectNumber() {
        if (inputNumber == number) {
            System.out.println("Congratulations......You win \n You guessed the correct number..... \n You are great....");

            return true;

        } else if (inputNumber < number) {
            System.out.println("Too less....");
        } else {
            System.out.println("Too big.....");
        }
        return false;
    }
}

public class guessTheNumber {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while (!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();

        }


    }
}