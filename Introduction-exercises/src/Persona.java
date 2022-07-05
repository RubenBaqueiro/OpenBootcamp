class Persona {

    private int edad;

    private String nombre;

    private int telefono;

    public Persona(int edadPasada, String nombrePasado, int telefonoPasado) {
        this.edad = edadPasada;
        this.nombre = nombrePasado;
        this.telefono = telefonoPasado;
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona(24, "Rubén", 666);
        persona1.setEdad(10);
        persona1.setNombre("David");
        persona1.setTelefono(333);
        System.out.println(persona1.getEdad());
        System.out.println(persona1.getNombre());
        System.out.println(persona1.getTelefono());
    }

    public void setEdad(int edadPasada) {
        this.edad = edadPasada;
    }

    public void setNombre(String nombrePasado) {
        this.nombre = nombrePasado;

    }

    public void setTelefono(int telefonoPasado) {
        this.telefono = telefonoPasado;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getTelefono() {
        return this.telefono;

    }

    public int getEdad() {
        return this.edad;
    }
}
