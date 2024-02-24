public class Ejercicio3 {
    public static void main(String[] args) {
        String[] miembros = {"Alfa", "Bravo", "Charlie"};
        int[][] tareasAsignadas = {
                {3, 7, 2},
                {3, 4, 4},
                {3, 5, 1}
        };
        visualizarTablasDeTareas(miembros, tareasAsignadas);

        int[] horasDisponibles = {5, 5, 5};
        calcularCargaTrabajoOptima(miembros, tareasAsignadas, horasDisponibles);
    }
    private static void visualizarTablasDeTareas(String[] miembros, int[][] tareasAsignadas) {
        System.out.println("Distribución de Tareas:");
        for (int i = 0; i < miembros.length; i++) {
            System.out.println(miembros[i] + "'s Tareas:");
            for (int j = 0; j < tareasAsignadas[i].length; j++) {
                System.out.println("Tarea " + (j + 1) + ": " + tareasAsignadas[i][j]);
            }
        }
    }

    private static void calcularCargaTrabajoOptima(String[] miembros, int[][] tareasAsignadas, int[] horasDisponibles) {
        System.out.println("\nCarga de Trabajo Óptima:");
        for (int i = 0; i < miembros.length; i++) {
            int cargaTrabajo = productoEscalar(tareasAsignadas[i], horasDisponibles);
            System.out.println(miembros[i] + ": " + cargaTrabajo + " unidades de trabajo.");
        }
    }
    private static int productoEscalar(int[] tareas, int[] horas) {
        int producto = 0;
        for (int i = 0; i < tareas.length; i++) {
            producto += tareas[i] * horas[i];
        }
        return producto;
    }
}