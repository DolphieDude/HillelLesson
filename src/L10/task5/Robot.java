package L10.task5;

public class Robot implements WithNameAndAge {
    private String name;
    private Integer age;

    @Override
    public void setName(String inName) {
        this.name = inName;
    }

    @Override
    public void setAge(Integer inAge) {
        if (inAge <= 0) this.age = 1;
        else this.age = inAge;
    }

    @Override
    public String toString() {
        return "name = " + this.name + "; age = " + this.age + ";";
    }
}
