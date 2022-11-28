package archivo;

/**
 *
 * @author tutaa
 */
public class Persona {

    private String link;
    private String fecha;
    private String materia;

    public Persona(String materia, String link, String fecha) {
        this.materia = materia;
        this.link = link;
        this.fecha = fecha;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
