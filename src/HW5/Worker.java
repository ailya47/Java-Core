package HW5;

import java.io.Serializable;

public class Worker implements Serializable {
    private String name;
    private int age;
    private int salary;
    public Worker(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getInfo() {
        return name + " " + age + " " + salary;
    }

    @Override
    public String toString() {
        return name + " " + age + " " + salary;
    }
}
