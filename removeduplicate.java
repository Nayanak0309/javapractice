import java.util.*;

public class removeduplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();

        HashSet<Character> set = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            
            if(!set.contains(ch)){
                set.add(ch);
                result.append(ch);
            }
        }
        System.out.println("result   "+result.toString());
    }
    
}
