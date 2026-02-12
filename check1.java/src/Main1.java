import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main1{
    public static void main(String[] args) throws FileNotFoundException{
        String s1 = "";
        String s2 = "";
        String[] arr1;
        String[] arr2;
        ArrayList<String>names=new ArrayList<>();
        ArrayList<String>english=new ArrayList<>();
        ArrayList<String>math=new ArrayList<>();
        ArrayList<String>chemistry=new ArrayList<>();
        ArrayList<String>physics=new ArrayList<>();
        File f1 = new File("marks.txt");
        Scanner sc1 = new Scanner(f1);
        while(sc1.hasNextLine()){
            s1 = sc1.nextLine();
            arr1 = s1.split(",");
            names.add(arr1[0]);

            s2 = arr1[3];
            arr2 = s2.split(",");
            english.add(arr1[0]);

            s2 = arr1[4];
            arr2 = s2.split(",");
            math.add(arr1[0]);

            s2 = arr2[5];
            arr2 = s2.split(",");
            physics.add(arr1[0]);

            s2 = arr2[6];
            arr2 = s2.split(",");
            chemistry.add(arr1[0]);
        }
        System.out.println(names);
        System.out.println(math);
        System.out.println(physics);
        System.out.println(chemistry);

    }
}