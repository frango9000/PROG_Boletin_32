package src;
/**
 * @author fsancheztemprano
 */
public class Main {
    public static void main(String[] args) {
        Alumno alumno;
        alumno = new Alumno("Nombre", 9, "miradoiro", 3);
        System.out.println(alumno.toString());
        alumno.setNota(8);
        System.out.println(alumno.toString());
    }
}