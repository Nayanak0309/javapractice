class addition{
    int add(int a, int b){
        return a+b;
    }
    double add(double a,double b){
        return a+b;
        
    }

}
//Runtime (Method Overriding): Subclass provides its own version of a parent method.
class vehicals{
    void washs(){
        System.out.println("wash the car");
    }
}
class cars extends vehical{
    void washs(){
        System.out.println("drive the car");
    }
}

public class polymorphisam {
    public static void main(String[] args){
        addition a = new addition();
        cars c = new cars();
        System.out.println(a.add(10,30));

        
        c.washs();
    }
    
}
