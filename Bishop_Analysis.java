/*The user enters either a 1 or a 2, indicating a pass or a fail, and the program outputs the user?s entry, and then calculations the number of passes (1s), 
//and the number of failures (2s). Notice the test for equality is the double-equals sign (==). This test is laced inside the while loop, and the 
//while loop runs 10 times. The counter variable, called studentCounter is initialized to 1, and the loop condition evaluates to true as long as the value of studentCounter is less than or equal to 10. 
//If the number of passes is greater than 8, the program outputs a different message than if the number of passes is less than 8.*/

//Program uses class Scanner
import java.util.Scanner;

public class Bishop_Analysis
{
  public static void main(String[] args)
  {
//create Scanner to obtain input from the command window
   
Scanner input = new Scanner(System.in);
//initializing variables in declarations, use passes, failures, and studentCounter
int passes = 0;
int failures = 0;
int studentCounter = 0;

//process 10 students using a counter-controlled loop
    while (studentCounter <= 10)
    {
      //prompt user for input (1 or 2) and obtain value from user, set value to int result
     System.out.print("Enter result (1 = pass, 2 = fail): ");
     int result = input.nextInt();
      
      //if ..else is nested in the while statement to count passes and failures
    if(result == 1)
       passes = passes + 1;
     else
       failures = failures + 1;
    
    //increment student counter so loop eventually terminates
    studentCounter = studentCounter + 1;
    }
   

//Display results
  System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);
  
//determine whether more than 8 students passed and display "Bonus to instructor!"
  if(passes > 8)
    System.out.println("Bonus to instructor!");
  }
}//End class Analysis
