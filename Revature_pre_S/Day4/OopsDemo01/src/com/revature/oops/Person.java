package com.revature.oops;

public class Person {
    private String name;
    private int age;
    private static int personCount;

    public Person() {
        personCount++;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        personCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getPersonCount() {
        return personCount;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
