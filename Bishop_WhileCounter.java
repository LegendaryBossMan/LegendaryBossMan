//This Java class uses elements of counter-controlled repetition and uses
//a loop to display the numbers from 1 through 10.
public class Bishop_WhileCounter
{
public static void main(String[] args)
{
//demonstrate postfix increment operator
 
//declare and initialize control variable
  int num = 1;
  
while (num <=10)//loop-continuation condition
{
  System.out.printf("%d ", num);
  ++num;
}

  
System.out.println();// skip a line
}
}// end class Increment