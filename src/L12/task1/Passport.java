package L12.task1;

import java.io.Serializable;

public class Passport implements Serializable  {
    private int id;
    transient private int number = 5;
    private static final long serialVersionUID = 1L;

    Passport() {
    }

    Passport(int id) {
        this.id = id;
    }

    public Passport(int id, int number) {
        this.id = id;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "id=" + id +
                ", number=" + number +
                '}';
    }
}
