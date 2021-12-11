import java.util.Scanner;

public class Act16{

    static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Número:");
        int n = read.nextInt();
        if (esPrimo(n)) {
            System.out.println(n+ " es primo.");
            
        } else {
            System.out.println(n+ " no es primo");
        }

    }
    
    public static boolean esPrimo(int numero) {

        if (numero == 0 || numero == 1 || numero == 4) {
            return false;
        }
        for (int x = 2; x < numero / 2; x++) {
            
            if (numero % x == 0)
            return false;
        }
        
        return true;
        }

}
