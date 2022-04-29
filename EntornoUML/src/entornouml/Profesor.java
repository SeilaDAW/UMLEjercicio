package entornouml;
/**
*Ejercicio de ciclos formativos
*
*@author Seila.
*/
public class Profesor extends Persona {

    protected String NRP;

    protected Modulo[] docencia;

    public Profesor(String NRP, Modulo[] docencia, String nombre, String direccion, String telefono, String alias, String Apellidos, String email) {
        super(nombre, direccion, telefono, alias, Apellidos, email);
        this.NRP = NRP;
        this.docencia = docencia;
    }

    public void anadirmodulo() {
    }

    public void setNRP() {
    }

    /**
     * @return the NRP
     */
    public String getNRP() {
        return NRP;
    }

    /**
     * @param NRP the NRP to set
     */
    public void setNRP(String NRP) {
        this.NRP = NRP;
    }

    /**
     * @return the docencia
     */
    public Modulo[] getDocencia() {
        return docencia;
    }

    /**
     * @param docencia the docencia to set
     */
    public void setDocencia(Modulo[] docencia) {
        this.docencia = docencia;
    }
}
