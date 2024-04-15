import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {

    Scanner in = new Scanner(System.in); // import Scanner Class
    System.out.print("Enter the number of integers you would like to input: ");
    int num = in.nextInt();
    int[] numArray = new int[num]; //create array of size num\
    //add integers into numArray
    for (int i = 0; i < num; i++){
      System.out.print("Enter an integer: ");
      numArray[i] = in.nextInt();
    }
    //Find mode in set of integers
    
    int mode = 0;
    int modeNumber = 0;
    for(int i: numArray)
    {
      int countSameNum = 0;
      for(int j: numArray)
      {
        if (i == j)
        {
          countSameNum++;
        }
      }
      if (countSameNum > mode)
      {
        mode = countSameNum;
        modeNumber = i;
      }
    }
    System.out.println("The mode is " + modeNumber);
  }
}
