public class Bishop_Init_Array
{
  public static void main(String[] args)
  {
    //initialize list in array for each element
    int[] array = { 32, 27,  64, 18, 95, 14, 90, 70, 60, 37 };
    
    System.out.printf("%s%8d%n", "Index", "Value"); //column headings
    //output each array element's value
    for(int counter = 0; counter < array.length; counter++)
      System.out.printf("%5d%8d%n", counter, array[counter]);
  
  }}//end class