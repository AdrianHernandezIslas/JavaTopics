
/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona
{
    // instance variables - replace the example below with your own
    protected String nombre;
    protected String primerApellido;
    protected String segundoApellido;

    /**
     * Constructor for objects of class Persona
     */
    public Persona()
    {
    }

    public String checarEntrada(){
        return "cheque mi entrada";
    }

    public String getNombre(){
        return nombre;
    }
    
    public String getPrimerApellido(){
        return primerApellido;
    }
    
    public String getSegundoApellido(){
        return segundoApellido;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setPrimerApellido(String primerApellido){
        this.primerApellido = primerApellido;
    }
}
