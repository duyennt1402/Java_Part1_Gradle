
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // input data from keyboard
//        Scanner sc1 = new Scanner(System.in);
//        System.out.println("input name of Cityzen");
//        String name = sc1.nextLine();
//        Scanner sc2 = new Scanner(System.in);
//        System.out.println("input age:");
//        int age = sc2.nextInt();
//        Scanner sc3 = new Scanner(System.in);
//        System.out.println("input gender:");
//        String gender = sc3.nextLine();
//        Cityzen citizen1 = new Cityzen(name, age, gender);
        // data is hardcode
        Cityzen citizen1 = new Cityzen("Duyen", 38, "Nu");
        citizen1.showInfo();

    }
}