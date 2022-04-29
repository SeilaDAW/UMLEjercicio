package entornouml;
/**
*Ejercicio de ciclos formativos
*
*@author Seila.
*/
public class Competencia {

    protected String descrpcion;

    protected String nombre;

    public Competencia(String descrpcion, String nombre) {
        this.descrpcion = descrpcion;
        this.nombre = nombre;
    }

    /**
     * @return the descrpcion
     */
    public String getDescrpcion() {
        return descrpcion;
    }

    /**
     * @param descrpcion the descrpcion to set
     */
    public void setDescrpcion(String descrpcion) {
        this.descrpcion = descrpcion;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
