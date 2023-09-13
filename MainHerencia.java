
/**
 * Write a description of class MainHerencia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainHerencia
{
    public static void main(String args[]){
        Persona adrian = new Cliente();
        Persona jose = new Empleado();
        
        Cliente adrianCliente =(Cliente) adrian;
        Empleado adrianEmpleado = (Empleado) jose;
        
        System.out.println(adrianEmpleado.checarEntrada());
         System.out.println(adrianCliente.checarEntrada());
    }
}
