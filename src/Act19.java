import java.util.Scanner;
 
public class Act19 {

    static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Por favor, introduzca la altura de la pirámide: ");
        int alturaIntroducida = read.nextInt();

        System.out.print("Introduzca el carácter de relleno: ");
        String relleno = System.console().readLine();

        int altura = 1;
        int i = 0;
        int espaciosPorDelante = alturaIntroducida - 1;
        int espaciosInternos = 0;

        while (altura < alturaIntroducida) {

          // inserta espacios delante
        for (i = 1; i <= espaciosPorDelante; i++) {
            System.out.print(" ");
        }

          // pinta la línea
        System.out.print(relleno);
        for (i = 1; i < espaciosInternos; i++) {
            System.out.print(" ");
        }

        if (altura>1) {
            System.out.print(relleno);
        }

        System.out.println();

            altura++;
            espaciosPorDelante--;
            espaciosInternos += 2;
        }

        // base de la pirámide
        for (i = 1; i < altura*2; i++) {
        System.out.print(relleno);
        }
        System.out.println(" ");
    }
}
