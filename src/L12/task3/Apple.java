package L12.task3;

public enum Apple {
    Jonathan(5), GoldenDel(10), RedDel(7), Winesap(19), Cortland(11);
    private int price;

    public int getPrice() {
        return price;
    }

    Apple(int price) {
        this.price = price;
    }
}
