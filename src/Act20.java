import java.util.Scanner;

public class Act20 {
    static Scanner read = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        for(int i=2;i<=100;i++) {
        esPrimo(i);
            if(esPrimo(i)) {
                System.out.println(i);
            }
        }
    }
    
    private static boolean esPrimo(int numero) {
        
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
