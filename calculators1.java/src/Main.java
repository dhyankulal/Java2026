import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String userName = scanner.nextLine();
        System.out.println("Hello, "+userName +"!"+" How are you. ");
        System.out.println("Enter your age");
        String age = scanner.nextLine();
        System.out.println("my age is "+age);
        scanner.close();
    }
}