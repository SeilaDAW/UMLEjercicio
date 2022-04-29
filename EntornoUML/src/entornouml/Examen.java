package entornouml;
/**
*Ejercicio de ciclos formativos
*
*@author Seila.
*/
public class Examen {
    protected String descripcion;

    protected Pregunta[] listaPreguntas;

    public Examen(String descripcion, Pregunta[] listaPreguntas) {
        this.descripcion = descripcion;
        this.listaPreguntas = listaPreguntas;
    }

    public void calificar() {
    }

    public void elegirPreguntas() {
    }

    public void ordenarPreguntas() {
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

    /**
     * @return the listaPreguntas
     */
    public Pregunta[] getListaPreguntas() {
        return listaPreguntas;
    }

    /**
     * @param listaPreguntas the listaPreguntas to set
     */
    public void setListaPreguntas(Pregunta[] listaPreguntas) {
        this.listaPreguntas = listaPreguntas;
    }
}
