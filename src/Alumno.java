package src;
/**
 * @author fsancheztemprano
 */
public class Alumno {

    private String nombre;
    private int nota;
    private Enderezo enderezo;

    private Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
    
    public Alumno(String nombre, int nota, String rua, int numero) {
        this(nombre, nota);
        enderezo = new Enderezo(rua, numero);
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getNota() {
        return nota;
    }

    public Enderezo getEnderezo() {
        return enderezo;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", nota=" + nota + ", enderezo=" + enderezo.toString() + '}';
    }
  
    
    public class Enderezo {
        
        private String rua;
        private int numero;

        public Enderezo(String rua, int numero) {
            this.rua = rua;
            this.numero = numero;
        }

        public String getRua() {
            return rua;
        }

        public int getNumero() {
            return numero;
        }

        @Override
        public String toString() {
            return "Enderezo{" + "rua=" + rua + ", numero=" + numero + '}';
        }
        
        
    }
}
