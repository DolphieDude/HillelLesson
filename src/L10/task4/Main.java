package L10.task4;

public class Main {
    public static void main(String[] args) {
        printReaction(x -> x > 10, 11);
        printReaction(x -> x > 10, 8);
    }

    public static void printReaction (MyPredicate lambda, int input) {
        if (lambda.check(input)) System.out.println("Yeah, this condition is right");
        else System.out.println("Nope, this condition is wrong");
    }
}
