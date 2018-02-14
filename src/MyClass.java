
import java.util.Scanner;

public class MyClass {

    public static void main(String[] args) {
      Scanner scan = new Scanner (System.in);
      System.out.println("Enter some number");
      int user_input_number = scan.nextInt();
        scan = new Scanner (System.in);
        System.out.println("Enter new number 2");
        int user_input_number2 = scan.nextInt();
        int answer = user_input_number + user_input_number2 ;
      System.out.println("The answer is:" + answer);
    }
    
}
