package Chapter1.PhraseOMatic;

public class PhraseOMatic {
  public static void main(String[] args) {
    String[] wordListOne = {"24/7","Absolution","Back-end","Six-sigma"};

    String[] wordListTwo = {"48/14","Retribution","Fear-Nothing","Stigma"};

    String[] wordListThree = {"96/28","Oblivion","Monster-mindset","The-Comeback"};

    //How many words are in each list:
    int oneLength = wordListOne.length;
    int twoLength = wordListTwo.length;
    int threeLength = wordListThree.length;

    //Generate random numbers:
    int rand1 = (int) (Math.random() * oneLength);
    int rand2 = (int) (Math.random() * twoLength);
    int rand3 = (int) (Math.random() * threeLength);

    //Build a phrase:
    String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

    // Print phrase:
    System.out.println("What we need is " + phrase);
  }
}
