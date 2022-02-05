package lesson1;

public class StringFormat {
    public static void main(String[] args) {
        final String FORMAT = "%8s %6s 所持金%,5d";
        String s = String.format(FORMAT, "yamamoto", "job", 10);
        String s2 = String.format(FORMAT, "kawagoe", "hacker", 10334);
        System.out.printf(s);
        System.out.println();
        System.out.printf(s2);
        System.out.println();

        System.out.printf("製品番号%s-%02d", "SJV", 3);
    }

}
