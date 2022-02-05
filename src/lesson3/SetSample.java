package lesson3;

import java.util.HashSet;
import java.util.Set;

public class SetSample {

    public static void main(String[] args) {
        Set<String> colors = new HashSet<String>();
        colors.add("赤");
        colors.add("青");
        // 赤を２つ入れて重複させる
        colors.add("赤");
        colors.add("黄");
        // 重複した要素があるままセットの中に入ってる要素の数を出力
        System.out.println(colors.size());

        // HashSetを取り出すときは必ずしも入れた順番に出てくるとは限らない
        // 拡張for文で取り出してみる
        for (String color : colors) {
            System.out.print(color + "→");
        }
    }
}
