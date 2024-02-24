public class Ejercicio5 {

    public static void main(String[] args) {
        String mensaje = "La Tierra es un planeta redondo";

        System.out.println("Mensaje Original: " + mensaje);
        System.out.println("Cantidad de vocales: " + contarVocales(mensaje));
        System.out.println("Mensaje Invertido: " + invertirMensaje(mensaje));
        System.out.println("¿Es Palíndromo? (ignorando espacios, mayúsculas y signos de puntuación): " + esPalindromo(mensaje));
    }


    public static int contarVocales(String mensaje) {
        int contador = 0;
        String mensajeMinuscula = mensaje.toLowerCase();
        for (int i = 0; i < mensajeMinuscula.length(); i++) {
            char c = mensajeMinuscula.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        return contador;
    }

    public static String invertirMensaje(String mensaje) {
        return new StringBuilder(mensaje).reverse().toString();
    }

    public static boolean esPalindromo(String mensaje) {
        String mensajeLimpio = mensaje.toLowerCase().replaceAll("[\\s+.,!¡¿?@]", "");
        String mensajeInvertido = new StringBuilder(mensajeLimpio).reverse().toString();
        return mensajeLimpio.equals(mensajeInvertido);
    }
}