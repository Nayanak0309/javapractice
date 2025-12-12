// Create a class Student with attributes name, roll, marks. Print student details.
//  Create a class Calculator with add(), sub(), mul(), div() methods. 

// class student1{
//     String name;
//     int roll;
//     int marks;
//     void display(){
//         System.out.println("name "+name+" \nroll "+roll+"\nmarks "+marks);
//     }
// }

// public class studentOf {
//     public static void main(String[] args) {
//         student1 stu=new student1();
//         stu.name="nayana";
//         stu.roll=101;
//         stu.marks=20;
//         stu.display();
//     }
    
// }




//  Create a class Calculator with add(), sub(), mul(), div() methods. 
// class Calculators{
//     int add(int a,int b) {return a+b;}
    
//     int sub(int a,int b) {return a-b;}
//     int mul(int a,int b) {return a*b;}
//     int div(int a,int b) {return a/b;}
// }
// public class cal{
//     public static void main(String[] args) {
//         Calculators c = new Calculators();
//         System.out.println(c.add(10,30));
//         System.out.println(c.sub(10,4));
//         System.out.println(c.mul(10,50));
//         System.out.println(c.div(20,9));
//     }
// }



// Create a class BankAccount with deposit() and withdraw() functions.

// class BankAccount{
//     int balance = 1000;
    

//     void deposit(int amt){
//         balance += amt;
//         System.out.println("the amout is deposite is"+amt);
//     }
//     void withdraw(int amt){
//         if(balance >= amt){
//             balance -= amt;
//             System.out.println("withdraw amout is"+amt);
//         }else{
//             System.out.println("the amout is insuffent");
//         }
//     }
// }
// public class banks{
//     public static void main(String[] args) {
//         BankAccount b = new BankAccount();
//         b.deposit(500);
//         b.withdraw(500);
//         System.out.println(b.balance);
//     }
// }