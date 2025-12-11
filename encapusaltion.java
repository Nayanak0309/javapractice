public class encapusaltion {

    private String name;

    public void setdata(String name){
        this.name=name;

    }
    public String getdata(){
        return name;
    }
    public static void main(String[] args) {
        encapusaltion s=new encapusaltion();
        s.setdata("nayana");
        System.out.println(s.getdata());
        
    }
    
}
