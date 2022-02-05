package lesson3;

import java.util.ArrayList;
import java.util.List;

class Hero {
    public String name;
}

public class CollectionAttention {
    public static void main(String[] args) {
        Hero h = new Hero();
        h.name = "ミナト";
        List<Hero> list = new ArrayList<Hero>();
        list.add(h);
        // listにaddされたあとに違う名前をinstanceに入れる
        h.name = "スガワラ";
        System.out.println(list.get(0).name);
        // 後に入れた名前が出力される
        // これは変数やリストに格納された値は実際には参照だから
        // 値を直接ではなく場所を教えられていて、そのタイミングで入っている値が出力されているみたいな
    }

}
