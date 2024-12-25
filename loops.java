import java.util.*;
public class loops {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int user_input = sc.nextInt();
        int count = 0;
        int sum = 0;
        while (count <=user_input) {
            sum +=count;
            count++;
        }
        System.out.println(sum);
    }
}
