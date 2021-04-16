import java.util.Scanner;
public class UniqueTest //Bishop_Final Exam
{
public static void main(String[] args) 
{
 
        int array[] = new int[6];

        int count = 0; 
        int x = 0;
        int num = 0;

        while (x < array.length) //Enter up to 5 numbers loops, with check for above 10 but less than 100
            {
          Scanner input = new Scanner(System.in);
            System.out.println("Enter number: ");
            num = input.nextInt();

            if ((num >= 10) && (num <= 100)) 
            {
                boolean number = false;
                x++;

                for (int i = 0; i < array.length; i++) 
                 {   if (array[i] == num)     
                     number = true;
                 }  

            if (!number) //if/else checks for if the number has already been entered
            {
              
                    array[count] = num;

                    count++;

            } 

                else

                System.out.printf("the number was entered before \n");

                      }

              else
               System.out.println("number must be between 10 and 100");


            for (int i =0;  i < x; i++) 
            {
              if(array[i]!=0)//ensures the number that has been entured doesnt become 0 in the array
           
                System.out.print(array[i] +" ");

            }

            System.out.println();  
        } 

        } 
    } 