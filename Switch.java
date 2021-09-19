//Switch case
import java.util.*;
public class Switch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch(num){
            case 1: System.out.println("hello");
            break;
            case 2: System.out.println("Namaste");
            break;
            case 3: System.out.println("bonjour");
            break;
            default: System.out.println("Invalid Input");
        }
    }
}