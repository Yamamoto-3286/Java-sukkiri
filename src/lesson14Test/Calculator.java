package lesson14Test;

public class Calculator {

//    //単価int priceと数量int quantity
//    private int price;
//    private int quantity;

    // 単価と数量を渡すと合計を返すcalcメソッド
    public static int calc(int price, int quantity) throws Exception {
        // 要件①数量１以上
        // 要件②要件を満たさない場合例外をスロー

        if (quantity >= 1) {
            return price * quantity;
        }
        throw new Exception();

    }

    // 単価と数量を渡すと合計から①割引した金額を返すdiscountメソッド
    public static int discount(int price, int quantity) throws Exception {
        // 要件１.数量１以上
        // 要件２.満たさない場合は例外をスロー
        // 割引して小数であれば、四捨五入して整数にする
        if (quantity >= 1) {
            return (int) (Math.round(calc(price, quantity) * 0.9));
        }
        throw new Exception();
    }

}
