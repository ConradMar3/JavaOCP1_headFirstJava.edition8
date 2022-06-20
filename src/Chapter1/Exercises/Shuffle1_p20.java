package Chapter1.Exercises;

public class Shuffle1_p20 {
  public static void main(String[] args) {
    int x = 3;

    while (x > 0) {
        x = x - 1;
      System.out.println("~");
    }
    if (x > 2) {
      System.out.println("a");
    }
    if (x == 2) {
      System.out.println("b c");
    }
    if (x == 1) {
      System.out.println("d");
      x = x - 1;
    }
  }
}
