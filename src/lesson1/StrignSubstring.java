package lesson1;

public class StrignSubstring {

    public static void main(String[] args) {
        String str1 = "Java programming";
        System.out.println("文字列１の３文字目以降は" + str1.substring(3));
        System.out.println("文字列１の３文字目~８文字目は" + str1.substring(3, 8));
    }
}
