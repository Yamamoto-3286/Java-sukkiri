package lesson1;

public class StringReplaceAll {

    public static void main(String[] args) {
        String s = "abc,def:ghi";
        // []内の文字をXに変換するメソッド
        String w = s.replaceAll("[beh]", "X");
        System.out.println(w);
    }
}
