package week_10;

import java.util.Scanner;

public class Week_10 {
    public static void main(String[] args) {
        int sisi, luas;
        Scanner scan = new
    Scanner(System.in);
        
        System.out.print("masukkan panjang sisi persegi:");
        sisi = scan.nextInt();
        
        luas = sisi * sisi;
        
        System.out.println("luas persegi adalah" +luas);
    }
    
}
