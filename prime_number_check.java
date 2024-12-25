import java.util.Scanner;

public class prime_number_check {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int user_input = sc.nextInt();
        boolean isprime = true;
        for ( int i =2 ; i <=user_input; i++ ){
            if (user_input % i == 0) {
                isprime =false;
            }

        }
       if ( isprime == true) {
        System.out.println("n is prime ");
        
       }else{
        System.out.println("it is not prime ");
       }
            
        
    }
} 
