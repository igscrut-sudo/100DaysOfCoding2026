public class day22 {

    public static void main(String[] args) {
        
        int a = 10;
        int b = 30;

        System.out.println("Sebelum di tukar \n a: "+a+"\n b:"+b);

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("setelah ditukar \n a:"+a+"\n b:"+ b);
    }
    
}
