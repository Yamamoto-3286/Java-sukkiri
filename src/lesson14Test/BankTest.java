package lesson14Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class BankTest {

    // 正常系①"ヤマモ"をセットできるか
    @Test
    public void setName() {
        Bank b = new Bank();
        b.setName("ヤマモ");
    }

    // 異常系①３文字以下の名前"ヒジ"がセットできないようになっているか
    @Test(expected = IllegalArgumentException.class)
    public void throwsExceptionWithTwoCharName() {
        Bank b = new Bank();
        b.setName("ヒジ");
    }

    // 異常系②nullをせとしようとしたら例外が起こるべき
    @Test
    public void setNameWithNull() {
        try {
            Bank b = new Bank();
            b.setName(null);
        } catch (NullPointerException e) {
            return;
        }
        fail();
    }

}
