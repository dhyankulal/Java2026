package pkg1;

public class J16 {
    public static void clock1(){
        System.out.println("school clock angle");
        String time1="";
        for(int j=0; j<12; j++){
            for(int i=0; i<12; i++){
                time1=Math.abs(((90-(j*30))+i*30-i*2.5)%360)+"--->"+(9+j)%12+":"+(i*5);
                System.out.println(time1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        clock1();
    }
}
