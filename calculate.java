
// import java.util.Scanner;

// public class calculate {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the a ");
//         int a = sc.nextInt();
//         System.out.println("enter the b ");
//         int b = sc.nextInt();
//         System.out.println("enter the operator ");
//         char operator = sc.next().charAt(0);
//         double result;

//         switch (operator) {
//             case '+': 
//                result=a+b;
//                System.out.println("sum of a and b"+result);
//                 break;
//             case '-': 
//                result=a-b;
//                System.out.println("diff of a and b"+result);
//                 break;
//             case '*': 
//                result=a*b;
//                System.out.println("mul of a and b"+result);
//                 break;
//             case '/': 
//                result=a/b;
//                System.out.println("div of a and b"+result);
//                 break;
//             case '%': 
//                result=a%b;
//                System.out.println("mod of a and b"+result);
//                 break;
            
//             default:
//                 throw new AssertionError();
//         }
//         sc.close();

//     }
    
// }
// ...existing code...
public class calculate {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("enter the a ");
        int a = sc.nextInt();
        System.out.println("enter the b ");
        int b = sc.nextInt();
        System.out.println("enter the operator ");
        char operator = sc.next().charAt(0);

        double result = switch (operator) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> {
                if (b == 0) {
                    System.out.println("Cannot divide by zero");
                    yield Double.NaN;
                } else {
                    yield (double) a / b;
                }
            }
            default -> {
                System.out.println("Unknown operator: " + operator);
                yield Double.NaN;
            }
        };

        System.out.println("Result: " + result);
    }
}
// ...existing code...