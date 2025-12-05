
import java.util.Scanner;


public class vowelToCon{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter the string");
            String input = sc.nextLine();
            
            int vowels = 0;
            int consonent = 0;
            
            input = input.toLowerCase();
            for (int i = 0;i <input.length();i++){
                char ch = input.charAt(i);
                if(ch >= 'a' && ch<= 'z'){
                    if(ch == 'a' || ch == 'e'|| ch == 'i' || ch == 'o' || ch == 'u'){
                        vowels++;
                    }else{
                        consonent++;
                    }
                    
                }
            }
            System.out.println("Number of vowels: " + vowels);
            System.out.println("Number of consonants: " + consonent);
        }
    }
}

