package Task_17June;

public class Vowel_Consonant {
    public static void main(String[] args) {
        char ch = 'e';
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ) {
            System.out.println(ch + ": This is Vowel");
        }else{
            System.out.println(ch + ": This Is Consonant");
        }
    }
}
