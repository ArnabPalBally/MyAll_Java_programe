import java.util.*;
public class Checking{
    public static void main(String[] args){
        Scanner sm = new Scanner(System.in);
        int a = sm.nextInt();
        int b = sm.nextInt();
        if(a == b){
            System.out.println("same number");
        }
        else if(a>b){
                System.out.println(" a is greater than" );
        }
        else{
            System.out.println("a is lesser than");
        }
        
        
    }
}