public class Ejercicio2 {
    private static final double CONSUMO_AGUA_DIA = 1.5;
    private static final double CONSUMO_COMIDA_DIA = 0.5;
    private static final double CONSUMO_OXIGENO_DIA = 0.84;

    private static final double UMBRAL_SEGURO = 50;

    public static void main(String[] args) {
        int dias = 5;
        int personas = 4;
        double[] consumoTotal = calcularConsumo(dias, personas);

        System.out.println("Consumo total para " + personas + " personas en " + dias + " días:");
        System.out.println("Agua: " + consumoTotal[0] + " litros");
        System.out.println("Comida: " + consumoTotal[1] + " kg");
        System.out.println("Oxígeno: " + consumoTotal[2] + " m^3");

        verificarAlerta(consumoTotal);

        double[] estadisticas = calcularEstadisticas(consumoTotal, dias, personas);
        System.out.println("Estadísticas de consumo diario por persona:");
        System.out.println("Media de consumo diario: Agua = " + estadisticas[0] + " litros, Comida = " + estadisticas[1] + " kg, Oxígeno = " + estadisticas[2] + " m^3");
    }

    private static double[] calcularConsumo(int dias, int personas) {
        double agua = CONSUMO_AGUA_DIA * dias * personas;
        double comida = CONSUMO_COMIDA_DIA * dias * personas;
        double oxigeno = CONSUMO_OXIGENO_DIA * dias * personas;
        return new double[]{agua, comida, oxigeno};
    }

    private static void verificarAlerta(double[] consumo) {
        double capacidadAgua = 500;
        double capacidadComida = 200;
        double capacidadOxigeno = 150;

        double porcentajeAgua = (consumo[0] / capacidadAgua) * 100;
        double porcentajeComida = (consumo[1] / capacidadComida) * 100;
        double porcentajeOxigeno = (consumo[2] / capacidadOxigeno) * 100;

        if (porcentajeAgua < UMBRAL_SEGURO || porcentajeComida < UMBRAL_SEGURO || porcentajeOxigeno < UMBRAL_SEGURO) {
            System.out.println("Alerta: Los niveles de recursos están por debajo del umbral seguro.");
        } else {
            System.out.println("Los niveles de recursos son seguros.");
        }
    }

    private static double[] calcularEstadisticas(double[] consumo, int dias, int personas) {
        double mediaAgua = consumo[0] / (dias * personas);
        double mediaComida = consumo[1] / (dias * personas);
        double mediaOxigeno = consumo[2] / (dias * personas);
        return new double[]{mediaAgua, mediaComida, mediaOxigeno};
    }
}