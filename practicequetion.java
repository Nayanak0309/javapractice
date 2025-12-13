
// import java.util.Scanner;






// public class practicequetion {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the string");
//         String s = sc.nextLine();
//         String rev="";
//         for(int i=s.length()-1;i>=0;i--){
//             rev +=s.charAt(i);
//         }
//         System.out.println(""+rev);

//     }
    
// }


// reverse the no
// public class reverseno{

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the no ");
//         int a = sc.nextInt();
//         int rev = 0;

//         while(a!=0){
//             int digit = a%10;
//             rev=rev*10+digit;
//             a=a/10;
//         }

//         System.out.print(rev);
//     }

// }


// 2️⃣ Check if String is Palindrome
// public class Palindomm{

//    public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);
//          System.out.println("enter the words ");
//          String s=sc.nextLine();
//          String rev="";
//          for(int i = s.length()-1;i>=0;i--){
//             rev +=s.charAt(i);

//          }
//          System.out.print(s.equals(rev));

//    }
// }

// 3️⃣ Count Occurrences of a Character
// public class countChar{

//    public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the words ");
//         String s=sc.nextLine();
//         System.out.print("enter the couting word");
//         char c=sc.next().charAt(0);
//         int count=0;
//         for (char i:s.toCharArray()){
//             if(i==c){
//                 count++;

//             }

//         }
//         System.out.println("the string "+s+" the couting word"+c+"is i"+count);
//    }
// }


// public class countChar{

//    public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the words ");
//         String s=sc.nextLine();
//         System.out.print("enter the couting word");
//         char c=sc.next().charAt(0);
//         int count=0;
//         for (int i=s.length()-1;i>=0;i--){
//             if(s.charAt(i)==c){
//                 count++;

//             }

//         }
//         System.out.println("the string "+s+" the couting word"+c+"is i"+count);
//    }
// }


// 4️⃣ Find Duplicate Characters
