import java.util.Scanner;

public class ConversorNumerico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el número que desea convertir:");
        String numero = scanner.nextLine();
        
        System.out.println("Seleccione el sistema de origen:");
        System.out.println("1. Decimal");
        System.out.println("2. Binario");
        System.out.println("3. Octal");
        System.out.println("4. Hexadecimal");
        int opcionOrigen = scanner.nextInt();
        
        int numeroDecimal = convertirADecimal(numero, opcionOrigen);
        
        System.out.println("Seleccione el sistema de destino:");
        System.out.println("1. Decimal");
        System.out.println("2. Binario");
        System.out.println("3. Octal");
        System.out.println("4. Hexadecimal");
        int opcionDestino = scanner.nextInt();
        
        String resultado = convertirDesdeDecimal(numeroDecimal, opcionDestino);
        System.out.println("El resultado de la conversión es: " + resultado);
        
        scanner.close();
    }

    public static int convertirADecimal(String numero, int base) {
        switch (base) {
            case 1: return Integer.parseInt(numero); 
            case 2: return Integer.parseInt(numero, 2); 
            case 3: return Integer.parseInt(numero, 8); 
            case 4: return Integer.parseInt(numero, 16); 
            default: throw new IllegalArgumentException("Opción no válida");
        }
    }

    public static String convertirDesdeDecimal(int numero, int base) {
        switch (base) {
            case 1: return String.valueOf(numero); 
            case 2: return Integer.toBinaryString(numero); 
            case 3: return Integer.toOctalString(numero); 
            case 4: return Integer.toHexString(numero).toUpperCase(); 
            default: throw new IllegalArgumentException("Opción no válida");
        }
    }
}
