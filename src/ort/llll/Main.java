package ort.llll;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final java.util.Scanner sc = new Scanner(System.in);

        final String CAMION =  "con";
        final String CAMIONETA =  "cnet";
        final String UTILITARIO = "util";

        int peso = 0;
        int contCamion=0, ContCamioneta=0, contUtilitario=0;
        int acumCamion=0, acumCamioneta=0, acumUtilitario=0;
        int total=0;

        String AuxVehiculo ="";

        do {
            System.out.println("Ingrese el peso");
            peso=Integer.parseInt(sc.nextLine());

            if(peso >=100 && peso<=300) {
                AuxVehiculo=UTILITARIO;
            }
            else if(peso >=250 && peso<=600) {
                AuxVehiculo=CAMIONETA;
            }
            else if(peso >=500 && peso<=1200) {
                AuxVehiculo=CAMION;
            }
            else {
                if(peso!=0) {
                    System.out.println("El peso no es valido para el transporte");
                }
            }

            switch(AuxVehiculo) {
                case "util":
                    contUtilitario++;
                    acumUtilitario+=peso;
                    break;
                case "cnet":
                    ContCamioneta++;
                    acumCamioneta+=peso;
                    break;
                case "con":
                    contCamion++;
                    acumCamion+=peso;
                    break;
            }
        }while(peso!=0);

        total=acumUtilitario + acumCamioneta + acumCamion;

        System.out.println("Cantidad transportado en utilitario: " + contUtilitario);
        System.out.println("Cantidad transportado en camioneta: " + ContCamioneta);
        System.out.println("Cantidad transportado en cami�n: " + contCamion);

        System.out.println("Acumulado transportado en utilitario: " + acumUtilitario);
        System.out.println("Acumulado transportado en camioneta: " + acumCamioneta);
        System.out.println("Acumulado transportado en cami�n: " + acumCamion);

        System.out.println("Total: " + total);
    }
}
