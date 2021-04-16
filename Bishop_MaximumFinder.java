import java.util.Scanner;

public class Bishop_MaximumFinder
{
  // obtainthree float-point values and locate the maximum value
  public static void main(String[] arg)
  {
    //create Scanner for input from command window
    Scanner input = new Scanner(System.in);
    
    //prompt for and input three floating-point values
    System.out.print(
                     "Enter three floating-point values separated by spaces: ");
    double number1 = input.nextDouble(); //read first double
    double number2 = input.nextDouble(); //read second double
    double number3 = input.nextDouble();//read third double
    //determine the maximum value
    double result = maximum(number1, number2, number3);
    //display maximum value
    System.out.println("Maximum is:" + result);
  }
    //return the max of the three numbers
    public static double maximum(double x, double y, double z)
    {
      double maximumValue = x; //assume x is largest
      
      //determine whether y is greater
      if(y > maximumValue)
        maximumValue = y;
      //determine if z is greater than max
      if(z > maximumValue)
        maximumValue = z;
      
      return maximumValue;
    } //close double
  }//End Max finder
    