//The switch multiple-selection statement can be sued to perform different actions based on the possible values 
//of a constant integral expression. The program LetterGrades reads an arbitrary number of integer grades from the 
//user using sentinel-controlled repetition, updates instance variables total and gradeCounter, and increments an 
//appropriate letter-grade counter for each grade entered. The output is a report containing the total of all grades 
//entered, the average of the grades and the number of students who received each letter grade.



//GuidedAssignment7
import java.util.Scanner;

public class Bishop_LetterGrades
{
  public static void main(String[] args)
  {
    //variables for total, gradeCounter, and a-fCount
    int total = 0;//Sum of grades
    int gradeCounter = 0;//# of grades entered
    int aCount = 0;//Count for A grades
    int bCount = 0;//Count for B grades
    int cCount = 0;//Count for C grades
    int dCount = 0;//Count for D grades
    int fCount = 0;//Count for F grades
    

    //scanner input
    
    Scanner input = new Scanner(System.in);
    //prompt for grade and set input to grade
    System.out.printf("Enter the grades in rang of 0-100");
    System.out.println("Type end-of-file to terminate");
    System.out.printf("To terminate type <Ctrl>  z, then press Enter on Windows %nOn others type <Ctrl> d then press Enter");
       
    
    //while loop
    while (input.hasNext())
    {
      int grade = input.nextInt();//reads grade
      total += grade;// adds grade to total
      ++gradeCounter; //increase gradeCounter
      //increment letter grade counters with switch statement
   switch(grade / 10)
   {
     case 9: // grade is 90 
     case 10: // grade is 100
       ++aCount;//increases # of A's
     break;//exits switch
     
     case 8: //grade between 80 and 90 or 89
     ++bCount;//Increase # of B's
     break; //breaks from B's
       
     case 7://grades for C's aka 70-79
       ++cCount;//Increase # in C's
     break;//Break fro C's
     
     case 6://D's aka 60-69
       ++dCount;// Increase
       break;//break
     default://Grade less than 60
       ++fCount; //Increase f grade
     break; //break from f
   }//end of switch
    }//end while
  
          
   
    //if user entered at least one grade...
    if(gradeCounter != 0)
    {
      //calculate average of all grades
    double average = (double) total / gradeCounter;
      System.out.printf("The Class Average is %.2f%n", average); 
      
      //output summary of results
      System.out.printf("Total of the %d grade enter is %d%nn", gradeCounter, total);
      System.out.println();
      System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n", "Number of students who received grades:",
                        "A: ", aCount, 
                        "B: ",bCount,
                        "C: ", cCount,
                        "D: ", dCount,
                        "Failed: ", fCount);
                        }//end if
    else// no grades inputed
      System.out.println("No grades were entered");
      
  
  }//end main
}//end class
