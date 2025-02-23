import dayTwo.Address;

import java.util.Scanner;

public class Cityzen {
    String name;
    int age;
    String gender;
   // String address;

  //if citizen2.address %Ho chi minh"
    Address add1;

    public void setAdd1(Address add1) {
        this.add1 = add1;
    }

    public Cityzen(String name, int age, String gender, Address add1) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.add1 = add1;
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

    @Override
    public String toString() {
        return "Cityzen{" +
                "gender='" + gender + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public Address getAdd1() {
        return add1;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
