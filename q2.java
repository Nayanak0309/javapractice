// Q3. Create classes Animal → Dog using inheritance.

// Animal: eat()

// Dog: bark()

// Create object and call methods.



class animal{
    void eat(){
        System.out.println("eats");
    }
}
class dog extends animal{
    void bark(){
        System.out.println("barks");
    }
}
public class q2{
    public static void main(String[] args) {

        dog d = new dog();
        d.eat();
        d.bark();
    }
}