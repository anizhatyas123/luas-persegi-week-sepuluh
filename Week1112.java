package week11.pkg12;

import java.util.Scanner;
public class Week1112 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Panjang :");
        int panjang = input.nextInt();
        System.out.println("Masukkan Lebar :");
        int lebar = input.nextInt();
        System.out.println("Masukkan Tinggi :");
        int tinggi = input.nextInt();
        int luas = 2*(panjang*lebar+panjang*tinggi+lebar*tinggi);
        int volume = panjang*lebar*tinggi;
        int keliling = 4*(panjang+lebar+tinggi);
        
        System.out.println("Luas Permukaan Balok adalah : " + luas);
        System.out.println("Volume Balok adalah : " + volume);
        System.out.println("Keliling Balok adalah : " + keliling);
    } 
}
