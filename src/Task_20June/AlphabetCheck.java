package Task_20June;

public class AlphabetCheck {
    public static void main(String[] args) {
        char ch = 'A';
        if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z')
            System.out.println(ch + " this Is Alphabet");
        else
            System.out.println(ch + " This Is Not Alphabet");
    }
}
