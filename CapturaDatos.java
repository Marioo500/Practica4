
package practica4;

import java.util.Scanner;

public class CapturaDatos {
        public static int capturarEntero(String msg){ //metodo static que captura un dato de tipo entero 
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return (sc.nextInt());
    }

    public static float capturarFlotante(String msg){//metodo static que captura un dato de tipo flotante  
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return (sc.nextFloat());
    }

    public static double capturarDoble(String msg){ //metodo static que captura un dato de tipo double 
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return (sc.nextDouble());
    }

    public static String capturarCadena(String msg){//metodo static que captura un dato de tipo string 
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return (sc.nextLine());
    }
}
