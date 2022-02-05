package lesson2;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeSample {

    public static void main(String[] args) {
        // Instantの生成
        // 現在日時を取得
        Instant i1 = Instant.now();

        System.out.println(i1);

        // Instantとlong値の相互変換
        Instant i2 = Instant.ofEpochMilli(31920291332L);
        long l = i2.toEpochMilli();

        System.out.println(i2);
        System.out.println(l);

        // ZonedDateTimeの生成
        // 現在日時を取得
        ZonedDateTime z1 = ZonedDateTime.now();
        // 東京の2014年1月2日3時4分5秒6ミリ秒を指定して取得
        ZonedDateTime z2 = ZonedDateTime.of(2014, 1, 2, 3, 4, 5, 6,
                ZoneId.of("Asia/Tokyo"));

        System.out.println(z1);
        System.out.println(z2);

        // InstantとZonedDateTimeの相互変換
        Instant i3 = z2.toInstant();
        ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));

        // ZonedDateTimeの利用
        System.out.println("東京:" + z2.getYear() + z2.getMonth() + z2.getDayOfMonth());
        System.out.println("ロンドン:" + z3.getYear() + z3.getMonth() + z3.getDayOfMonth());

        if (z2.isEqual(z3)) {
            System.out.println("これらは同じ瞬間を指しています。");
        }
    }
}
