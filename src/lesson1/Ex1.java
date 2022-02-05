package lesson1;

public class Ex1 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            sb.append(i).append(",");
        }
//        System.out.println(sb.toString());

        String[] a = (sb.toString()).split("[,]");
        for (String w : a) {
            System.out.println(w + "->");
        }
    }
}
