
package practica4;

import java.util.ArrayList;

public class Practica4 {


    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>(); //Creo una lista de arreglos de tipo Cliente para poder capturar los clientes que desee
        int op;
         do{
             op = 0;
             System.out.println();
             System.out.println("1) Crear cuenta");
             System.out.println("2) Acceder a cuenta");
             System.out.println("3) Salir");
             System.out.println();
             while(op > 3 || op < 1){ //Se valida que la opcion sea valida
             op = CapturaDatos.capturarEntero("Introduzca opcion");
             }
             switch(op)
             {
                 case 1: //Crear cuenta 
                 {
                     //Se manda llamar el constructor de la clase Cliente
                    Cliente cliente = new Cliente(CapturaDatos.capturarCadena("Nombre"),CapturaDatos.capturarEntero("Introduce nuevo pin"), CapturaDatos.capturarFlotante("Introduce saldo"));
                    clientes.add(cliente); //Se añade un cliente a la lista de arreglos de tipo Clientes
                    break;
                 }
                 case 2: //Aceder a cuenta
                 {
                     int pin = CapturaDatos.capturarEntero("Introduce pin de la cuenta"); //Se introduce el pin a buscar 
                     boolean existe = false; //se usa para saber si existe una cuenta con ese pin
                     for(int i = 0; i< clientes.size(); i++) //se van iterando los clientes para buscar el pin introducido
                     {
                         if(pin == (clientes.get(i).getPin())) //si el pin introducido es igual al de un cliente entra 
                         {
                             existe = true; //existe el pin por lo tanto existe un cliente
                             System.out.println("Bienvenido " + clientes.get(i).getNombre());
                             System.out.println("Saldo actual " + clientes.get(i).getSaldo());
                             System.out.println("1) Depositar");
                             System.out.println("2) Retirar");
                             int op2 = CapturaDatos.capturarEntero("Opción");
                             switch(op2)
                             {
                                 case 1:{ //se deposita dinero 
                                     clientes.get(i).depositarSaldo(CapturaDatos.capturarFlotante("Saldo a depositar"));
                                     break;
                                 }
                                 case 2:{ //se retira dinero 
                                     if(clientes.get(i).retirarSaldo(CapturaDatos.capturarFlotante("Saldo a retirar"))) /*retirarSaldo regresa un booleano para saber si
                                         se pudo realizar la accion*/
                                     {
                                         System.out.println("Retiro exitoso");
                                     }
                                     else
                                     {
                                         System.out.println("No se pudo completar el retiro");
                                     }
                                     break;
                                 }
                             }
                         }
                     }
                        if(!existe) 
                        {
                           System.out.println("Cuenta no encontrada");
                        }
                     break;
                 }
             }
         }while(op != 3); //se sale del programa si la opción es 3
    }
}
