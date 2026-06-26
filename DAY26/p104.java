package DAY26;

// Write a program to create quiz application.

import java.util.*;
public class p104 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int score=0;
        System.out.println("Welcome to Quiz Application");
        System.out.println("Question 1: What is the capital of India?");
        System.out.println("a. New Delhi");
        System.out.println("b. Mumbai");
        System.out.println("c. Kolkata");
        System.out.println("Enter your answer:");
        char ans1=sc.next().charAt(0);
        if(ans1=='a')
        {
            System.out.println("Correct answer");
            score++;
        }
        else
            System.out.println("Wrong answer");
        System.out.println("Question 2: How many days are there in a week?");
        System.out.println("a. 5");
        System.out.println("b. 6");
        System.out.println("c. 7");
        System.out.println("Enter your answer:");
        char ans2=sc.next().charAt(0);
        if(ans2=='c')
        {
            System.out.println("Correct answer");
            score++;
        }
        else
            System.out.println("Wrong answer");
        System.out.println("Question 3: What is the largest planet in our solar system?");
        System.out.println("a. Earth");
        System.out.println("b. Jupiter");
        System.out.println("c. Saturn");
        System.out.println("Enter your answer:");
        char ans3=sc.next().charAt(0);
        if(ans3=='b')
        {
            System.out.println("Correct answer");
            score++;
        }
        else
            System.out.println("Wrong answer");
        System.out.println("Question 4: Java is a:");
        System.out.println("a. Programming Language");
        System.out.println("b. Operating System");
        System.out.println("c. Database");
        System.out.println("Enter your answer:");
        char ans4=sc.next().charAt(0);
        if(ans4=='a')
        {
            System.out.println("Correct answer");
            score++;
        }
        else
            System.out.println("Wrong answer");
        System.out.println("Quiz completed.");
        System.out.println("Your score is: "+score);
    }
}
