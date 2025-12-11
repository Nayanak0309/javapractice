class student{
    private  String name;

    void setName(String name){
        this.name=name;
    }
    String getName(){
        return name;
    }
}


public class q1 {
    public static void main(String[] args) {

        student s = new student();
        s.setName("nayana");
        System.out.println(s.getName());
        
    }
    
}
