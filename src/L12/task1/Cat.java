package L12.task1;

import java.io.*;

public class Cat implements Externalizable {
    private String name;
    private int age;
    private int weight;
    private static final long serialVersionUID = 1L;
    private Passport passport;

    public Cat() {

    }

    Cat(String name, int age, int weight, int id) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.passport = new Passport(id);
    }

    Cat(String name, int age, int weight, Passport passport) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", passport=" + passport +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeInt(this.age);
        out.writeInt(this.weight);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.name = (String)in.readObject();
        this.age = in.readInt();
        this.weight = in.readInt();
    }
}
