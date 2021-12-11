import java.util.Scanner;

public class Act18 {

    static Scanner read = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("Introduce dos números ");
        System.out.print("Numero 1: ");
        int a=read.nextInt();
        System.out.print("Numero 2: ");
        int b=read.nextInt();
        if (a<0 || b<0) {
            throw new Exception("Eso no es un número entero cabezón");
        }
        boolean condition = aIsBigger(a,b);
        if (condition) {
            for (int i=b; i<=a;i++) {
                System.out.println(i);
            }
            
        } else {
            for (int q=a; q<=b;q++) {
                System.out.println(q);
            }
        }
    }
    
    private static boolean aIsBigger(int a, int b) {
        if (a<b) {
            return false;
        } else {
            return true;
        }
    }

}
