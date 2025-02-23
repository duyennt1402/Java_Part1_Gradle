package lopPractise;

public class Citizen {
    String fullName = new String("Nguyen thi Duyen");
    int age=30;
    String gender = "Female";

    Address2 add1 = new Address2("Nghia Tan", "Cau Giay", "Xuan Thuy", "Hanoi");

    public Citizen(String fullName, int age, String gender, Address2 add1) {
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        this.add1 = add1;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public Address2 getAdd1() {
        return add1;
    }
}
