public class Coche {

    int numeroPuertas;

    public Coche() {
        numeroPuertas = 0;
    }

    public static void main(String[] args) {
        Coche miCoche = new Coche();

        miCoche.incrementPuertas(1);
        miCoche.mostrarNumeroPuertas();
    }

    public int incrementPuertas(int numeroQueQueremosIncrementar) {
        int nuevoNumeroPuertas = this.numeroPuertas + numeroQueQueremosIncrementar;
        return nuevoNumeroPuertas;
    }

    public void mostrarNumeroPuertas() {
        System.out.println(this.numeroPuertas);
    }

}