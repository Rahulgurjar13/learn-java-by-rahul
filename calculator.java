import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        int b = sc.nextInt();
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+':
            System.out.println("this is the sum of a+b "+(a+b));
                break;
            case '-':
            System.out.println("this is the sum of a-b "+(a-b));
                break;
            case '*':
            System.out.println("this is the sum of a*b "+(a*b));
                break;
            case '/':
            System.out.println("this is the sum of a/b "+(a/b));
                break;
        
            default:
                break;
        }
    }
}
