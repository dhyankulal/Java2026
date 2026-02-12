package pkg1;

public class J5 {
    public static void main(String[] args) {

        String str1 = "funwithprogramming";
        String c=" ";
        for(int i=0; i<=str1.length();i+=3) {
            System.out.println(c.repeat(str1.length()-i)+str1.substring(0,i)+str1.substring(0,i));
        }

    }
}
