class Vehiculo {

    private String marca;
    private int puertas;
    private int ruedas;

    public Vehiculo(String marcaPasada, int puertasPasadas, int ruedasPasadas) {
        this.marca = marcaPasada;
        this.puertas = puertasPasadas;
        this.ruedas = ruedasPasadas;
    }

    public static void main(String[] args) {
        Vehiculo coche1 = new Vehiculo("Renault", 4, 4);
        coche1.setMarca("ferrari");
        coche1.setPuertas(5);
        coche1.setRuedas(4);

        System.out.println(coche1.getMarca());
        System.out.println(coche1.getPuertas());
        System.out.println(coche1.getRuedas());

    }

    public void setMarca(String marcaPasada) {

        this.marca = marcaPasada;

    }

    public void setPuertas(int puertasPasadas) {
        this.puertas = puertasPasadas;

    }

    public void setRuedas(int ruedasPasadas) {
        this.ruedas = ruedasPasadas;
    }

    public String getMarca() {
        return this.marca;
    }

    public int getPuertas() {
        return this.puertas;
    }

    public int getRuedas() {
        return this.ruedas;
    }

}
