package pkg1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class J18 {
    public static void main(String[] args) {
        String s1="Funwith";
        String s2="";
        int len1=s1.length();
        for(int i=1;i<len1+1; i++){
            s2=s2+s1.substring(0,i)+"\n";
        }
        for(int i=1; i<len1; i++){
            s2=s2+s1.substring(0,len1-i)+"\n";
        }
        System.out.println(s2);
    }
}
