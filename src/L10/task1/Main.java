package L10.task1;

public class Main {
    static int val = 3;

    static int getVal() {
        return val--;
    }

    public static void main(String[] args) {
        int n;
        for (int i = 0; i < 10; i++) {
            n = getVal();
            assert n > 0;
            System.out.println(n);
        }
    }
}
