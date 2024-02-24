import java.util.ArrayList;
import java.util.List;

public class Ejercicio6 {
    public static void main(String[] args) {

        monitorearRadiacion(5.2); // Valor seguro
        monitorearRadiacion(15.6); // Valor extremo

        monitorearTemperatura(22);
        monitorearTemperatura(-5);

        monitorearPresion(101.325);
        monitorearPresion(50.5);

        listarPrimerosNPrimos(5);

        System.out.println("Factores primos de 60: " + descomponerEnFactoresPrimos(60));
    }
    private static void monitorearRadiacion(double nivelRadiacion) {
        if (nivelRadiacion > 10) {
            System.out.println("Alerta: Nivel de radiación crítico. Sugerencia: Incrementar el aislamiento.");
        } else {
            System.out.println("Nivel de radiación seguro.");
        }
    }

    private static void monitorearTemperatura(double temperatura) {
        if (temperatura < 0 || temperatura > 30) {
            System.out.println("Alerta: Temperatura fuera de rango seguro. Sugerencia: Ajustar sistemas de soporte vital.");
        } else {
            System.out.println("Temperatura dentro de rango seguro.");
        }
    }

    private static void monitorearPresion(double presion) {
        if (presion < 90 || presion > 110) {
            System.out.println("Alerta: Presión fuera de rango seguro. Sugerencia: Verificar sellado de la estación.");
        } else {
            System.out.println("Presión dentro de rango seguro.");
        }
    }

    private static void listarPrimerosNPrimos(int n) {
        List<Integer> primos = new ArrayList<>();
        int numero = 2;
        while (primos.size() < n) {
            if (esPrimo(numero)) {
                primos.add(numero);
                System.out.println(numero + " es un número primo.");
            }
            numero++;
        }
    }

    private static boolean esPrimo(int numero) {
        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    private static List<Integer> descomponerEnFactoresPrimos(int numero) {
        List<Integer> factores = new ArrayList<>();
        for (int i = 2; i <= numero; i++) {
            while (numero % i == 0) {
                factores.add(i);
                numero /= i;
            }
        }
        return factores;
    }
}