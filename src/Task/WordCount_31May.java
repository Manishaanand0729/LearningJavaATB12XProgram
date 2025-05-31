package Task;

public class WordCount_31May {
    public static void main(String[] args) {
        String str = "   Hello    world  Java  ";
        str = str.replaceAll("\\s+", " ").trim();  // Removes extra spaces
        String[] words = str.split(" ");
        System.out.println("Word Count: " + words.length);
    }
}
