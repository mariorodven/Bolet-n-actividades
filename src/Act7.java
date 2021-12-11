
import java.util.Scanner;
public class Act7 {
    
    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        String password = "1234";
        boolean isCorrect = false;
        System.out.println("Introduce la contaseña: ");
        String attempt = read.nextLine();
        for(int i=0; i<=4;i++) {
            getPassword(password,attempt);
            
            comparePswd(password, attempt, isCorrect);
            if(isCorrect) {
                System.out.println("La contraseña es correcta");
                System.out.print(i);
                i = i+4;
            } else {
                System.out.println("Te quedan " + (4-i-1) +" intentos");
                System.out.println("Introduce la contaseña: ");
                attempt = read.nextLine();
                getPassword(password,attempt);
                comparePswd(password, attempt, isCorrect);
            }
        }
    }

    public static void getPassword(String password, String attempt) {
        
        char array[] = password.toCharArray();
        
        for(int i = 0; i>array.length; i++) {
            array[i]= (char)(array[i] + (char)5);
        }
        
        String encriptado = String.valueOf(array);        
        
        char array0[] = encriptado.toCharArray();
        
        for(int j = 0; j<array0.length; j++) {
            array0[j] = (char)(array0[j]-(char)5);
        }       
    }
    
    public static void comparePswd(String password, String attempt, boolean isCorrect) {
        
        if(password.equals(attempt)) {
            isCorrect = true;
            System.out.println("La contraseña es correcta");
        } else {
            isCorrect = false;
            
        }
    }

}
