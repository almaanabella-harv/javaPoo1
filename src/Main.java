import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main extends  { //extends para Camion del ejercicio 4 y Persona para el 7
//    public Main(int dni, int edad, char sexo) { //esta linea y la siguiente para Persona del ejercicio 7
//        super(dni, edad, sexo);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); //hago uso del mismo scanner en todos los ejercicios por eso no lo comento
        //creo mi cantidad de notas para saber cuantas hay
//        System.out.print("Ingrese la cantidad de Notas: ");
//        int cantidadNotas = teclado.nextInt();
            //creamos nuestro vector de acuerdo a la cantidad de notas que habíamos declarado arriba
//        float notas[] = new float[cantidadNotas];
//        float notaMayor = 0;
//        float totalNotas = 0;
            //cargamos las notas del alumno
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
        //Mostramos en pantalla la nota más alta del alumno y su promedio
//        System.out.println("La nota más alta es: " + notaMayor);
//        System.out.println("El promedio de notas es: " + totalNotas / cantidadNotas);

        //Ejercicio DOS
//
//        System.out.print("Ingrese la cantidad a cargar de notas: ");
//        int cantNotas = cantidad.nextInt();
        //creamos nuestro vector de notas
//        float vector[] = new float[cantNotas];
//
//        float aprobados=0;
//        float desaprobados=0;
            //cargamos las notas
//        for (int m =0; m < vector.length; m++) {
//            System.out.print("Ingrese la nota del alumno: ");
//            vector[m]= cantidad.nextFloat();
//
//            if (vector[m] >= 6) {
//                aprobados++;
//            } else {
//                desaprobados++;
//            }
//        }
            //mostramos en pantalla la cantidad de aprobados :D y desaprobados D:
//        System.out.println("La cantidad de aprobados es de: " + aprobados);
//        System.out.println("La cantidad de deaprobados es de: " + desaprobados);

        //  EJERCICIO 3
//
//        System.out.println("Ingrese la cantidad total de productos: ");
//
//        int totalProductos = teclado.nextInt();
//
//        float precioTotal = 0;
        //creamos nuestros vectores
//        int cantidades[] = new int[totalProductos];
//        float costos[] = new float[totalProductos];
            //cargamos nuestros vectores
//        for (int i = 0; i < totalProductos; i++) {
//            System.out.println("Ingrese la cantidad del producto " + (i+1) + " : ");
//            cantidades[i] = teclado.nextInt();
//
//            System.out.println("Ingrese el costo del producto " + (i+1) + " : ");
//            costos[i] = teclado.nextFloat();
//
//            precioTotal = cantidades[i] * costos[i];
//            System.out.println("El precio total es de :" + precioTotal);
            //Informamos los que superan los 1000
//            if (precioTotal > 1000) {
//                System.out.println("Supera los $1000");
//            }
//        }

//        EJERCICIO 4
//        int camionesDeTe = 0;
            //con nuestra clase Camion, creamos nuestra array
//        Camion listaDeCamiones[] = new Camion[3];
            //cargamos los datos
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
                //validamos que la opción sea válida
//                if (!(carga.equals("1") || carga.equals("2") || carga.equals("3"))) {
//                    System.out.println("ERROR, opción inválida. Por favor, ingrese 1, 2 o 3");
//                }
//            }
//            camion.setCarga(carga);
            //contamos cuanta veces se cargó camiones de té
//            if (carga.equals("3")) {
//                camionesDeTe++;
//            }
//
//            System.out.print("\nIngrese a qué hora egresó: ");
//            camion.setHora(teclado.nextLine());
//
//            listaDeCamiones[i] = camion;
//        }
            //mostramos los resultados por pantalla en formato excel
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

//    EJERCICIO 5
        //hacemos nuestras arrays
//        ArrayList<String> dnis = new ArrayList<>();
//        ArrayList<Integer> tipos = new ArrayList<>();
//        ArrayList<Double> montos = new ArrayList<>();
//        ArrayList<String> nombresServicio = new ArrayList<>();
        //cargamos
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Cliente n°" + (i+1));
//            System.out.print("Ingrese el dni del cliente n°" + 1 + ": ");
//            String dni = teclado.nextLine();
//            dnis.add(dni);
        //ingresamos el tipo de servicio pero con validación
//            int tipoServicio;
//            while (true) {
//                System.out.println("Seleccione un TIPO DE SERVICIO (del 1 al 3)");
//                System.out.println("1. Internet 30 megas (valor: $750)");
//                System.out.println("2. Internet 50 megas (valor: $1100)");
//                System.out.println("3. Internet 100 megas (valor: $1500 con 5% de descuento por promoción)");
//                tipoServicio = Integer.parseInt(teclado.nextLine());
                //validamos si es válida la opción, si no lo es que se repita el while
//                if (tipoServicio >=1 && tipoServicio <=3) {
//                    break;
//                } else {
//                    System.out.println("Error! Por favor, ingrese un número del 1 al 3.");
//                }
//            }
//            tipos.add(tipoServicio);
            //calculamos el monto
//            double monto = 0;
//            String nombreServicio = "";
//
//            switch (tipoServicio) {
//                case 1:
//                    monto = 750;
//                    nombreServicio = "Internet 30 megas";
//                    break;
//                case 2:
//                    monto = 1100;
//                    nombreServicio = "Internet 50 megas";
//                    break;
//                case 3:
//                    monto = 1500 * 0.95;
//                    nombreServicio = "Internet 100 megas";
//                    break;
//                default:
//                    monto = 0;
//                    nombreServicio = "DESCONOCIDO";
//                    break;
//            }
//
//            montos.add(monto);
//            nombresServicio.add(nombreServicio);
//
//            System.out.println("-- -- -- -- -- -- -- -- -- -- -- -- --");
//        }
            //mostramos los resultados
//        System.out.println(">>>>>>>> FACTURA <<<<<<<<<<");
//            for (int i = 0; i < 5; i++) {
//                System.out.println("Cliente n°" + (i+1));
//                System.out.println("DNI: " + dnis.get(i));
//                System.out.println("Servicio " + nombresServicio.get(i) + " (Tipo " + tipos.get(i) + ")");
//                System.out.printf("Monto a pagar: $" + montos.get(i));
//                System.out.println("\n----------------------------------------------");
//            }
        //Ejercicio 6
        //cargamos las variables para saber el auto más rápido
//        String mejorAuto = "";
//        float mejorTiempo = 0;
//        //for para cargar los datos
//        for (int i = 0; i < 12; i++){
//
//            System.out.print("Ingrese el número del vehiculo n°" + (i+1) + ": ");
//            String auto = teclado.nextLine();
//
//            System.out.print("Ingrese su tiempo en segundos: ");
//            float tiempo = teclado.nextFloat();
//            teclado.nextLine();
//            //condicional para medir el mejor tiempo, o sea el menor
//            if (i == 0) {
//                mejorTiempo = tiempo;
//            }
//            if(mejorTiempo > tiempo){
//                mejorAuto = auto;
//                mejorTiempo = tiempo;
//            }
//            System.out.println();
//        }
//        //imprimimos los datos por pantalla^^/
//        System.out.println("\n---------Auto más rápido--------");
//        System.out.println("Número del vehículo: " + mejorAuto);
//        System.out.println("Tiempo en segundos: " + mejorTiempo);
        //Ejercicio 7
//        System.out.println("-----------------CENSO DE PERSONAS-----------------");
//        System.out.println("Ingrese 0 (cero) en el documento para finalizar el programa.");
//        List<Persona> personas = new ArrayList<>();
//
//        while (true){
//            int dni = -1;
//            while (true) {
//            System.out.print("Ingrese el DNI: ");
//                try { //intenta ejecutar el código
//                    dni = Integer.parseInt(teclado.nextLine().trim());//trim=Quita espacios en blanco que puedan estar al principio o al final del texto ingresado
//                    break;
//                } catch (NumberFormatException e) { //catch= si ocurre un error (en este caso, el parseInt si falla) no se rompe el programa y vuelve a pedir el valor
//                    System.out.println(" "); //NumberFormatException: Es el tipo de error que ocurre cuando intentás convertir texto a número y no se puede
//                }
//            }
//            if (dni == 0) break;
//            int edad= - 1;
//            while (true) {
//                System.out.print("Ingrese edad: ");
//                try {
//                    edad = Integer.parseInt(teclado.nextLine().trim());
//                    if (edad < 0) throw new NumberFormatException(); // Si la edad es negativa, forzamos un error
//                    break;
//                } catch (NumberFormatException e) {
//                    System.out.println("ERROR! Ingrese una EDAD VÁLIDA.");
//                }
//            }
//
//
//            int sexo= -1;
//            while (true) {
//                System.out.println("Seleccione una opción (sexo): ");
//                System.out.println("1- Masculino.");
//                System.out.println("2- Femenino. ");
//                try {
//                    sexo = Integer.parseInt(teclado.nextLine().trim());
//                    if (sexo != 1 && sexo != 2) throw new NumberFormatException();
//                    break;
//                } catch (NumberFormatException e) {
//                    System.out.println("¡ERROR! Ingrese (1) para Masculino o (2) para Femenino.");
//                }
//            }
//            Persona persona = new Persona(dni, edad, sexo);
//            personas.add(persona);
//            System.out.println("Persona registrada!!");
//        }
//        //estadísticas
//        int totalVarones = 0;
//        int totalMujeres = 0;
//        int varonEntre = 0;
//        Persona personaMayor = null;
//
//        for (Persona p : personas) {
//            if (p.getSexo() == 1) {
//                totalVarones++;
//                if (p.getEdad() >= 16 && p.getEdad() <65){
//                    varonEntre++;
//                }
//            } else {
//                totalMujeres++;
//            }
//            if (personaMayor == null || p.getEdad() > personaMayor.getEdad()) {
//                personaMayor = p;
//            }
//        }
//        //Resultados
//        System.out.println("-----Resultados del Censo-----");
//        System.out.println("Total de personas censadas: " + personas.size());
//        System.out.println("Cantidad de varones: " + totalVarones);
//        System.out.println("Cantidad de mujeres: " + totalMujeres);
//
//       if (totalVarones > 0) {
//           double porcentaje = (varonEntre * 100)  / totalVarones;
//           System.out.printf("\nPorcentaje de varones entre de 16 y 65 años:%.2f%%", porcentaje);
//           System.out.println("");
//       } else {
//           System.out.println("No se ingresaron varones.");
//       }
//       if (personaMayor != null) {
//           System.out.println("Persona de mayor edad es: "+ personaMayor);
//       }
//       teclado.close();
    }
}