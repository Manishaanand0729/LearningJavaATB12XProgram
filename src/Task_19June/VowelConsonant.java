package Task_19June;

public class VowelConsonant {
    public static void main(String[] args) {
        char ch = 't';
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ) {
            System.out.println(ch + " This Is Vowel");
        }else {
            System.out.println(ch + " This IS Consonant");
        }
    }
}
