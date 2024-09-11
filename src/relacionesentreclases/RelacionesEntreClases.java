package relacionesentreclases;

public class RelacionesEntreClases {
    public static void main(String[] args) {
        Profesor prof1 = new Profesor("Carlos Camacho", "Computacion");
        Profesor prof2 = new Profesor("Yalu Garcia", "Estructuras de datos");
        Profesor prof3 = new Profesor("Maria del Consuelo", "Matemáticas elementales");
        Profesor prof4 = new Profesor("Erika Bonfil", "Programación 2");

        Universidad uni = new Universidad("BUAP");
        uni.agregarProfesor(prof1);
        uni.agregarProfesor(prof2);
        uni.agregarProfesor(prof3);
        uni.agregarProfesor(prof4);

        System.out.println(uni);
        
        uni.eliminarProfesor(prof2);
        
        System.out.println(uni);
    }
}
