import java.util.*;
public class Evenodd{
    public  static void main(String[] args){
        Scanner em = new Scanner(System.in);
        int num = em.nextInt();
        if(num%2==0){
            System.out.println("EVEN NUMBER");
        }
        else{
            System.out.println("ODD NUMBER");
        }
    }
}