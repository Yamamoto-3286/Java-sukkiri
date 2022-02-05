package lesson1;

public class StringSplit {

    public static void main(String[] args) {
        String s = "abc,def:ghi";
        // ,と:の位置で文字列を分割する正規表現パターン
        String[] words = s.split("[,:]");
        for (String w : words) {
            System.out.println(w + "->");
        }
    }
}
