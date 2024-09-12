// First pr
package relacionesentreclases;

public class Profesor {
    private static int contadorId = 1; 
    
    private int id;
    private String nombre;
    private String campo;
    
    public Profesor(String nombre, String campo) {
        this.id = contadorId;
        contadorId++;
        this.nombre = nombre;
        this.campo = campo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }
    
    @Override
    public String toString() {
        return "ID: " + this.id + ".  Profesor: " + nombre + ".  Area: " + campo + ".\n";
    }
}
