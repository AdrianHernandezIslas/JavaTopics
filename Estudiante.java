
/**
 * Write a description of class Estudiante here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Estudiante extends Persona
{
    @Override //Sobre escrito
    public String checarEntrada(){
         
         String accion = "muestro mi crendencial";
         accion += ", entro al tec";
         
        return accion;
    }
}
