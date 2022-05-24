package Chapter1.Booleans;

public class SimpleBoolean {
    public static void main(String[] args) {
        int x = 4; // assign 4 to x.

        while (x > 3) {
            // loop code will run
            // because x is > 3.
            x = x - 1; // or an infinite loop is created.
        }
        int z = 27;

        while (z == 17) {
            // loop won't run
            // because z != 17.
        }
        System.out.println(x);
        System.out.println(z);
    }
}
