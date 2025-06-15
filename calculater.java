
import java.util.Scanner;

public class calculater
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number 1:");
        int num1 = s.nextInt();
        System.out.println("Enter + , - , * , / :");
        char op = s.next().charAt(0);
        System.out.println("Enter Number 2:");
        int num2 = s.nextInt();
        int result;
        switch (op) {
            case '+':
                result = num1+num2;
                System.out.println("Result :"+result);
                break;
            case '-':
                result = num1-num2;
                System.out.println("Result :"+result);
                break;
            case '*':
                result = num1*num2;
                System.out.println("Result :"+result);
                break;
            case '/':
                if(num2==0)
                {
                    System.out.println("Any number which is divides by ZERO Will Be Infinity .");
                }
                else
                {
                    result = num1/num2;
                    System.out.println("Result :"+ result);
                    break;
                }
            default:
                System.out.println("Invalid Input !");
                break;
        }
        
    }
}