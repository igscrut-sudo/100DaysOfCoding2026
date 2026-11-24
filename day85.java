package evaluasimentor;

import java.util.Scanner;

public class day85 {

    public static void main(String[] args) {
        
    

    Scanner input = new Scanner (System.in);

        System.out.print("Masukkan Jumlah data: ");
        int jumlah = input.nextInt();

        int data[] = new int[jumlah];

        for(int i=0; i < jumlah;i++){
            System.out.print("Masukkan angka ke-"+(i+1)+":");
            data[i] = input.nextInt();
        }

        int minimum = data[0];

        for(int i=1; i < jumlah; i++){
            if(data[i] < minimum){
                minimum = data[i];
            }
        }

        System.out.println("angka maksimal Adalah:"+minimum);

    
}
}
