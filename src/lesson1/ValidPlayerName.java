package lesson1;

public class ValidPlayerName {

    private boolean isValidPlayerName(String name) {
        // 一文字目が必ずアルファベットで合計８文字、使える文字はA~Zと0～9
        // [A-Z]→一文字目がアルファベット
        // [A-Z0-9]{7}→2文字目以降はアルファベットか数字で残りの7文字を埋める
        return name.matches("[A-Z][A-Z0-9]{7}");
    }
}
