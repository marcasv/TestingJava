package relacionesentreclases;

public class Universidad {
    private String nombre;
    private Profesor[] profesores;
    private int profIndex; 
    
    public Universidad(String nombre) {
        this.nombre = nombre;
        profesores = new Profesor[10];
        profIndex = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public boolean agregarProfesor(Profesor prof) {
        // Ya no hay más vacantes
        if (this.profIndex >= 9) {
            return false;
        }
        
        // return profIndex >= 9  <--- esto es ideal
        
        this.profesores[this.profIndex] = prof;
        this.profIndex++;
        return true;
    }
    
    public boolean eliminarProfesor(Profesor prof) {
        if (this.profIndex == 0) {
            return false;
        }
        
        // return profIndex == 0  <--- esto es ideal
        for (int i = 0; i < this.profIndex; i++) {
            if (this.profesores[i].getNombre().equals(prof.getNombre())) {
                this.profesores[i] = null;
                this.profIndex--;
                for (int j = i; j < this.profIndex; j++) {
                    this.profesores[j] = this.profesores[j + 1];
                }
                return true;
            }
        }
        
        return false;
    }
    
    @Override
    public String toString() {
        String retorno = "Profesores de " + this.nombre;
        for (int i = 0; i < this.profIndex; i++) {
            retorno += "\n" + this.profesores[i].toString();
        }
        return retorno;
    }
}
