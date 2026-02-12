package pkg1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class J6 {
    public static void main(String[] args) {
        int cap=0;
        int curdate=12;
        int curmonth=11;
        int curyear=2025;
        int am=0;
        ArrayList<Integer> nmonth= new ArrayList<>(Arrays.asList(31,30,31,30,31,31,30,31,30,31,30,31));
        Scanner scanner=new Scanner(System.in);
        System.out.println("entre your birthdate: ");
        int date = scanner.nextInt();
        System.out.println("enter your birth month");
        int month = scanner.nextInt();
        System.out.println("entre your birth year: ");
        int year = scanner.nextInt();
        scanner.close();
        if (month <curmonth) {
            for (int i =0; i <month; i++) {
                cap=cap+ nmonth.get(i);
                am=am+nmonth.get(i);
            }
        }else if (month >curmonth) {
            for (int i = month+2; i < nmonth.size(); i++) {
                cap=cap+ nmonth.get(i);
                am=am+nmonth.get(i);
            }
        }

        int calc = ((curyear-(year+1))*365)+am+cap+curdate+(nmonth.get(month)-curdate);
        System.out.println(calc);
    }
}
