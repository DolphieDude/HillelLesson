package L12.task3;

public class Main {
    public static void main(String[] args) {
        Apple ap = Apple.GoldenDel;
        Apple apple = Apple.valueOf("Cortland");
        switch (ap) {
            case RedDel:
                System.out.println(ap.toString());
                break;
            case Cortland:
                System.out.println(ap.toString());
                break;
            case GoldenDel:
                System.out.println("GOOLD");
        }
        switch (apple) {
            case RedDel:
                System.out.println(apple.toString());
                break;
            case Cortland:
                System.out.println(apple.toString());
                break;
            case GoldenDel:
                System.out.println("GOOLD");
                break;
        }
    }
}
