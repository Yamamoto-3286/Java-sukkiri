package lesson3;

import java.util.HashMap;
import java.util.Map;

public class MapSample {
    public static void main(String[] args) {
        // Mapとは…
        // ２つの情報をキーと値のペアとして格納するデータ構造
        // ジェネリクスも２つ指定できる
        // 値は重複可能だがキーは重複不可能
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("京都", 255);
        map.put("東京", 1261);
        map.put("熊本", 181);
        int tokyo = map.get("東京");
        System.out.println(tokyo);

        map.remove("京都");

        map.put("熊本", 182);
        int kumamoto = map.get("熊本");
        System.out.println(kumamoto);

        // Mapに格納された値を一つずつ繰り返し取得する
        // ListやSetと少し違ったやり方が必要となる
        // わかりやすいのはキーの一覧を取得→各キーに対応する値を取得
        for (String key : map.keySet()) {
            int value = map.get(key);
            System.out.println(key + "の人口は" + value);
        }
    }
}
