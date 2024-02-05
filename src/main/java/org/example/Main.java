package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre y apellidos: ");
        String nombre = scanner.nextLine();

        String tipoCliente;
        while (true){
            System.out.println("Tipo de cliente (Regular/VIP): ");
            tipoCliente = scanner.nextLine();

            if (tipoCliente.equalsIgnoreCase("Regular") || tipoCliente.equalsIgnoreCase("VIP")){
                break;

            }else {
                System.out.println("Tipo de cliente no valido. Por favor ingresa un tipo de cliente valido");
            }
        }


        System.out.print("Cantidad de artículos: ");
        int cantidadArticulos = scanner.nextInt();

        System.out.print("Precio total de la compra (sin descuento): ");
        double precioTotalSinDescuento = scanner.nextDouble();


        double descuento = calcularDescuento(tipoCliente, cantidadArticulos);


        double precioTotalConDescuento = precioTotalSinDescuento - (precioTotalSinDescuento * descuento);


        System.out.println("-------------------------------------");
        System.out.println("Resumen de la compra:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo de cliente: " + tipoCliente);
        System.out.println("Cantidad de artículos: " + cantidadArticulos);
        System.out.println("Precio total sin descuento: $" + precioTotalSinDescuento);


        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");


        System.out.println("Precio total con descuento: $" + precioTotalConDescuento);
        System.out.println("-------------------------------------");
    }
    
    private static double calcularDescuento(String tipoCliente, int cantidadArticulos) {
        double descuento = 0;

        if (tipoCliente.equalsIgnoreCase("Regular")) {
            if (cantidadArticulos <= 3) {
                descuento = 0.05;
            } else if (cantidadArticulos <= 6) {
                descuento = 0.1;
            } else {
                descuento = 0.15;
            }
        } else if (tipoCliente.equalsIgnoreCase("VIP")) {
            if (cantidadArticulos <= 3) {
                descuento = 0.1;
            } else if (cantidadArticulos <= 6) {
                descuento = 0.15;
            } else {
                descuento = 0.2;
            }
        }

        return descuento;
    }
}