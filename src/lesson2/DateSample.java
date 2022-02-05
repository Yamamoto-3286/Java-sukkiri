package lesson2;

import java.util.Date;

/*
 * DateクラスはJavaで日付情報を扱うときに標準的に利用される。
 * java.utilパッケージに属している。
 * 内部にエポック（基準時刻である1970年元旦0時ちょうど）からの経過ミリ秒数を
 * Longで保持。
 * newにて引数無しでインスタンス生成すると、現在の日時情報が格納される。
 * newにてlong値を引数としてインスタンス化すると、指定の日時情報が格納される。
 * 
 * しかし、Dateクラスは人間が取り扱いづらいので、
 * 時間の各情報を画面から指定する場合には、java.util.Calenderクラスを使ったり、
 * 人の読みやすい文字に変換するには、java.text.SimpleDateFormatクラスを利用する。
*/
public class DateSample {
    public static void main(String[] args) {
        // Dateクラスのインスタンス生成
        Date now = new Date();

        System.out.println(now);
        System.out.println(now.getTime());

        Date past = new Date(1111111L);
        System.out.println(past);
    }
}
