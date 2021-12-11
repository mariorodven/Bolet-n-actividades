import java.util.Scanner;
public class Act11 {
    
    static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {
        
        
        System.out.println("Introduce el número");
        int n = read.nextInt();
        
        for (int i=0; i<5;i++) {
            for (int q=1; q<4;q++) {
                System.out.print((Math.pow(n+i, q) + "\t"));
                
            }
            System.out.print("\r");
        }
    }

}


