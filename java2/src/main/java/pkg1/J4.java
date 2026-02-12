package pkg1;

public class J4 {
    public static void main(String[] args) {
        String str1 = "sumithra";
        String c=" ";
        for(int i=0; i<=str1.length();i++) {
            System.out.println(c.repeat(str1.length()-i)+str1.substring(0,i)+str1.substring(0,i));
        }
        for (int i = 0; i <str1.length() ; i++) {
            System.out.println(c.repeat(i)+str1.substring(0,str1.length()-i)+str1.substring(0,str1.length()-i));
        }
    }
}
