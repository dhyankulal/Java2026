package pkg1;

public class J15 {
    public static void clock1(){
        System.out.println("school clock angle");
        String time1="";
        for(int j=0; j<12; j++){
            for(int i=0; i<12; i++){
                time1=9+":"+(i*5);
                System.out.println(time1);
            }
            System.out.println();
        }
    }
    public static void clock2(){
        System.out.println("School clock angle");
        double angle1=0;
        for(int j=0; j<12;j++){
            for (int i=0; i<12; i++){
                angle1=Math.abs((90-(j*30))+i*30-i*2.5);
                System.out.println(angle1%360);
            }
        }
        System.out.println();
    }
    public static void main(String[] args){
        clock1();
        clock2();
    }
}
