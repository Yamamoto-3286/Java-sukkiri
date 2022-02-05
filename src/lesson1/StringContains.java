package lesson1;

public class StringContains {

    public static void main(String[] args) {

        String str1 = "Java and Javascript";

        if (str1.contains("Java")) {
            System.out.println("文字列１はJavaを含んでいます。");
        }

        if (str1.endsWith("Java")) {
            System.out.println("文字列１はJavaが末尾にあります。");
        }

        System.out.println("文字列１で最初にJavaが登場する位置は" + str1.indexOf("Java"));
        System.out.println("文字列１で最後にJavaが登場する位置は" + str1.lastIndexOf("Java"));

    }
}
