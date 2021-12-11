import java.util.Scanner;

public class Act12 {

    static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {

        int n = 0;
        System.out.println("Introduce el número");
        n = read.nextInt();
            System.out.println("La sucesión de fibonacci es la última columna");
        for(int i=0; i<10;i++){
            int j = n+i;
            
            System.out.println(i + "\t" + n + "\t" + j + "\t" + fibonacci(j));


        }

    }
    public static int fibonacci(int n){
        if (n>1){
            return fibonacci(n-1) + fibonacci(n-2);  //función recursiva
        }
         else if (n==1) {  // caso base
            return 1;
        }
         else if (n==0){  // caso base
            return 0;
        }
         else{ //error
            System.out.println("Debes ingresar un tamaño mayor o igual a 1");
            return -1;
        }  
    }
}
