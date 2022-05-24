package Chapter1.Statements.LoopingAndBranching;

public class Branching {
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
        // Branching-if/else tests
        if (x == 10) {
            System.out.print("x must be 10");
        } else {
            System.out.println("x isn't 10");
        }
        if((x < 3) & (name.equals("Dirk."))) {
            System.out.println("Dr.Mishka D. Vrey.");
        }
        System.out.println();

        System.out.println("This line prints anyway.");
    }
}
