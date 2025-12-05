

import java.util.Scanner;

public class vowelsTo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the string");
        String input=sc.nextLine();

        int vowels=0;
        int conso=0;

        input = input.toLowerCase();
        for(int i=0;i<=input.length();i++){
            char ch = input.charAt(i);
            if(ch >='a' && ch<='z'){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    vowels++;
                }else{
                    conso++;
                }
            }

        }
        System.out.println("the no of vowels is"+vowels);
        System.out.println("the no of consonent is "+conso);
        sc.close();


    }

}
