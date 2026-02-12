package pkg1;

public class j11 {
    public static void main(String[] args){
        String s1="";
        for(int j=3; j<6; j++){
            for(int i=1;i<11; i++){
                s1=s1+3+"*"+i+"="+(3*i)+"\n";
            }
            s1=s1+"\n";
        }
        System.out.println(s1);
    }
}
