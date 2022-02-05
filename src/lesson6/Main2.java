package lesson6;

public interface Main2 {

    public static void main(String[] args) {
        Func1 f1 = x -> x % 2 == 1;
        Func2 f2 = (male, name) -> {
            if (male == true) {
                return "Mr." + name;
            } else {
                return "Ms." + name;
            }
        };
        System.out.println(f1.call(6));
        System.out.println(f2.call(true, "Nancy"));

    }
}
