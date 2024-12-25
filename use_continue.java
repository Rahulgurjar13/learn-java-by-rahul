import java.util.*;;
public class use_continue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("type number here :-  ");
            int user_input = sc.nextInt();
            if (user_input % 10 == 0) {
                continue;
                
            }System.out.println(user_input );
            
        } while (true);
        
}
}
