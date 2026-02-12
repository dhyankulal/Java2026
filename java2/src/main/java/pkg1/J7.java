package pkg1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class J7 {
    public static void main(String[] args) {
        int cap=0;
        int curdate=12;
        int curmonth=11;
        int curyear=2025;
        int am=0;
        int cut=0;
        ArrayList<Integer> nmonth= new ArrayList<>(Arrays.asList(31,28,31,30,31,31,30,31,30,31,30,31));
        Scanner scanner=new Scanner(System.in);
        System.out.println("entre your birthdate: ");
        int date = scanner.nextInt();
        System.out.println("enter your birth month");
        int month = scanner.nextInt();
        System.out.println("entre your birth year: ");
        int year = scanner.nextInt();
        scanner.close();

        for (int i =1; i <month; i++) {
            cap=cap+ nmonth.get(i);
            am=am+nmonth.get(i);
        }
        for (int i = 1; i < curmonth-1; i++) {
            cut=cut+ nmonth.get(i);
        }
        int dA= nmonth.get(month)-date;
        int dB= nmonth.get(curdate-1)-curdate;
        int d=365-cap;
        int dull = cap-date;
        //System.out.println(cap);
        //System.out.println(cut);
        //System.out.println(d);
        //System.out.println(am);
        //System.out.println(cap+40+cut);
        int calc = ((curyear-(year-1))*365)+dull+d+dA;
        System.out.println(calc);
        //System.out.println(dA);
        //System.out.println(dB);
        //System.out.println(cut+dull+(365*((curyear-(year))-1))+dA);
        System.out.println(((curyear-(year+1))*365)+(365-(cap+date))+cut+curdate);
        System.out.println(365-(cap+date));
        //System.out.println(dull);
        //6575
    }
}
