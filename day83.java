package evaluasimentor;

public class day83 {

    public static void main(String[] args) {
        
        int[] arr = {12,12,45,65,76,78};

        int total = 0;

        for(int i=0; i <  arr.length; i++){
            total += arr[i];
        }

        System.out.println("Total Seluruh elemen Array: "+total);


    }
    
}
