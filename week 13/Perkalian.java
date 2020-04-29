package perkalian;

import java.util.Scanner;

public class Perkalian {
    void perkalian(){
        int perkalian,x,y;
        Scanner masukan = new Scanner(System.in);
        System.out.print("Tabel Perkalian :n");
        perkalian = masukan.nextInt();
        System.out.print("x ");
        
        for(x=0;x<=perkalian;x++){
            System.out.print(x +"");
        }
        
        System.out.println("");
        
        for(x=0;x<=perkalian;x++){
            System.out.print(x +" ");
        for(y=0;y<=perkalian;y++){
            System.out.print(y*x +" ");
        }
        
        System.out.println("");
        }
    }
    
}
