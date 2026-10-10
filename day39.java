import java.util.Scanner;
public class day39 {

    public static void main(String[] args) {
        
        Scanner masuk = new Scanner (System.in);

        System.out.println("===== KALKULATOR =====");

        System.out.print("");
        double angka1 = masuk.nextDouble();

        System.out.print("");
        char operator = masuk.next().charAt(0);
 
        System.out.print("");
        double angka2 = masuk.nextDouble();

        boolean v = true;
        double hasil = 0;

        if( operator == '+'){
            hasil = angka1 + angka2; 
        }else if( operator == '-'){
             hasil = angka1 - angka2;
        }else if(operator == '*'){
             hasil = angka1 * angka2;
        }else if(operator == '/'){

            if(angka2 != 0){
                hasil = angka1 / angka2;
            }else{
                System.out.println("(Error). pembagian dengan nol tidak diperbolehkan!");
                v = false;
            }
        }else{
            System.out.println("(Error). Operator tidak ditemukan!");
            v = false;
        }

        if(v){
            System.out.println(hasil);
        }

    

    
    }

}
    
    

