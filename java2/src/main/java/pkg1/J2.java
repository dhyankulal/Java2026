package pkg1;

public class J2 {
    public static void main(String[] args) {
        String str1 = "CollegeBusDing";
        for(int i=0; i<=str1.length()-1; i++) {
            System.out.println(str1.substring(0, i));
        }
        System.out.println(str1);
        for(int i=str1.length()-1; i>=1; i--) {
            System.out.println(str1.substring(0, i));
        }

    }
}
