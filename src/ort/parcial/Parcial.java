package ort.parcial;

import java.util.Scanner;

public class Parcial {

    final static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        String patente;
        String tipoVehiculo;
        int contA = 0;
        int contM = 0;
        int contC = 0;
        final String FIN = "FIN";
        int hora;
        double peaje = 0;
        double totalRecaudado1 = 0;
        double totalAutos = 0;
        double cincuentaPorciento = 1.5;
        int horaTopeMaxima = 23;
        int horaPeajeMinima = 9;
        int horaPeajeMaxima = 18;

        System.out.println("Ingresa la patente del vehiculo (FIN para finalizar la carga): ");
        patente = input.nextLine();
        while (!patente.equalsIgnoreCase(FIN)) {
            do {
                System.out.println("Ingresa tipo de vehiculo (M - Moto, A - Automovil, C - Camioneta): ");
                tipoVehiculo = input.nextLine();
            } while (!tipoVehiculo.equalsIgnoreCase("M") && !tipoVehiculo.equalsIgnoreCase("C") && !tipoVehiculo.equalsIgnoreCase("A"));
            if (tipoVehiculo.equalsIgnoreCase("A")) {
                contA++;
                peaje = 100;
            } else if (tipoVehiculo.equalsIgnoreCase("M")) {
                contM++;
                peaje = 50;
            } else {
                contC++;
                peaje = 150;
            }
            do {
                System.out.println("Ingresa la hora de 0 a 23: ");
                hora = input.nextInt();
                input.nextLine();
            } while (hora > horaTopeMaxima);
            if (hora >= horaPeajeMinima && hora <= horaPeajeMaxima)
                peaje = peaje * cincuentaPorciento;
            totalRecaudado1 = totalRecaudado1 + peaje;
            totalAutos = (double) contA * 100 / (contC + contM + contA);
            System.out.println("El peaje del vehiculo con patente " + patente + " es " + peaje + "\n");
            System.out.println("Ingresa la patente del vehiculo (FIN para finalizar la carga) ");
            patente = input.nextLine();
        }
        if (patente.equalsIgnoreCase(FIN)) {
            System.out.println("No se ingresaron vehiculos \n ");
        } else {
            System.out.println("El total recaudado fue: " + totalRecaudado1);
            System.out.println("El porcentaje total de autos es: " + totalAutos + " %");
            System.out.println("Pasaron un total de: " + contA + " Automoviles");
            System.out.println("Pasaron un total de: " + contM + " Motos");
            System.out.println("Pasaron un total de: " + contC + " Camionetas");
        }
        input.close();
    }

}

