import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
//        System.out.print("Ingrese la cantidad de Notas: ");
//        int cantidadNotas = teclado.nextInt();
//
//        float notas[] = new float[cantidadNotas];
//        float notaMayor = 0;
//        float totalNotas = 0;
//
//        for (int n = 0; n < notas.length; n++) {
//            System.out.print("Ingrese la nota n°" + (n+1) + ": ");
//            notas[n] = teclado.nextFloat();
//
//            totalNotas += notas[n];
//
//            if (notaMayor < notas[n]) {
//                notaMayor = notas[n];
//            }
//        }
//        System.out.println("La nota más alta es: " + notaMayor);
//        System.out.println("El promedio de notas es: " + totalNotas / cantidadNotas);

        //Segundo Ejercicio
//        Scanner cantidad = new Scanner(System.in);
//        System.out.print("Ingrese la cantidad a cargar de notas: ");
//        int cantNotas = cantidad.nextInt();
//
//        float vector[] = new float[cantNotas];
//
//        float aprobados=0;
//        float desaprobados=0;
//
//        for (int m =0; m < vector.length; m++) {
//            System.out.print("Ingrese la nota del alumno: ");
//            vector[m]= cantidad.nextFloat();
//
//            if (vector[m] >= 6) {
//                aprobados++;
//            } else {
//                desaprobados++;
//            }
//
//        }
//
//        System.out.println("La cantidad de aprobados es de: " + aprobados);
//        System.out.println("La cantidad de deaprobados es de: " + desaprobados);

        //  Se tienen 2 vectores con “n” productos, uno con las cantidades[n] y el otro con los
        //  costos[n]. Determinar el precio total e informar todos aquellos que superen los $1000
//
//        Scanner teclado = new Scanner(System.in);
//        System.out.println("Ingrese la cantidad total de productos: ");
//
//        int totalProductos = teclado.nextInt();
//
//        float precioTotal = 0;
//
//        int cantidades[] = new int[totalProductos];
//        float costos[] = new float[totalProductos];
//
//        for (int i = 0; i < totalProductos; i++) {
//            System.out.println("Ingrese la cantidad del producto " + (i+1) + " : ");
//            cantidades[i] = teclado.nextInt();
//
//            System.out.println("Ingrese el costo del producto " + (i+1) + " : ");
//            costos[i] = teclado.nextFloat();
//
//            precioTotal = cantidades[i] * costos[i];
//            System.out.println("El precio total es de :" + precioTotal);
//
//            if (precioTotal > 1000) {
//                System.out.println("Supera los $1000");
//            }
//        }

//        Una empresa de camiones necesita un algoritmo para controlar el egreso de sus 30
//        camiones desde la planta y la carga que transportan. Para ello, se necesita que por cada
//        camión se cargue por teclado su patente, el nombre y apellido del chofer, el tipo de carga
//        que lleva (madera, yerba o té) y a qué hora egresó. Además, la empresa necesita saber
//        cuántos camiones cargaron té. Al final, debe mostrar todos estos datos por pantalla al
//        usuario.

//        int camionesDeTe = 0;
//
//
//        Camion listaDeCamiones[] = new Camion[3];
//
//        for (int i= 0; i < 3; i++) {
//
//            Camion camion = new Camion();
//
//            System.out.print("\nIngrese patente del camion: ");
//            camion.setPatente(teclado.nextLine());
//
//            System.out.print("\nIngrese nombre del chófer: ");
//            camion.setNombre(teclado.nextLine());
//
//            System.out.print("\nIngrese apellido del chófer: ");
//            camion.setApellido(teclado.nextLine());
//            String carga = "";
//            while (!(carga.equals("1") || carga.equals("2") || carga.equals("3"))) {
//
//                System.out.println("\nIngrese el tipo de carga que lleva. ");
//                System.out.println("1). Madera.");
//                System.out.println("2). Yerba. ");
//                System.out.println("3). Té. ");
//                System.out.print("Seleccione la opción que corresponda (1, 2, o 3): ");
//                carga = teclado.nextLine();
//
//                if (!(carga.equals("1") || carga.equals("2") || carga.equals("3"))) {
//                    System.out.println("ERROR, opción inválida. Por favor, ingrese 1, 2 o 3");
//                }
//            }
//            camion.setCarga(carga);
//
//            if (carga.equals("3")) {
//                camionesDeTe++;
//            }
//
//            System.out.print("\nIngrese a qué hora egresó: ");
//            camion.setHora(teclado.nextLine());
//
//            listaDeCamiones[i] = camion;
//        }
//
//        System.out.printf("\n%-10s %-15s %-15s %-10s %-10s\n",  "Patente", "Nombre", "Apellido", "Carga", "Hora");
//        System.out.println("------------------------------------------------------------------------------");
//
//        for (int i = 0; i < 3; i++) {
//            String tipoCarga = "";
//            if (listaDeCamiones[i].getCarga().equals("1")) {
//                tipoCarga = "Madera";
//            } else if (listaDeCamiones[i].getCarga().equals("2")) {
//                tipoCarga = "Yerba";
//            } else if (listaDeCamiones[i].getCarga().equals("3")) {
//                tipoCarga = "Té";
//            }
//            System.out.printf("%-10s %-15s %-15s %-10s %-10s\n",
//                    listaDeCamiones[i].getPatente(),
//                    listaDeCamiones[i].getNombre(),
//                    listaDeCamiones[i].getApellido(),
//                    tipoCarga,
//                    listaDeCamiones[i].getHora());
//
//        }
//        System.out.println(" ");
//        System.out.print("\nCantidad de camiones que cargaron té: " + camionesDeTe);

        System.out.println("Acá va el punto 5: ");


    }
}