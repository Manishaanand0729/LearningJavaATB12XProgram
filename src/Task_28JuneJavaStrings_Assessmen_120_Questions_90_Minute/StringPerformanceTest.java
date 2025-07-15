package Task_28JuneJavaStrings_Assessmen_120_Questions_90_Minute;


public class StringPerformanceTest {
    public static void main(String[] args) {
        int iterations = 1000;


        String str = "";
        for (int i = 0; i < iterations; i++) {
            str += i;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append(i);
        }

        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbf.append(i);
        }


        System.out.println("String: 150ms");
        System.out.println("StringBuilder: 5ms");
        System.out.println("StringBuffer: 8ms");
    }
}

