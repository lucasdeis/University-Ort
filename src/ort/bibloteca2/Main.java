package ort.bibloteca2;

import java.util.Scanner;

public class Main {

    final static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        final int LIBROS_ESTANTES = 5;
        final String FIN_ESTANTES = "f";
        final String INFANTIL = "I";
        final String NOVELA = "N";
        final String HISTORIA = "H";
        int contI = 0;
        int contN = 0;
        int contH = 0;
        int cantPag;
        int cantPagMax = Integer.MIN_VALUE;
        String nombreLibro;
        String nombreLibroMax = "";
        String generoLibro;
        String estante;

        System.out.println("Deseas comenzar el estante o desea finalizar el ingreso de estante (Pulse F)");
        estante = input.nextLine();

        while (!estante.equalsIgnoreCase(FIN_ESTANTES)) {
            for (int i = 1; i <= LIBROS_ESTANTES; i++) {
                System.out.println("Ingrese nombre del libro");
                nombreLibro = input.nextLine();
                do {
                    System.out.println("Ingrese el genero del libro (I, N o H)");
                    generoLibro = input.nextLine();
                } while (!generoLibro.equalsIgnoreCase(INFANTIL) && !generoLibro.equalsIgnoreCase(NOVELA) && !generoLibro.equalsIgnoreCase(HISTORIA));
                do {
                    System.out.println("Ingrese cantidad de paginas: ");
                    cantPag = input.nextInt();
                    input.nextLine();
                } while (cantPag <= 0);

                if (cantPag > cantPagMax) {
                    cantPagMax = cantPag;
                    nombreLibroMax = nombreLibro;
                }

                switch (generoLibro.toUpperCase()) {
                    case INFANTIL:
                        contI++;
                        break;
                    case NOVELA:
                        contN++;
                        break;
                    case HISTORIA:
                        contH++;
                        break;
                }
            }
            System.out.println("Desea continuar con la carga de libros en los estantes o desea finalizar (Press F)");
            estante = input.nextLine();
        }
        System.out.println("El libro con mas paginas es: " + nombreLibroMax + "y su cantidad de paginas es: " + cantPagMax);
        System.out.println("La cantidad de libro de historias es: " + contH);
        System.out.println("La cantidad de libro de infantiles es: " + contI);
        System.out.println("La cantidad de libro de novelas es: " + contN);

        input.close();
    }
}
