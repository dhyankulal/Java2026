package pkg1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class J1 {
    public static void main(String[] args) {
        ArrayList<String> chars = new ArrayList<>(Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","1","2","3","4","5","6","7","8","9","0","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","!","@","#","$","%","^","&","*","(",")"));
        //ArrayList<String> al1 = new ArrayList<>(Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"));
        //ArrayList<String> al2 = new ArrayList<>(Arrays.asList("1","2","3","4","5","6","7","8","9","0"));
        //ArrayList<String> al3 = new ArrayList<>(Arrays.asList("!","@","#","$","%","^","&","*","(",")"));
        //ArrayList<String> al4 = new ArrayList<>(Arrays.asList("A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"));
        //Random rd1 = new Random();
        Random rd1 = new Random();
        Random rd2 = new Random();
        Random rd3 = new Random();
        Random rd4 = new Random();
        String pwd = "";

        int len1 = chars.size();
        //int len2 = al2.size();
        //int len3 = al3.size();
        //int len4 = al4.size();

        for (int i = 0; i < 5; i++) {
            int rdi1 = rd1.nextInt(0,len1);
            //pwd = chars.get(rdi1)+chars.get(rdi2)+chars.get(rdi3)+chars.get(rdi4);
            pwd += chars.get(rdi1);
        }/*
        int rdi1 = rd1.nextInt(0,len1);
        int rdi2 = rd1.nextInt(0,len1);
        int rdi3 = rd1.nextInt(0,len1);
        int rdi4 = rd1.nextInt(0,len1);
        pwd = chars.get(rdi1);
*/
        System.out.println(pwd);

    }
}
