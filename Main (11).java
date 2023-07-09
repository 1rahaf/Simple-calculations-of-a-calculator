import java.util.Scanner;
public class Main {

 

    public static void main(String[] args) {

 

        System.out.println("**Java program*");

        System.out.println("SIMPLE CALCULATOR");

        System.out.println("What type of operation you want to perform on calculator? ");

        System.out.println(" 1-Displays message");

        System.out.println(" 2-Perform addition on the user input data ");

        System.out.println(" 3-Perform subtraction on the inputs ");

        System.out.println(" 4-Perform multiplication on the inputs ");

        System.out.println(" 5-Perform division on the inputs ");

        System.out.println(" 6-EXIT from the program ");

        System.out.println("Please press any number (1-5) to continue:");

        System.out.println("Press 6 for exit");

       

        

        Scanner in = new Scanner(System.in);

        int num1,num2,result;

        char operator = in.next().charAt(0);

        

        System.out.println("Enter first number: ");

         num1 = in.nextInt();

 

        System.out.println("Enter second number");

         num2 = in.nextInt();

        

       

        switch(operator)

         

        {

             case '1':

          System.out.println(" Start calculator program");

           break;

            case '2':

 

              result=num1 + num2;

 

              System.out.println(num1 + " + " + num2 + " = " + result);

 

                break;

 

            case '3':

 

                 result=num1 - num2;

 

                 System.out.println(num1 + " - " + num2 + " = " + result);

 

                break;

 

            case '4':

 

                result= num1 * num2;

 

                System.out.println(num1 + " * " + num2 + " = " + result);

 

                break;

 

            case '5':

 

                 result=num1 / num2;

 

                System.out.println(num1 + " / " + num2 + " = " + result);

 

                break;

               

                case '6':

                     System.out.println("This program terminates with the exit ");

                    System.exit(0);

                 break;

 

            default:

 

                System.out.println("Error! operator is not correct");

 

                break;

 

        }

 

    }

 

}