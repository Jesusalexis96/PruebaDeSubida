package main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1 {

    static void Triangulo() throws IOException {
        boolean Exc = false;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do {
            Exc = false;
            try {
                
                System.out.print("Por favor ingrese el numero de filas: ");
                String rows = br.readLine();
                int filas = Integer.parseInt(rows);
                int num = 1;
                for (int x = 1; x <= filas; x++) {
                    for (int i = 1; i <= x; i++) {
                        System.out.print(num++ + " ");
                    }
                    System.out.println("");
                }
            } catch (Exception e) {
                System.out.println("Unicamente numeros enteros, vuelve a intentarlo \n");
                Exc = true;
            }
        } while (Exc == true);

    }

    public static void main(String[] args) throws IOException {
        Triangulo();
    }

}
