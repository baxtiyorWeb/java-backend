
public class MethodOverloadin {

    static int intMethod(int x, int y) {
        return x + y;
    }

    static double doubleMethod(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        // method overloading;

        int intNumberMethod = intMethod(10, 20);
        double doubleNumberMethod = doubleMethod(10.2, 10.5);
        System.out.println(doubleNumberMethod);
        System.out.println(intNumberMethod);
    }
}
