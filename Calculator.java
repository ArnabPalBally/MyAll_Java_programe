import java.util.*;
public class Calculator{
    public static void main(String[] args){
        Scanner em = new Scanner(System.in);
        int a = em.nextInt();
        int b = em.nextInt();
        System.out.print(" for addition press 1 \nfor substract press 2\nfor multiplication press 3\nfor division press 4\n");
        int c = em.nextInt();
        switch(c){
            case 1 : int sum = a+b;
            System.out.println(sum);
            break;
            case 2 : if(a>b){
                int sub1 = a-b;
                System.out.println(sub1);
            }
            else{
                int sub2 = b-a;
                System.out.println(sub2);
            }
            break;
            case 3 : int mul = a*b;
            System.out.println(mul);
            break;
            case 4 :if(b==0){
                System.out.println("divison can't be perform");
            }
            else{
                int div = a/b;
                System.out.println(div);
            }
            break;
            default : System.out.println("Invalid Choice");
        }
    }
}
