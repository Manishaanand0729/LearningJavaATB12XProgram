package Task_28JuneJavaStrings_Assessmen_120_Questions_90_Minute;

public class StringComparisonDemo {
    public static void main(String[] args) {

        String string1 = " Hello";
        String string2 = " hello";

        boolean isEqual = string1.equals(string2);

        boolean isIgnoreCase = string1.equalsIgnoreCase(string2);

        int comparisonResult = string1.compareTo(string2);

        System.out.println("Equals(); " + isEqual);
        System.out.println("EqualsIsIgnoreCase(); " + isIgnoreCase);
        System.out.println("CompareTo(); " + comparisonResult);

    }
}
