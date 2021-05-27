package ort.fsf;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final String largoString = "AAA123";

        System.out.println("Ingresa la patente del vehiculo (FIN para finalizar carga): ");
        final String patenteVehiculo = sc.nextLine();

        if (patenteVehiculo.equals("FIN")) {
            System.out.println("No se ingresaron vehiculos.");
            return;
        } else {
            //VALIDAR PATENTE
            if (patenteVehiculo.length() == largoString.length()) {
                System.out.println("La patente ingresada es correcta");
            } else {
                System.out.println("No ingresaste una patente correcta");
                return;
            }
        }
        System.out.println("Ingrese el tipo del vehiculo (A-AUTOS/ M-MOTOS/ C-CAMIONETAS): ");
        final String tipoVehiculo = sc.nextLine();
        //VALIDAR TIPO DE VEHICULO
        if (tipoVehiculo.equals("A")) {
            System.out.println("Tipo de vehiculo correcto");
        } else if (tipoVehiculo.equals("M")) {
            System.out.println("Tipo de vehiculo correcto");
        } else if (tipoVehiculo.equals("C")) {
            System.out.println("Tipo de vehiculo correcto");
        } else {
            System.out.println("Tipo de vehiculo no encontrado");
            return;
        }
        System.out.println("Ingrese la hora de llegada del vehiculo (solo HORA - 0 a 23): ");
        final int horaVehiculo = sc.nextInt();
        //VALIDAR HORA DE LLEGADA QUE ESTE EN EL RANGO
        if (horaVehiculo > 0 && horaVehiculo < 23) {
            System.out.println("Hora ingresada correctamente");
        } else {
            System.out.println("Vuelva a ingresar la hora en el rango dicho");
            return;
        }
        int autosTarifas = (0);
        int motosTarifcas = (0);
        int camionesTarifas = (0);

        //TARIFAS
        if (horaVehiculo > 9 && horaVehiculo < 18) {
            if (tipoVehiculo.equals("A")) {
                System.out.println("El peaje del vehiculo " + patenteVehiculo + " es $150");
                autosTarifas++;
            } else if (tipoVehiculo.equals("M")) {
                System.out.println("El peaje del vehiculo " + patenteVehiculo + " es $75");
                motosTarifcas++;
            } else {
                System.out.println("El peaje del vehiculo " + patenteVehiculo + " es $225");
                camionesTarifas++;
            }
        } else {
            if (tipoVehiculo.equals("A")) {
                System.out.println("El peaje del vehiculo " + patenteVehiculo + " es $100");
                autosTarifas++;
            } else if (tipoVehiculo.equals("M")) {
                System.out.println("El peaje del vehiculo " + patenteVehiculo + " es $50");
                motosTarifcas++;
            } else {
                System.out.println("El peaje del vehiculo " + patenteVehiculo + " es $150");
                camionesTarifas++;
            }
        }

        final double totalVehiculos = autosTarifas + motosTarifcas + camionesTarifas;

        //TOTALES DE VEHICULOS INGRESADOS
        System.out.println("El dia de hoy se ingresaron: " + autosTarifas + " de autos.");
        System.out.println("El dia de hoy se ingresaron: " + motosTarifcas + " de motos.");
        System.out.println("El dia de hoy se ingresaron: " + camionesTarifas + " de camionetas.");

        //PORCENTAJE DE VEHICULOS INGRESADOS
        System.out.println(autosTarifas * 100 / totalVehiculos + " este porcentaje de autos ingresaron hoy.");
        System.out.println(motosTarifcas * 100 / totalVehiculos + " este porcentaje de motos ingresaron hoy.");
        System.out.println(camionesTarifas * 100 / totalVehiculos + " este porcentaje de camiones ingresaron hoy.");

    }
}