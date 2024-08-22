import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean running = true;
    while (running) {
      System.out.println("Welcome to the calculator! Please enter the number corresponding to the action you would like to run.");
      System.out.println("(1) Add");
      System.out.println("(2) Subtract");
      System.out.println("(3) Multiply");
      System.out.println("(4) Divide");
      System.out.println("(5) Square Root");
      System.out.println("(6) Square");
      System.out.println("(7) Sin");
      System.out.println("(8) Cos");
      System.out.println("(9) Tan");
      System.out.println("(10) Natural Log ");
      System.out.println("(11) Exponential e");
      System.out.println("(12) Exit");
      System.out.println("\nEnter number here:");
      
      int choice = 0;
      try {
        choice = scanner.nextInt();
  
          if (choice == 12) {
            running = false;
            System.out.println("\nHave a good day! Good bye!");
          } else if (choice >= 1 && choice <= 4) {
              double num1 = 0;
              double num2 = 0;
              try {
                System.out.println("\nEnter the first number: ");
                num1 = scanner.nextDouble();
                System.out.println("\nEnter the second number: ");
                num2 = scanner.nextDouble();
                if(choice == 1) {
                  System.out.println("\nThe sum is: " + (num1 + num2) + "\n");
                } else if(choice == 2) {
                  System.out.println("\nThe difference is: " + (num1 - num2) + "\n");
                } else if(choice == 3) {
                  System.out.println("\nThe product is: " + (num1 * num2) + "\n");
                } else if(choice == 4) {
                  if(num2 != 0) {
                    System.out.println("\nThe answer is: " + (num1 / num2) + "\n");
                  } else {
                    System.out.println("\nThe answer is: Undefined\n");
                  }
                }
              } catch (InputMismatchException e) {
                System.out.println("Invalid input. Restarting calculator. Please enter a number.\n");
                scanner.nextLine(); 
              }
          
          
          } else if (choice >= 5 && choice <= 11) {
                double num = 0;
                try {
                  System.out.println("\nEnter your desired number: ");
                  num = scanner.nextDouble();
                  if(choice == 5) {
                    if(num < 0)
                      System.out.println("Invalid input. Restarting calculator. Please enter a number that is greater than or equal to zero.\n");
                    else
                    System.out.println("The answer is " + Math.sqrt(num) + "\n");
                  } else if(choice == 6) {
                    System.out.println("The answer is " + Math.pow(num, 2) + "\n");
                  } else if(choice == 7) {
                    System.out.println("The answer is " + Math.sin(num) + "\n");
                  } else if(choice == 8) {
                    System.out.println("The answer is " + Math.cos(num) + "\n");
                  } else if(choice == 9) {
                    System.out.println("The answer is " + Math.tan(num) + "\n");
                  } else if(choice == 10) {
                    if(num <= 0)
                      System.out.println("Invalid input. Restarting calculator. Please enter a number that is greater than zero.\n");
                    else
                    System.out.println("The answer is " + Math.log(num) + "\n");
                  } else if(choice == 11) {
                    System.out.println("The answer is " + Math.exp(num) + "\n");
                  } 
                } catch (InputMismatchException e) {
                  System.out.println("Invalid input. Restarting calculator. Please enter a number.\n");
                  scanner.nextLine(); 
                }


            }
        if(choice <=0 || choice >= 13) {
            System.out.println("\nInvalid input. Please enter a number between 1 and 5.\n");
          }
      } catch (InputMismatchException e) {
        System.out.println("Invalid input. Restarting calculator. Please enter a number between 1-12.\n");
        scanner.nextLine(); 
      }
    }
  }
}
      
    
  // Your calculator should do the following operations: Add, Subtract, Multiply, and Divide. The calculator should run until the user chooses the option to exit.Youu must make to not divide by zero.Make sure that for any calculations the input is a number.
