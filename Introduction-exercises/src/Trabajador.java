class Trabajador extends PersonaHerencia {
    private int salario;

    Trabajador(int edad, String nombre, int telefono, int salario) {
        super(edad, nombre, telefono);
        this.salario = salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getSalario() {
        return this.salario;
    }

    public static void main(String[] args) {

        Trabajador trabajador1 = new Trabajador(24, "Ruben", 986, 9876);
        trabajador1.setEdad(35);
        trabajador1.setNombre("Brais");
        trabajador1.setTelefono(986);
        trabajador1.setSalario(9876);

        System.out.println("Tengo " + trabajador1.getEdad() + " años");
        System.out.println("Mi nombre es " + trabajador1.getNombre());
        System.out.println("Mi número de teléfono es " + trabajador1.getTelefono());
        System.out.println("Mi salario es " + trabajador1.getSalario() + " euros");
    }
}
