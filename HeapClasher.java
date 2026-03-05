import java.util.ArrayList;
import java.util.List;

public class HeapClasher {
    public static void main(String[] args) {
        System.out.println("Iniciando aplicación... llenando el Heap Space para EDA.");
        List<byte[]> list = new ArrayList<>();
        try {
            while (true) {
                // Añade 10MB en cada iteración
                list.add(new byte[1024 * 1024 * 10]); 
                System.out.println("Memoria usada: " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (1024 * 1024) + " MB");
            }
        } catch (OutOfMemoryError e) {
            System.err.println("¡ERROR: OutOfMemory detectado!");
            // El JVM ejecutará el comando curl configurado en los parámetros de arranque
            throw e; 
        }
    }
}