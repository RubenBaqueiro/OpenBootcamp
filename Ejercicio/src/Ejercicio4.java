import javax.print.event.PrintJobListener;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Ejercicio IF
        ejercicioIf(0);
        // Ejercicio While
        ejercicioWhile(0);

        // Ejercicio DoWhile
        ejercicioDoWhile(0);
        // Ejercicio BucleFor
        ejercicioFor(0);
        // Ejercicio Switch
        ejercicioSwitch("verano");
    }

    public static void ejercicioIf(int numeroIf) {

        if (numeroIf > 0) {
            System.out.println("positivo");
        }
        if (numeroIf < 0) {
            System.out.println("negativo");
        }
        if (numeroIf == 0) {
            System.out.println("0");
        }
    }

    public static void ejercicioWhile(int numeroWhile) {
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }
    }

    public static void ejercicioDoWhile(int numeroDowhile) {
        do {
            numeroDowhile++;
            System.out.println(numeroDowhile);
        } while (numeroDowhile < 3);

    }

    public static void ejercicioFor(int numeroFor) {
        for (; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }
    }

    public static void ejercicioSwitch(String estacion) {
        switch (estacion) {
            case "invierno":
                System.out.println(estacion);
                break;
            case "primavera":
                System.out.println(estacion);
                break;
            case "verano":
                System.out.println(estacion);
                break;
            case "otoño":
                System.out.println(estacion);
                break;
            default:
                break;
        }

    }
}
