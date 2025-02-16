package Strings;

import java.util.Locale;
import java.util.Scanner;

public class ShortestPath {
    public static double shortestPath(String str){
        int x=0,y=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == 'N'){
                y++;
            }else if(str.charAt(i) == 'E'){
                x++;
            }else if(str.charAt(i) == 'S'){
                y--;
            }else if(str.charAt(i) == 'W'){
                x--;
            }
        }
        double minPath=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        return minPath;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String strToUpperCase=str.toUpperCase();
        System.out.println(shortestPath(strToUpperCase));
    }
}
