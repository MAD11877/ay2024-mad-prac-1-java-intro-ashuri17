import java.util.Scanner;

public class Question4 {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    for (int i = num; i > 0; i--) 
    {
      for (int j = 0; j < i; j++) 
      {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
