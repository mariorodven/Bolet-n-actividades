import java.util.Scanner;
public class Act13 {



    static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {

        int []array = new int[10];
        int n=0;
        System.out.println("Introduce 10 números");
        for(int i=0; i<10;i++){
            n= read.nextInt();
            array[i] = n;
        }
        boolean isPos = true;
        int pos =0;
        int neg =0;
        for(int q=0; q<10;q++){
            

        if(array[q]<0){
            isPos = false;
        } else {
            isPos = true;
        }
        if(isPos){
            pos=pos+1;
        } else {
            neg=neg+1;
        }
        
        
        }
        System.out.println("La solución es: ");
        System.out.println("Positivos: " + pos + "\t" +" Negativos: "+ neg);
        
    }
}


