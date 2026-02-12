package pkg1;

public class J21 {
    public static int add1(int num1, int num2){
        int sum1=num1+num2;
        return sum1;
    }
    public static int add1(int num1, int num2, int num3){
        int sum1=num1+num2+num3;
        return sum1;
    }
    public static double add1(double num1, double num2){
        double sum1=num1+num2;
        return sum1;
    }

    public static void main(String[] args){
        System.out.println("Hello world");
        System.out.println(add1(8,4));
        System.out.println(add1(8,4,2));
        System.out.println(add1(8.5,4.5));
    }
}
