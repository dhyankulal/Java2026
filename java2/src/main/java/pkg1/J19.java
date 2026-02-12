package pkg1;

public class J19 {
    public static void main(String[] args) {
        String s1="Funwith";
        String s2="";
        String part1="";
        String part2="";
        String space="$";
        int len1=s1.length();

        for(int j=1; j<len1+1; j++){
            part1="";
            for(int i=0; i<len1-j; i++){
                part1=part1+space;
            }
            part2=s1.substring(0,j)+"\n";
            s2=s2+part1+part2;
        }
        for(int j=1; j<len1; j++){
            part1="";
            for(int i=0; i<j;i++){
                part1=part1+space;
            }
            part2=s1.substring(0,len1-j)+"\n";
            s2=s2+part1+part2;
        }
        System.out.println(s2);
    }
}
