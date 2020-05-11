package mean;

import java.util.Scanner;

public class Mean {
    public void ratarata(){
        int array[], i, n;
        array = new int[100];
        float rata, total=0;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan banyaknya elemen array: ");
        n = scan.nextInt();
        
        for(i=1; i<=n; i++){
            System.out.print("Nilai ke-"+i+":");
            array[i]=scan.nextInt();
            total=total+array[i];
        }
        
        if (n>50){
            System.out.print("data besar");
        }
        else {
            System.out.print("data kecil");
        }
        
        rata=total/n;
        System.out.println("Hasil nilai total adalah:"+total);
        System.out.println("Hasil rata-rata adalah:"+rata);
     
        } 
    
    }
    

