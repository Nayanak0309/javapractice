
import java.util.Scanner;

class calObject {
    String name;
    String branch;
    public void person(){
        System.out.println("the name of the person is "+name+" branch is "+branch);
    }
}
public class calssAndObject{
    public static void main(String[] args) {
        calObject c = new calObject();
        Scanner sc = new Scanner(System.in);
        c.name="nayana";
        c.branch="cse";
        c.person();
    }
    
}
