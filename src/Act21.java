import java.util.Scanner;
public class Act21 {
    static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Introduce la base: ");
        int base = read.nextInt();
        for(int i=1;i<=base;i++) {
            int space = base-i;
            for(int q=1;q<=space;q++) {
                System.out.print(" ");
            }
            for (int c=1;c<i;c++) {
                System.out.print(c);
                
            }
            
            System.out.print(i);
            
            for (int d=i-1;d>0;d--) {
                System.out.print(d);
            }
            
            System.out.println(" ");
        }

    }


}
