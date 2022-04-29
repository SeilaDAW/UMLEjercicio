package entornouml;
/**
*Ejercicio de ciclos formativos
*
*@author Seila.
*/
public class Alumno extends Persona {

    protected double notamedia;

    protected Modulo[] matricula;

    public Alumno(double notamedia, Modulo[] matricula, String nombre, String direccion, String telefono, String alias, String Apellidos, String email) {
        super(nombre, direccion, telefono, alias, Apellidos, email);
        this.notamedia = notamedia;
        this.matricula = matricula;
    }
    public void emitirCertificado() {
    }

    public double calcularNotaMedia() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void matricular() {
    }

    /**
     * @return the notamedia
     */
    public double getNotamedia() {
        return notamedia;
    }

    /**
     * @param notamedia the notamedia to set
     */
    public void setNotamedia(double notamedia) {
        this.notamedia = notamedia;
    }

    /**
     * @return the matricula
     */
    public Modulo[] getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(Modulo[] matricula) {
        this.matricula = matricula;
    }
}
