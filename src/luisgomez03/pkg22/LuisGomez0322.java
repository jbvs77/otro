package luisgomez03.pkg22;

import java.util.Scanner;

public class LuisGomez0322 {

    public static void main(String[] args) {
        
        int a1, a2;
        operaciones b = new operaciones();
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        a1 = s.nextInt();
        System.out.println("Ingrese otro numero: ");
        a2 = s.nextInt();
        System.out.println("La suma es: "+ b.suma(a1, a2));
        b.resta(a1, a2);
        System.out.println("La multiplicacion es: " + b.mult(a1, a2));
        b.div(a1, a2);
        System.out.println("La division es: " + b.modulo(a1, a2));    
       }
    
}
