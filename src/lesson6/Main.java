package lesson6;

public class Main {
    public static void main(String[] args) {
        Funclist funclist = new Funclist();
        Func1 f1 = Funclist::isOdd;
        Func2 f2 = funclist::addNamePrefix;

        System.out.println(f1.call(6));
        System.out.println(f2.call(true, "Nancy"));
    }
}
