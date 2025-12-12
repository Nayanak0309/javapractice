// 4. Polymorphism
//  Method overloading example: area(int r), area(int l, int b).
//  Method overriding example: Animal.eat() is overridden in Dog class. 
// Runtime polymorphism: create parent reference and child object.



//  Method overloading example: area(int r), area(int l, int b).
// class shape{
//     void area(int r){
//         System.out.println("area of circle"+(3.14*r*r));
//     }
//     void area(int l,int b){
//         System.out.println("area of rectange "+(l*b));
//     }
// }
// public class polymorpisum {
//     public static void main(String[] args) {
//         shape s = new shape();
//         s.area(10);
//         s.area(10, 20);
//     }
    
// }

//  Method overriding example: Animal.eat() is overridden in Dog class. 
// class Animals{
//     void eat(){
//         System.out.println("earing");
//     }
// }
// class Dog extends Animals{
//     void eat(){
//         System.out.println("dog eating");
//     }
// }
// public class overrriding{
//     public static void main(String[] args) {
//         Dog d = new Dog();
//         d.eat();
//     }
// }

// Runtime polymorphism: create parent reference and child object
// class Parents{
//     void father(){
//         System.out.println("fathert take care of children");
//     }
// }
// class child extends Parents{
//     void father(){
//         System.out.println("son take cares of father");
//     }
// }
// public class Runtime{
//     public static void main(String[] args) {
//         Parents p= new Parents();
//         p.father();

//     }
// }