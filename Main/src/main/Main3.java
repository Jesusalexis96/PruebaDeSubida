package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.ThreadLocalRandom;

public class Main3 {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a, b, c;

    public void Ingresar() throws IOException {
        boolean Exc = false;
        do {
            try {
                Exc = false;
                System.out.print("Primer número: ");
                String numeroA = br.readLine();
                a = Integer.parseInt(numeroA);
                System.out.print("Segundo número: ");
                String numeroB = br.readLine();
                b = Integer.parseInt(numeroB);
                System.out.print("Tercer número: ");
                String numeroC = br.readLine();
                c = Integer.parseInt(numeroC);
            } catch (Exception e) {
                System.out.println("Unicamente numeros enteros, vuelve a intentarlo \n");
                Exc = true;
            }
        } while (Exc == true);

    }

    public void Ordenar() throws IOException {
        if (a > b) {
            if (a > c) {
                if (b > c) {
                    System.out.println("Orden descendente: " + a + " " + b + " " + c);
                } else {
                    System.out.println("Orden descendente: " + b + " " + c + " " + a);
                }
            } else {
                System.out.println("Orden descendente: " + c + " " + a + " " + b);
            }
        } else {
            if (b > c) {
                if (a > c) {
                    System.out.println("Orden descendente: " + b + " " + a + " " + c);
                } else {
                    System.out.println("Orden descendente: " + b + " " + c + " " + a);
                }
            } else {
                System.out.println("Orden descendente: " + c + " " + b + " " + a);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Main3 fc = new Main3();
        fc.Ingresar();
        fc.Ordenar();
    }
}
