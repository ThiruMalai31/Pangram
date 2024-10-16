import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String pangram=scanner.nextLine();
        int[] characterFrequency=new int[26];
        for(int i=0;i<pangram.length();i++){
            char c=pangram.charAt(i);
            if(c>='A' && c<='Z'){
                characterFrequency[c-'A']++;
            }
            else if(c>='a' && c<='z'){
                characterFrequency[c-'a']++;
            }
        }
        int set=0;
        for(int i=0;i<26;i++){
            if(characterFrequency[i]==0){
                set=1;
                break;
            }
        }
        if(set==0){
            System.out.println("It is Pangram");
        }
        else{
            System.out.println("It is not a Pangram");
        }
    }
}
