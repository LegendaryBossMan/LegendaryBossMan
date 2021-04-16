import java.util.Scanner;

public class AccountTest
{
  public static void main(String[] args)
  {
    //take input
    Scanner input = new Scanner(System.in);
    //creat account object
    Account myAccount = new Account();
    
    //show intial value of name
    System.out.printf("Initial name is: %s%n%n", myAccount.getName());
    
    //prompt for name
    System.out.println("Please enter the name:");
    //read name
    String theName = input.nextLine();
    myAccount.setName(theName);// puts theName in myAccount
    System.out.println();// blank line
    
    //display name in myAccount
    System.out.printf("Name in objecgt myAccount is %n%s%n", myAccount.getName());
  }
}//end AccountTest