public class Bishop_Increment
{
  public static void main(String[] args)
  {


//demonstrate postfix increment operator
    int c = 5;
     System.out.printf("c : %d%n",c);//prints c
     System.out.printf("  c++ : %d%n", c++);//prints c++
     System.out.printf(" c after c++: %d%n", c);//prints c
    
    System.out.println();// skip a line
    
    //demonstrate prefix increment operator
    c=5;
    System.out.printf(" c: %d%n", c);//prints c
    System.out.printf(" ++c: %d%n", ++c);//prints ++c
    System.out.printf(" c after ++c: %d%n", c);// prints c
  }
}// end class Increment