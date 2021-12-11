import java.util.Scanner;

public class Act8 {
    
    static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {
        int []array = {0,1,2,3,4,5,6,7,8,9,10};
        System.out.print("Introduce qué tabla es: ");
        int table = read.nextInt();
        for(int i=0;i<=10;i++){
            System.out.print(table+"*");
            System.out.print(array[i] + " = ");
            System.out.println(array[i]*table);
        }
        
    }

}
