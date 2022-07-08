public class PersonaHerencia {
    private int edad;
    private String nombre;
    private int telefono;

    public PersonaHerencia(int edad, String nombre, int telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public static void main(String[] args) {

    }

    public int getEdad() {
        return this.edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getTelefono() {
        return this.telefono;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

}

// Crea una clase Persona con las siguientes variables:

// La edad

// El nombre

// El teléfono

// Una vez creada la clase, crea una nueva clase Cliente que herede de Persona,
// esta nueva clase tendrá la variable credito solo para esa clase.

// Crea ahora un objeto de la clase Cliente que debe tener como propiedades la
// edad, el telefono, el nombre y el credito, tienes que darles valor y
// mostrarlas por pantalla.

// Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de
// Persona, y con una variable salario que solo tenga la clase Trabajador.