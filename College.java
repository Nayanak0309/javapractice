
// Create a class Employee with default and parameterized constructor. 
// Create a class Car and initialize brand, model, price using constructor.
//  Create a class that copies one object’s data to another (copy constructor style).


// Create a class Employee with default and parameterized constructor. 
// class Employee{
//     String name;
//     int id;

//      Employee(){
//         name="unkonwwn";
//         id =0;
//         System.out.println(name);
//         System.out.println(id);

//     }
//     Employee(String s,int n){
//         name=s;
//         id=n;
//         System.out.println(name);
//         System.out.println(id);
//     }
    
// }
// public class Employees{
//     public static void main(String[] args) {
//         Employee e1 = new Employee();
//         Employee e2 = new Employee("nayana",101);
    
//     }
// }

// Create a class Car and initialize brand, model, price using constructor.

// class Car{
//     String brand, model;
//     int prize;

//     Car(String b,String m,int p){
//         brand=b;
//         model=m;
//         prize=p;
//        System.out.println(b+m+p);
//     }


// }
// public class carss{
//     public static void main(String[] args) {
//         Car c=new Car("toyota","s1",1023304);
//     }
// }


//  Create a class that copies one object’s data to another (copy constructor style).
// class Students{
//     String name;
//     int id;

//     Students(String n,int i){
//         name=n;
//         id=i;
//         System.out.println(name+" "+id);

//     }
//     Students(Students s){
//         name=s.name;
//         id=s.id;
//         System.out.println(name+" "+id);
//     }

    
// }
// public class College{
//     public static void main(String[] args) {
//         Students s1 = new Students("nayana",101);
//         Students s2=new Students(s1);
//     }
// }