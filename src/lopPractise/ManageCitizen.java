package lopPractise;


public class ManageCitizen {
    public static void main(String[] args) {
        // input Citizen information
        Address2 add1 = new Address2("Nghia Tan", "Cau Giay", "Xuan Thuy", "Ha Noi");
        String fullName1 = new String("Nguyen thi duyen");
        // String fullName1 = new String(fullName1.toUpperCase());
        Citizen citizen1 = new Citizen(fullName1, 30, "female", add1);

        System.out.println("Full name: " + citizen1.getFullName().toUpperCase());
        System.out.println("Age: " + citizen1.age);
        System.out.println("Gender: " + citizen1.gender);
        System.out.println("Address: " + citizen1.add1.street+ ","+citizen1.add1.phuong+" ,"+ citizen1.add1.quan + " ," + citizen1.add1.city);

    }
}
