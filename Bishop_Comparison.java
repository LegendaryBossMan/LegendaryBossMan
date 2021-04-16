import java.util.Scanner;
//Compare integers using if statements, relational operators
  //and Equalaity operators.
public class Bishop_Comparison // Welcome1 is a name
{
  //main method
  public static void main(String[] args)
  {
    //create Scanner to obtain input from command line
   Scanner input = new Scanner(System.in);
   
   int number1; //First number to compare
   int number2; //Second number to compare
   System.out.print("Enter first integer: ");//prompt
    number1 = input.nextInt();//read first number from user
   System.out.print("Enter second integer: "); //prompt
   number2 = input.nextInt();//read first number from user
   
   if(number1 == number2)
    System.out.printf( "%d == %d\n", number1, number2);
   if(number1 != number2)
    System.out.printf( "%d != %d\n", number1, number2);
      if(number1 < number2)
    System.out.printf( "%d < %d\n", number1, number2);
         if(number1 > number2)
    System.out.printf( "%d > %d\n", number1, number2);
            if(number1 <= number2)
    System.out.printf( "%d <= %d\n", number1, number2);
               if(number1 >= number2)
    System.out.printf( "%d >= %d\n", number1, number2);
  }//end main
}//end of Class Comparison