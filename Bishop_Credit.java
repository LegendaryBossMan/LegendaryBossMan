import java.util.Scanner;

public class Bishop_Credit
{
  //Calculates the balance on several credit accounts
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter Account Number( or -1 to quit):");
    int account = input.nextInt(); //reads account number
    
    //exits if the input is -1; otherwise proceed
    while(account != -1)
    {
      System.out.print("Enter Balance:");
      double oldBalance = input.nextDouble();// read in balance
      
      System.out.print("Enter Charges:");
      double charges = input.nextDouble();//read charges
      
      System.out.print("Enter Credits:");
      double credits = input.nextDouble();//Read in credits
      
      System.out.print("Enter Credit Limit:");
      double creditLimit = input.nextDouble(); //reads credit limit
      
      //Calculate and display new balance
      double newBalance = (oldBalance + charges - credits);//calculates new balance
      System.out.printf("New balance = %f", newBalance);
      //Display warning if the user has exceed limit
      if(newBalance >creditLimit)
      {
         System.out.println();
        System.out.println("Credit limit exceeded");
      
        
      }
      System.out.printf("Enter Account Number(or -1 to quit):");
      account = input.nextInt(); //read in account number
    }
  }
}