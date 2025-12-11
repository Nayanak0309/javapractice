class vehical{
    void sound(){
        System.out.println("the car is good condition");
    }
}
class car extends vehical{
    void honk(){
        System.out.println("the honk sound is irritating");
    }
}



public class inheritance {
    public static void main(String[] args) {
        car c = new car();
        c.sound();
        c.honk();
    }
    
}
