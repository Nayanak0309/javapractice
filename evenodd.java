
import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("even no");

        }
        else{
            System.out.println("odd number");
        }
    }
}
