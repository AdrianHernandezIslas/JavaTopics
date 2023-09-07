
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String arg[]){
        //Usuario usuario = new Usuario("adrianIslas","a@gmail.com","ADMIN");
        Rol rolUsuario = new Rol("ADMIN");
        Usuario usuario = new Usuario("adrianIslas","a@gmail.com",rolUsuario);
    }
}
