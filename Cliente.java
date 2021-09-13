
package practica4;


public class Cliente {
    
    private int pin;
    private float saldo;
    private String nombreCliente;
    
    public Cliente(String nombreCliente,int pin,float saldo) //Metodo constructor de la clase cliente
    {
        setNombre(nombreCliente);
        setPin(pin);
        while(saldo < 0) //se valida que el primer saldo no sea negativo
        {
            System.out.println("Introduce saldo valido");
            saldo = CapturaDatos.capturarEntero("Introduce saldo");
        }
        setSaldo(saldo);
    }
    
    
    public void setPin(int pin)
    {
        this.pin = pin;
    }
    public int getPin()
    {
        return pin;
    }
    
    public void setSaldo(float saldo)
    {
        this.saldo = saldo;
    }
    public float getSaldo()
    {
        return saldo;
    }
    
    public void setNombre(String nombre)
    {
        nombreCliente = nombre;
    }
    
    public String getNombre()
    {
        return nombreCliente;
    }
    
    public void depositarSaldo(float depositar)
    {
        saldo+=depositar; //se suma el saldo y el monto a depositar 
    }
    public boolean retirarSaldo(float retirar)
    {
        if(retirar > saldo) //si el saldo a retirar el mas del que se tiene en la cuenta no se realiza la accion
        {
            return false;
        }
        else
        {
            saldo-=retirar;
            return true;
        }
    }
}
