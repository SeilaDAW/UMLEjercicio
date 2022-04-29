package entornouml;
/**
*Ejercicio de ciclos formativos
*
*@author Seila.
*/
public class Tarea {

    protected String descripcion;

    public Tarea(String descripcion) {
        this.descripcion = descripcion;
    }

    public void calificar() {
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
