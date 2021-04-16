public class Bishop_MethodOverload
{
  //test overloaded squar methods
  public static void main(String[] args)
  {
    System.out.printf("Square of integer 7 is %d%n", square(7));
    System.out.printf("Square of double 7.5 is %f%n", square(7.5));
  }
  //square method with int arguement
  public static int square(int intValue)
  {
    System.out.printf("%nCalled square with int argument: %d%n", intValue);
    return intValue * intValue;
  }
  //Square method with double arguement
  public static double square(double doubleValue)
  {
    System.out.printf("%nCalled square with double argument: %f%n", doubleValue);
    return doubleValue * doubleValue;
  }
}//end class