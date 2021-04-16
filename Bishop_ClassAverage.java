/*(Find the Largest Number) The process of finding the largest value is used frequently in computer applications. For example, a program that determines the winner of a sales contest would input the number of units sold by each salesperson. The salesperson who sells the most units wins the contest. Write a Java application that inputs a series of 10 integers and determines and prints the largest integer. Your program should use at least the following three variables, and you should name the variables counter, number, and largest.

counter : A counter to count to 10 (i.e., to keep track of how many numbers have been input and to determine when all 10 numbers have been processed).
number : The integer most recently input by the user.
largest : The largest number found so far.
Call the program Largest. The output should read: “Largest number is (whatever the largest number is that the user has selected). Use a System.out.printf() statement for this.
//Program uses class Scanner */
import java.util.Scanner;

public class Bishop_MidTerm
{
  public static void main(String[] args)
  {
//create Scanner to obtain input from the command window
    
    Scanner input = new Scanner(System.in);
   
//initialization phase
    
     int sum = 0;
    //initialize # of grade to be entered next
     int gradeCounter = 1;

//processing phase uses counter-controlled repition
//Create a while loop to prompt for a grade, set it equal to grade, add it to total, and increment gradeCounter
    while (count  ==10) // loops 10 times
     {
       System.out.print("Enter Number");
      int number = input.nextInt();
     System.out.print("%d%n", number);
       count = count + 1;
    }


    
int largest;

    System.out.printf("Largest Number is %d%n", largest);
  }
}
//end ClassAverage

