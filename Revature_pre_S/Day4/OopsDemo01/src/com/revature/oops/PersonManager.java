package com.revature.oops;

public class PersonManager {
    public static void main(String[] args) {
//        Person p1 = new Person();
//        p1.setName("Haritha");
//        p1.setAge(22);
//        System.out.println("Name :"+p1.getName()+", Age : "+p1.getAge());
//        System.out.println("Number of Persons :"+Person.getPersonCount());
//
//
//        Person p2 = new Person("Raj",21);
//        System.out.println("Name :"+p2.getName()+", Age : "+p2.getAge());
//        System.out.println("Number of Persons :"+Person.getPersonCount());
//        System.out.println("Number of Persons :"+Person.getPersonCount());

        Person []person = new Person[10];
        person[0] = new Person();
        person[0].setName("Haritha");
        person[0].setAge(22);
        System.out.println("Name :"+person[0].getName()+" Age :"+person[0].getAge());
        System.out.println(person[0]);

    }
}
