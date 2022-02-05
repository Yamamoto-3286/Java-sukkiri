package lesson6;

import java.util.function.IntBinaryOperator;
import java.util.function.IntToDoubleFunction;

public class LambdaExpression {

    public static void main(String[] args) {
        // ２つの引数の差を求める処理 の実態を生み出し代入する
        IntBinaryOperator func = (int a, int b) -> {
            return a - b;
        };
        int a = func.applyAsInt(5, 3);
        System.out.println("5-3は" + a);

        double b = 1.41;
        IntToDoubleFunction func2 = (x) -> {
            return x * x * b;
        };
        System.out.println(func2.applyAsDouble(2));
    }
}
