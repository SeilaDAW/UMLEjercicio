package entornouml;
/**
*Ejercicio de ciclos formativos
*
*@author Seila.
*/
public class Pregunta {

    protected String enunciado;

    protected String[] respuestas;

    protected int respuestaValida;

    public Pregunta(String enunciado, String[] respuestas, int respuestaValida) {
        this.enunciado = enunciado;
        this.respuestas = respuestas;
        this.respuestaValida = respuestaValida;
    }

    /**
     * @return the enunciado
     */
    public String getEnunciado() {
        return enunciado;
    }

    /**
     * @param enunciado the enunciado to set
     */
    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    /**
     * @return the respuestas
     */
    public String[] getRespuestas() {
        return respuestas;
    }

    /**
     * @param respuestas the respuestas to set
     */
    public void setRespuestas(String[] respuestas) {
        this.respuestas = respuestas;
    }

    /**
     * @return the respuestaValida
     */
    public int getRespuestaValida() {
        return respuestaValida;
    }

    /**
     * @param respuestaValida the respuestaValida to set
     */
    public void setRespuestaValida(int respuestaValida) {
        this.respuestaValida = respuestaValida;
    }
}
