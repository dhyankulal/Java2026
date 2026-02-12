package pkg1;

public class J14 {
    public static void main(String[] args){
        System.out.println("school clock angle");
        String time1="";
        for(int j=0; j<12; j++){
            for(int i=0; i<12; i++){
                time1=(9+j)%12+":"+(i*5);
                System.out.println(time1);
            }
            System.out.println();
        }

    }
}
