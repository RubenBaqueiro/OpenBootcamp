class Cliente extends PersonaHerencia {
    private int credito;

    Cliente(int edad, String nombre, int telefono, int credito) {
        super(edad, nombre, telefono);
        this.credito = credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public int getCredito() {
        return this.credito;
    }

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente(24, "Ruben", 986, 1234);
        cliente1.setEdad(35);
        cliente1.setNombre("Brais");
        cliente1.setTelefono(986);
        cliente1.setCredito(1234);

        System.out.println("Tengo " + cliente1.getEdad() + " años");
        System.out.println("Mi nombre es " + cliente1.getNombre());
        System.out.println("Mi número de teléfono es " + cliente1.getTelefono());
        System.out.println("Mi crédito es " + cliente1.getCredito() + " euros");
    }
}
