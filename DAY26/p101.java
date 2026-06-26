package DAY26;

// Write a program to create number guessing game.

import java.util.*;
public class p101 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=(int)(Math.random()*100)+1;
        int guess;
        System.out.println("Guess a number between 1 and 100: ");
        do
        {
            System.out.print("Enter your guess: ");
            guess=sc.nextInt();
            if(guess<1 || guess>100)
                System.out.println("Invalid input! Please enter a number between 1 and 100.");
            else if(guess<n)
                System.out.println("Too low! Try again.");
            else if(guess>n)
                System.out.println("Too high! Try again.");
            else
                System.out.println("Congratulations! You guessed the number.");
        }
        while(guess!=n);
    }
}
