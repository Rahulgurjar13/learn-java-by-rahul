import java.util.Scanner;

public class reverse_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        while ( number>0) {
            int last_digit =number%10;
        System.out.println(last_digit);
            number = number/10;
            
        }
        System.out.println();
    }
}
