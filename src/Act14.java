import java.util.Scanner;

public class Act14 {

    static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Introduce la base");
        int n= read.nextInt();
        System.out.println("Introduce el exponente");
            int q = read.nextInt();
            
            System.out.print(Math.pow(n, q));
    }
        
}