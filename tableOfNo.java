
import java.util.Scanner;

public class tableOfNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no  ");
        int n = sc.nextInt();
        for(int i=0;i<=10;i++){
            System.out.println(n+"X"+i+"="+(i*n));
        }
    }
    
}
