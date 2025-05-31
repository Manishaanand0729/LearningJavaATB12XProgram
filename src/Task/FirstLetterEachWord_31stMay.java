package Task;

public class FirstLetterEachWord_31stMay {
    public static void main(String[] args) {
        String str = "java is fun";
        String[] words = str.split(" ");

        for (String word : words) {
            if (!word.isEmpty()) {
                System.out.print(word.charAt(0) + " ");
            }
        }
    }
}
