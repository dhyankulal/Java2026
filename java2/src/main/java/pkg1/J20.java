package pkg1;

public class J20 {
    public static void main(String[] args) {
        String s1="FunwithProg";
        String s2="";
        String part1="";
        String part2="";
        String space="$";
        int len1=s1.length();

        for(int j=1;j<7; j++){
            part1="";
            for(int i=0; i<6-j; i++){
                part1=part1+"$";
            }
            part2=s1.substring(0,(2*j)-1);
            s2=s2+part1+part2+"\n";
        }
        System.out.println(s2);
    }
}
