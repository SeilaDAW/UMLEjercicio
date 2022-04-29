package entornouml;
/**
*Ejercicio de ciclos formativos
*
*@author Seila.
*/
public class Modulo {

    protected String nombre;

    protected String contenido;

    protected int horas;

    protected Alumno[] alumnado;

    protected Profesor[] claustro;

    protected Examen pruebaexamen;

    protected Tarea pruebaTarea;

    public void matricularAlumno() {
    }

    public void contratarProfesor() {
    }

    public void evaluarAlumno() {
    }

    public Modulo(String nombre, String contenido, int horas, Alumno[] alumnado, Profesor[] claustro, Examen pruebaexamen, Tarea pruebaTarea) {
        this.nombre = nombre;
        this.contenido = contenido;
        this.horas = horas;
        this.alumnado = alumnado;
        this.claustro = claustro;
        this.pruebaexamen = pruebaexamen;
        this.pruebaTarea = pruebaTarea;
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

    /**
     * @return the contenido
     */
    public String getContenido() {
        return contenido;
    }

    /**
     * @param contenido the contenido to set
     */
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    /**
     * @return the horas
     */
    public int getHoras() {
        return horas;
    }

    /**
     * @param horas the horas to set
     */
    public void setHoras(int horas) {
        this.horas = horas;
    }

    /**
     * @return the alumnado
     */
    public Alumno[] getAlumnado() {
        return alumnado;
    }

    /**
     * @param alumnado the alumnado to set
     */
    public void setAlumnado(Alumno[] alumnado) {
        this.alumnado = alumnado;
    }

    /**
     * @return the claustro
     */
    public Profesor[] getClaustro() {
        return claustro;
    }

    /**
     * @param claustro the claustro to set
     */
    public void setClaustro(Profesor[] claustro) {
        this.claustro = claustro;
    }

    /**
     * @return the pruebaexamen
     */
    public Examen getPruebaexamen() {
        return pruebaexamen;
    }

    /**
     * @param pruebaexamen the pruebaexamen to set
     */
    public void setPruebaexamen(Examen pruebaexamen) {
        this.pruebaexamen = pruebaexamen;
    }

    /**
     * @return the pruebaTarea
     */
    public Tarea getPruebaTarea() {
        return pruebaTarea;
    }

    /**
     * @param pruebaTarea the pruebaTarea to set
     */
    public void setPruebaTarea(Tarea pruebaTarea) {
        this.pruebaTarea = pruebaTarea;
    }
}
