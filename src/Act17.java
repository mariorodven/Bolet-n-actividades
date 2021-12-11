import java.util.Scanner;

public class Act17 {

    static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Número:");
        long n = read.nextInt();
        long array[] = new long[100];
        long totalArray=0;
        for (int i=0;i<100;i++) {
            n=(n+1);
            array[i]=n;
        }
        for (int q=0;q<array.length;q++) {
            totalArray=totalArray+array[q];
        }
        System.out.println(totalArray);
    }
    
    

}

