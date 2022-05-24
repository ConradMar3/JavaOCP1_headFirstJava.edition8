package Chapter1.Statements.LoopingAndBranching;

public class Loops {
    public static void main(String[] args) {
        int x = 3;
        String name = "Dirk";
        x = x * 17;
        System.out.println("x is: " + x);
        double d = Math.random();

        while(x > 12) {
            x = x - 1;
        }
        for(x = 0; x < 10; x = x + 1) {
            System.out.println("x is now: " + x);
        }
    }
}
