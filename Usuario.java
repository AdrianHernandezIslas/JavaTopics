
/**
 * Write a description of class Usuario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 * 
 * 1.- No proporcionar ningún método que permita modificar el objeto
 * 2.- Implementar la visibilidad privada para los atributos
 * 3.- Los atributos y la clase deben de utilizar la palabra reservada final
 * 4.- Usar copias defensivas
 */
public final class Usuario
{
    private final String alias;//2.-  3.-
    private final String correo;
    //private final String rol;
    private final Rol rol;
    
    //private final double PI = 3.1416;
    //private final double EULER;
    
    public Usuario(String alias,String correo,Rol rol){
        this.alias = alias;
        this.correo = correo;
        this.rol = rol;
        //this.EULER = 2.56;
    }
    
    public String getAlias(){
        return alias;
    }

    public String getCorreo(){
        return correo;
    }
    
    //4.- Usar copias defensivas
    public Rol getRol(){
        return new Rol(rol.getNombre());
    }
    
    /*public String getRol(){
        return rol;
    }*/
    
    //Modifica un atrubuto del objeto 
    /*public void setAlias(String alias){
        this.alias = alias;
    }*/
}