import java.util.Scanner;

public class multiple_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       do {
        int user_input = sc.nextInt();
        if (user_input %2 ==0) {
            break;
            
        }
        System.out.println(user_input);
       } while (true);
}
}