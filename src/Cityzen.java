import java.util.Scanner;

public class Cityzen {
    String name;
    int age;
    String gender;

    //Parametrized Contructor
    public Cityzen(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    // display information of cityzen
    public void showInfo() {
        System.out.println("Name" + name);
        System.out.println("Age: " + age);
        System.out.println("Gender:" + gender);
    }
}
