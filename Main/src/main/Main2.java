package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.concurrent.ThreadLocalRandom;

public class Main2 {

    static void Juego() {
        boolean Exc = false;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numeroMagico = ThreadLocalRandom.current().nextInt(1, 100);
        int numeroIntentos = 0;

        System.out.println("Intenta adivinar el número que he pensado");
        int numeroEnteroUsuario = 0;
        do {
            numeroIntentos++;
            do {
                Exc = false;
                try {
                    System.out.print("pienso en el: ");
                    String numeroUsuario = br.readLine();
                    numeroEnteroUsuario = Integer.parseInt(numeroUsuario);
                    if (numeroMagico > numeroEnteroUsuario) {
                        System.out.println("El número que he pensado es mayor");
                    }
                    if (numeroMagico < numeroEnteroUsuario) {
                        System.out.println("El número que he pensado es menor");
                    }
                } catch (Exception e) {
                    System.out.println("Unicamente numeros enteros, vuelve a intentarlo \n");
                    Exc = true;
                }
            } while (Exc == true);

        } while (numeroIntentos != 5 && numeroMagico != numeroEnteroUsuario);

        if (numeroMagico == numeroEnteroUsuario) {
            System.out.println("\n¡ GANASTE !");
            System.out.println("El número que pensé fue: " + numeroMagico);
            numeroIntentos--;
        }
        if (numeroIntentos == 5) {
            System.out.println("\nPERDISTE, EXEDISTE EL LIMITE DE INTENTOS");
            System.out.println("El número que pensé fue: " + numeroMagico);
        }
    }

    public static void main(String[] args) {
        Juego();
    }
}
