//Example of a do-while loop 

public class Bishop_DoWhileTest
{
  public static void main(String[] args)
  {

    int counter = 1;
//for statement header includes initialization, loop-continuation condition, and increment
     //declare and initialize control variable
    do
    {
     System.out.printf("%d ", counter);
     ++counter;
    }
    while (counter <= 10);
System.out.println();// skip line
  }
}// end class DoWhileTest