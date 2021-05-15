package lab4p2_felixvelasquez;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab4P2_FelixVelasquez {

    static Scanner lea = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            ArrayList<Metodos> lista = new ArrayList();
            ArrayList<Clase_Padre> lista2 = new ArrayList();
            boolean Login = false;
            int opcion = 0;
            while (opcion != 4) {
                System.out.printf("%s\n", "* * * * * * * * * * MENU * * * * * * * * * *");
                System.out.printf("%s\n", " 1. Crear empleados ");
                System.out.printf("%s\n", " 2. Login ");
                System.out.printf("%s\n", " 3. Proyectos de GXb ");
                System.out.printf("%s\n", " 4 Salir ");
                System.out.printf("%s\n", " Que ejercicio quiere ejecutar: ");
                opcion = lea.nextInt();
                switch (opcion) {
                    case 1: {
                        int opcion2 = 0;
                        while (opcion2 != 5) {
                            System.out.printf("%s\n", " 1. Crear Desarrolador ");
                            System.out.printf("%s\n", " 2. Crear Director");
                            System.out.printf("%s\n", " 3. Crear Consolador ");
                            System.out.printf("%s\n", " 4. Eliminar Desarrollador ");
                            System.out.printf("%s\n", " 5. Salir ");
                            opcion2 = lea.nextInt();
                            switch (opcion2) {
                                case 1: {
                                    int id = 0;
                                    System.out.println("Ingrese nombre del desarrollador");
                                    String nombre = lea.next();
                                    System.out.println("Ingrese apellido");
                                    String apellido = lea.next();
                                    try {
                                        System.out.println("Ingrese numero de identidad ");
                                        id = lea.nextInt();
                                    } catch (InputMismatchException e) {
                                        System.out.println("Error solo enteros se puede ingresar ");

                                    }
                                    System.out.println("Ingrese Nacionalidad");
                                    String nacionalidad = lea.nextLine();
                                    System.out.println("Ingrese cantidad de proyectos realizados");
                                    int proyecto = lea.nextInt();
                                    System.out.println("Ingrese anos de experiencia");
                                    int expe = lea.nextInt();
                                    System.out.println("Ingrese anos de contrato");
                                    int contratos = lea.nextInt();
                                    System.out.println("Ingrese horas de trabajo diarias");
                                    int horas = lea.nextInt();
                                    int sueldo = (12000 * 8) / 2 * contratos;
                                    System.out.println("Lenguaje de programacion preferido");
                                    String lenguaje = lea.next();
                                    lista.add(new Metodos(nombre, apellido, id, nacionalidad, proyecto, expe, contratos, horas, sueldo, lenguaje));

                                    break;

                                }
                                case 2: {

                                    System.out.println("Ingrese nombre del Director");
                                    String nombre2 = lea.next();
                                    System.out.println("Ingrese apellido");
                                    String apellido2 = lea.next();

                                    System.out.println("Ingrese numero de identidad ");
                                    int id2 = lea.nextInt();
                                    System.out.println("Ingrese Nacionalidad");
                                    String nacionalidad2 = lea.next();
                                    System.out.println("Ingrese cantidad de proyectos realizados");
                                    int proyecto2 = lea.nextInt();
                                    System.out.println("Ingrese años en su puesto");
                                    int puesto = lea.nextInt();
                                    System.out.println("Ingrese años de contrato");
                                    int contratos2 = lea.nextInt();
                                    System.out.println("Desarrolladores asiganados");
                                    int desa = lea.nextInt();
                                    System.out.println("Consultores asiganados");
                                    int consul = lea.nextInt();
                                    System.out.println("Cantidad de proyectos asignados");
                                    int asig = lea.nextInt();

                                    int sueldo2 = (int) ((proyecto2 * asig * desa * consul * 5.23) / asig * contratos2 * 2.28);

                                    lista.add(new Metodos(nombre2, apellido2, id2, nacionalidad2, proyecto2, puesto, contratos2, desa, sueldo2, asig, consul));

                                    break;
                                }
                                case 3: {

                                    System.out.println("Ingrese nombre del Consultor");
                                    String nombre3 = lea.next();
                                    System.out.println("Ingrese apellido");
                                    String apellido3 = lea.next();

                                    System.out.println("Ingrese numero de identidad ");
                                    int id3 = lea.nextInt();
                                    System.out.println("Ingrese Nacionalidad");
                                    String nacionalidad3 = lea.next();
                                    System.out.println("Ingrese cantidad de proyectos realizados");
                                    int proyecto3 = lea.nextInt();

                                    System.out.println("Ingrese años de contrato");
                                    int contratos3 = lea.nextInt();
                                    System.out.println("Principal campo de experiencia");
                                    int princi = lea.nextInt();
                                    System.out.println("Tiempo de durarion de la consultoria");
                                    int tiempo = lea.nextInt();
                                    double sueldo3 = proyecto3 * 13280 * 4.13 / 4 + contratos3;

                                    lista.add(new Metodos(nombre3, apellido3, id3, nacionalidad3, proyecto3, contratos3, princi, tiempo, sueldo3));

                                    break;
                                }
                                case 4: {

                                    break;
                                }

                            }
                        }

                        break;
                    }// fin del case 1

                    case 2: {
                        int opcion2 = 0;
                        while (opcion2 != 4) {
                            System.out.printf("%s\n", "* * * * * * * * * * MENU * * * * * * * * * *");
                            System.out.printf("%s\n", " 1. Login Desarroladores ");
                            System.out.printf("%s\n", " 2. Login Directores ");
                            System.out.printf("%s\n", " 3. Login Consoladores ");
                            System.out.printf("%s\n", " 4 Salir ");
                            System.out.printf("%s\n", " Que ejercicio quiere ejecutar: ");
                            opcion2 = lea.nextInt();
                            switch (opcion2) {
                                case 1: {

                                    int i;
                                    int passw[] = {000, 000, 000, 000, 000,};
                                    String users[] = {"Sin datos", "Sin datos", "Sin datos", "Sin datos", "Sin datos"};
                                    int tempP;
                                    String tempU;
                                    int tries = 1;

                                    for (i = 1; i <= 1; i++) {
                                        System.out.println("Ingresa el nombre del usuario " + i);
                                        users[i] = lea.next();
                                        System.out.println("Ingresa la contraseña del usuario " + users[i]);
                                        passw[i] = lea.nextInt();
                                        System.out.println("Usuario registrado con éxito!");
                                    }

                                    do {
                                        for (i = 1; i <= 1; i++) {
                                            System.out.println("Ingresa el nombre del usuario");
                                            tempU = lea.next();
                                            if (tempU.equals(users[i])) {
                                                System.out.println("Ingresa la contraseña del usuario " + tempU);
                                                tempP = lea.nextInt();
                                                if (tempP == passw[i]) {
                                                    int opcion3 = 0;
                                                    while (opcion3 != 2) {
                                                        System.out.printf("%s\n", "* * * * * * * * * * MENU * * * * * * * * * *");
                                                        System.out.printf("%s\n", " 1. Listar Desarroladores ");
                                                        System.out.printf("%s\n", " 2 Lista del proyecto ");
                                                        System.out.printf("%s\n", " 3 Salir ");
                                                        System.out.printf("%s\n", " Que ejercicio quiere ejecutar: ");
                                                        opcion3 = lea.nextInt();
                                                        switch (opcion3) {
                                                            case 1: {
                                                                System.out.println("Listas de Desarrolladores");
                                                                for (int x = 0; x < lista.size(); x++) {
                                                                    System.out.println("Nombre: " + lista.get(x).nombre);
                                                                    System.out.println("Apellido " + lista.get(x).apellido);
                                                                    System.out.println("Identidad " + lista.get(x).id);
                                                                    System.out.println("Nacionalidad " + lista.get(x).nacionalidad);
                                                                    System.out.println("Cantidad de proyectos relizados" + lista.get(x).proyecto);
                                                                    System.out.println("Anos de experiencia " + lista.get(x).expe);
                                                                    System.out.println("Anos de contrato " + lista.get(x).contratos);
                                                                    System.out.println("Lenguaje de programacuiin preferido" + lista.get(x).lenguaje);
                                                                    System.out.println("horas de trabajo diarias " + lista.get(x).horas);
                                                                    System.out.println("sueldo mensual: " + lista.get(x).sueldo);

                                                                    System.out.println();
                                                                }

                                                                break;
                                                            }
                                                            case 2: {
                                                                System.out.println("Listas de proyectos de desarrolladores");
                                                                for (int x = 0; x < lista2.size(); x++) {
                                                                    System.out.println("Nombre del proyecto: " + lista2.get(x).nombre);
                                                                    System.out.println("Nombre de la empresa: " + lista2.get(x).empresa);
                                                                    System.out.println("Duracion del proyecto: " + lista2.get(x).duracion);
                                                                    System.out.println("Descripcion del proyecto: " + lista2.get(x).duracion);
                                                                    System.out.println("Estado: " + lista2.get(x).estado);
                                                                }
                                                            }
                                                        }

                                                    }

                                                } else {
                                                    System.out.println("Contraseña incorrecta");
                                                    tries++;
                                                    continue;
                                                }
                                            } else {
                                                System.out.println("Usuario incorrecto");
                                                tries++;
                                                continue;
                                            }
                                            continue;
                                        }
                                        break;
                                    } while (tries <= 5);//Después de 5 intentos el programa se detiene

                                    break;
                                }//
                                case 2: {

                                    int i;
                                    int passw[] = {000, 000, 000, 000, 000,};
                                    String users[] = {"Sin datos", "Sin datos", "Sin datos", "Sin datos", "Sin datos"};
                                    int tempP;
                                    String tempU;
                                    int tries = 1;

                                    for (i = 1; i <= 1; i++) {
                                        System.out.println("Ingresa el nombre del usuario " + i);
                                        users[i] = lea.next();
                                        System.out.println("Ingresa la contraseña del usuario " + users[i]);
                                        passw[i] = lea.nextInt();
                                        System.out.println("Usuario registrado con éxito!");
                                    }

                                    do {
                                        for (i = 1; i <= 1; i++) {
                                            System.out.println("Ingresa el nombre del usuario");
                                            tempU = lea.next();
                                            if (tempU.equals(users[i])) {
                                                System.out.println("Ingresa la contraseña del usuario " + tempU);
                                                tempP = lea.nextInt();
                                                if (tempP == passw[i]) {
                                                    int opcion3 = 0;
                                                    while (opcion3 != 9) {
                                                        System.out.printf("%s\n", "* * * * * * * * * * MENU * * * * * * * * * *");
                                                        System.out.printf("%s\n", " 1. Listar Directores ");
                                                        System.out.printf("%s\n", " 2. Crear Desarroladores ");
                                                        System.out.printf("%s\n", " 3. Listar Desarrolladores ");
                                                        System.out.printf("%s\n", " 4. Modificar Desarrolladores ");
                                                        System.out.printf("%s\n", " 5. Eliminar desarrolladores Directores ");

                                                        System.out.printf("%s\n", " 6. Crear  Consultores ");
                                                        System.out.printf("%s\n", " 7. Listar Consultores ");
                                                        System.out.printf("%s\n", " 8. Modificar Consultores ");
                                                        System.out.printf("%s\n", " 9. Eliminar Consultores ");

                                                        System.out.printf("%s\n", " 10 Salir ");
                                                        System.out.printf("%s\n", " Que ejercicio quiere ejecutar: ");
                                                        opcion3 = lea.nextInt();
                                                        switch (opcion3) {
                                                            case 1: {
                                                                System.out.println("Listas de Directores");
                                                                for (int x = 0; x < lista.size(); x++) {
                                                                    System.out.println("Nombre: " + lista.get(x).nombre2);
                                                                    System.out.println("Apellido " + lista.get(x).apellido2);
                                                                    System.out.println("Identidad " + lista.get(x).id2);
                                                                    System.out.println("Nacionalidad " + lista.get(x).nacionalidad2);
                                                                    System.out.println("Anos durante su puesto " + lista.get(x).proyecto2);

                                                                    System.out.println("Anos de contrato " + lista.get(x).contratos2);
                                                                    System.out.println("Desarrolladores asigandos" + lista.get(x).asig);
                                                                    System.out.println("Cantidad de proyectos realizados  " + lista.get(x).proyecto2);
                                                                    System.out.println("Sueldo mensual: " + lista.get(x).sueldo2);
                                                                    System.out.println();
                                                                }

                                                                break;
                                                            }
                                                            case 2: {
                                                                int id = 0;
                                                                System.out.println("Ingrese nombre del desarrollador");
                                                                String nombre = lea.next();
                                                                System.out.println("Ingrese apellido");
                                                                String apellido = lea.next();
                                                                try {
                                                                    System.out.println("Ingrese numero de identidad ");
                                                                    id = lea.nextInt();
                                                                } catch (InputMismatchException e) {
                                                                    System.out.println("Error solo enteros se puede ingresar ");

                                                                }
                                                                System.out.println("Ingrese Nacionalidad");
                                                                String nacionalidad = lea.next();
                                                                System.out.println("Ingrese cantidad de proyectos realizados");
                                                                int proyecto = lea.nextInt();
                                                                System.out.println("Ingrese anos de experiencia");
                                                                int expe = lea.nextInt();
                                                                System.out.println("Ingrese anos de contrato");
                                                                int contratos = lea.nextInt();
                                                                System.out.println("Ingrese horas de trabajo diarias");
                                                                int horas = lea.nextInt();
                                                                int sueldo = (12000 * 8) / 2 * contratos;
                                                                System.out.println("Lenguaje de programacion preferido");
                                                                String lenguaje = lea.next();
                                                                lista.add(new Metodos(nombre, apellido, id, nacionalidad, proyecto, expe, contratos, horas, sueldo, lenguaje));

                                                                break;
                                                            }
                                                            case 3: {
                                                                System.out.println("Listas de Desarrolladores");
                                                                for (int x = 0; x < lista.size(); x++) {
                                                                    System.out.println("Nombre: " + lista.get(x).nombre);
                                                                    System.out.println("Apellido " + lista.get(x).apellido);
                                                                    System.out.println("Identidad " + lista.get(x).id);
                                                                    System.out.println("Nacionalidad " + lista.get(x).nacionalidad);
                                                                    System.out.println("Cantidad de proyectos relizados" + lista.get(x).proyecto);
                                                                    System.out.println("Anos de experiencia " + lista.get(x).expe);
                                                                    System.out.println("Anos de contrato " + lista.get(x).contratos);
                                                                    System.out.println("Lenguaje de programacuiin preferido" + lista.get(x).lenguaje);
                                                                    System.out.println("horas de trabajo diarias " + lista.get(x).horas);
                                                                    System.out.println("sueldo mensual: " + lista.get(x).sueldo);
                                                                    System.out.println();
                                                                }
                                                                System.out.println("Ingrese numero en la lista a modificar");
                                                                int posi = lea.nextInt();
                                                                while (posi < 0 || posi > lista.size()) {
                                                                    System.out.println("el indice no existe");
                                                                }

                                                                break;
                                                            }
                                                            case 4: {
                                                                String acum = "";
                                                                String acum1 = "";
                                                                for (int x = 0; x < lista.size(); x++) {
                                                                    System.out.println("Nombre: " + lista.get(x).nombre);
                                                                    System.out.println("Apellido " + lista.get(x).apellido);
                                                                    System.out.println("Identidad " + lista.get(x).id);
                                                                    System.out.println("Nacionalidad " + lista.get(x).nacionalidad);
                                                                    System.out.println("Cantidad de proyectos relizados" + lista.get(x).proyecto);
                                                                    System.out.println("Anos de experiencia " + lista.get(x).expe);
                                                                    System.out.println("Anos de contrato " + lista.get(x).contratos);
                                                                    System.out.println("Lenguaje de programacuiin preferido" + lista.get(x).lenguaje);
                                                                    System.out.println("horas de trabajo diarias " + lista.get(x).horas);
                                                                    System.out.println("sueldo mensual: " + lista.get(x).sueldo);
                                                                    System.out.println();
                                                                }

                                                                break;
                                                            }
                                                            case 5: {
                                                                int posicionEliminar = -1;
                                                                posicionEliminar = -1;
                                                                System.out.println("Ingrese el nombre del desarrollador para eliminar:");
                                                                String buscar = lea.next();
                                                                for (int j = 0; j < lista.size(); j++) {
                                                                    if (lista.get(j).nombre.equals(buscar)) {
                                                                        posicionEliminar = j;
                                                                    }
                                                                }
                                                                if (posicionEliminar >= 0) {
                                                                    lista.remove(posicionEliminar);
                                                                    System.out.println("Desarrolador se elimino");
                                                                } else {
                                                                    System.out.println("Desarrollador que buscado no existe");
                                                                }
                                                                break;
                                                            }
                                                            case 6: {
                                                                System.out.println("Ingrese nombre del Consultor");
                                                                String nombre3 = lea.next();
                                                                System.out.println("Ingrese apellido");
                                                                String apellido3 = lea.next();

                                                                System.out.println("Ingrese numero de identidad ");
                                                                int id3 = lea.nextInt();
                                                                System.out.println("Ingrese Nacionalidad");
                                                                String nacionalidad3 = lea.next();
                                                                System.out.println("Ingrese cantidad de proyectos realizados");
                                                                int proyecto3 = lea.nextInt();

                                                                System.out.println("Ingrese años de contrato");
                                                                int contratos3 = lea.nextInt();
                                                                System.out.println("Principal campo de experiencia");
                                                                int princi = lea.nextInt();
                                                                System.out.println("Tiempo de durarion de la consultoria");
                                                                int tiempo = lea.nextInt();
                                                                double sueldo3 = proyecto3 * 13280 * 4.13 / 4 + contratos3;

                                                                lista.add(new Metodos(nombre3, apellido3, id3, nacionalidad3, proyecto3, contratos3, princi, tiempo, sueldo3));

                                                                break;
                                                            }
                                                            case 7: {
                                                                System.out.println("Listas de Consultores");
                                                                for (int x = 0; x < lista.size(); x++) {
                                                                    System.out.println("Nombre: " + lista.get(x).nombre3);
                                                                    System.out.println("Apellido " + lista.get(x).apellido3);
                                                                    System.out.println("Identidad " + lista.get(x).id3);
                                                                    System.out.println("Nacionalidad " + lista.get(x).nacionalidad3);
                                                                    System.out.println("Cantidad de proyectos relizados" + lista.get(x).proyecto3);

                                                                    System.out.println("Anos de contrato " + lista.get(x).contratos3);
                                                                    System.out.println("Principal campo de experiencia" + lista.get(x).princi);
                                                                    System.out.println("Tiempo de duracion en el consultorio " + lista.get(x).tiempo);

                                                                    System.out.println();
                                                                }

                                                                break;

                                                            }
                                                            case 8: {
                                                                boolean existente = false;
                                                                String buscar;
                                                                System.out.println("Ingrese el nombre del consolador");
                                                                buscar = lea.next();
                                                                for (int j = 0; j < lista.size(); j++) {
                                                                    if (lista.get(j).nombre3.equals(buscar)) {

                                                                        System.out.println("Ingrese apellido");
                                                                        String apellido3 = lea.next();

                                                                        System.out.println("Ingrese numero de identidad ");
                                                                        int id3 = lea.nextInt();
                                                                        System.out.println("Ingrese Nacionalidad");
                                                                        String nacionalidad3 = lea.next();
                                                                        System.out.println("Ingrese cantidad de proyectos realizados");
                                                                        int proyecto3 = lea.nextInt();

                                                                        System.out.println("Ingrese años de contrato");
                                                                        int contratos3 = lea.nextInt();
                                                                        System.out.println("Principal campo de experiencia");
                                                                        int princi = lea.nextInt();
                                                                        System.out.println("Tiempo de durarion de la consultoria");
                                                                        int tiempo = lea.nextInt();
                                                                        double sueldo3 = proyecto3 * 13280 * 4.13 / 4 + contratos3;

                                                                        lista.get(i).nombre3 = buscar;
                                                                        lista.get(i).apellido3 = apellido3;
                                                                        lista.get(i).id3 = id3;
                                                                        lista.get(i).nacionalidad3 = nacionalidad3;
                                                                        lista.get(i).proyecto3 = proyecto3;
                                                                        lista.get(i).contratos3 = contratos3;
                                                                        lista.get(i).princi = princi;
                                                                        lista.get(i).tiempo = tiempo;
                                                                        lista.get(i).sueldo3 = sueldo3;
                                                                        existente = true;
                                                                        System.out.println("El consulador se actualizo");
                                                                    } else {
                                                                    }
                                                                }
                                                                if (existente == false) {
                                                                    System.out.println("El consulador no existe");
                                                                }
                                                                break;
                                                            }
                                                            case 9: {
                                                                int posicionEliminar = -1;
                                                                posicionEliminar = -1;
                                                                System.out.println("Ingrese el nombre del consultor para eliminar:");
                                                                String buscar = lea.next();
                                                                for (int j = 0; j < lista.size(); j++) {
                                                                    if (lista.get(j).nombre3.equals(buscar)) {
                                                                        posicionEliminar = j;
                                                                    }
                                                                }
                                                                if (posicionEliminar >= 0) {
                                                                    lista.remove(posicionEliminar);
                                                                    System.out.println("Consultor  eliminado");
                                                                } else {
                                                                    System.out.println("Consultor que buscado no existe");
                                                                }

                                                                break;
                                                            }

                                                        }

                                                    }

                                                } else {
                                                    System.out.println("Contraseña incorrecta");
                                                    tries++;
                                                    continue;
                                                }
                                            } else {
                                                System.out.println("Usuario incorrecto");
                                                tries++;
                                                continue;
                                            }
                                            continue;
                                        }
                                        break;
                                    } while (tries <= 5);

                                    break;

                                }/////////////////////
                                case 3: {
                                    int i;
                                    int passw[] = {000, 000, 000, 000, 000,};
                                    String users[] = {"Sin datos", "Sin datos", "Sin datos", "Sin datos", "Sin datos"};
                                    int tempP;
                                    String tempU;
                                    int tries = 1;

                                    for (i = 1; i <= 1; i++) {
                                        System.out.println("Crear usuario de consultor " + i);
                                        users[i] = lea.next();
                                        System.out.println("Ingresa la contraseña del usuario " + users[i]);
                                        passw[i] = lea.nextInt();
                                        System.out.println("Usuario registrado con éxito!");
                                    }

                                    do {
                                        for (i = 1; i <= 1; i++) {
                                            System.out.println("Ingrese usuario");
                                            tempU = lea.next();
                                            if (tempU.equals(users[i])) {
                                                System.out.println("Ingresa la contraseña del usuario " + tempU);
                                                tempP = lea.nextInt();
                                                if (tempP == passw[i]) {
                                                    int opcion3 = 0;
                                                    while (opcion3 != 3) {
                                                        System.out.printf("%s\n", "* * * * * * * * * * MENU * * * * * * * * * *");

                                                        System.out.printf("%s\n", " 1. Listar Consultores ");
                                                        System.out.printf("%s\n", " 2. Modificar Consultores ");
                                                        System.out.printf("%s\n", " 3. Eliminar Consultores ");
                                                        System.out.printf("%s\n", " 4. Lista de proyectos asignados  ");
                                                        System.out.printf("%s\n", " 4 Salir ");
                                                        System.out.printf("%s\n", " Que ejercicio quiere ejecutar: ");
                                                        opcion3 = lea.nextInt();
                                                        switch (opcion3) {

                                                            case 1: {
                                                                System.out.println("Listas de Consultores");
                                                                for (int x = 0; x < lista.size(); x++) {
                                                                    System.out.println("Nombre: " + lista.get(x).nombre3);
                                                                    System.out.println("Apellido " + lista.get(x).apellido3);
                                                                    System.out.println("Identidad " + lista.get(x).id3);
                                                                    System.out.println("Nacionalidad " + lista.get(x).nacionalidad3);
                                                                    System.out.println("Cantidad de proyectos relizados" + lista.get(i).proyecto3);

                                                                    System.out.println("Anos de contrato " + lista.get(x).contratos3);
                                                                    System.out.println("Principal campo de experiencia" + lista.get(x).princi);
                                                                    System.out.println("Tiempo de duracion en el consultorio " + lista.get(x).tiempo);

                                                                    System.out.println();
                                                                }

                                                                break;

                                                            }
                                                            case 2: {
                                                                boolean existente = false;
                                                                String buscar;
                                                                System.out.println("Ingrese el nombre del consolador");
                                                                buscar = lea.next();
                                                                for (int j = 0; j < lista.size(); j++) {
                                                                    if (lista.get(j).nombre3.equals(buscar)) {

                                                                        System.out.println("Ingrese apellido");
                                                                        String apellido3 = lea.next();

                                                                        System.out.println("Ingrese numero de identidad ");
                                                                        int id3 = lea.nextInt();
                                                                        System.out.println("Ingrese Nacionalidad");
                                                                        String nacionalidad3 = lea.next();
                                                                        System.out.println("Ingrese cantidad de proyectos realizados");
                                                                        int proyecto3 = lea.nextInt();

                                                                        System.out.println("Ingrese años de contrato");
                                                                        int contratos3 = lea.nextInt();
                                                                        System.out.println("Principal campo de experiencia");
                                                                        int princi = lea.nextInt();
                                                                        System.out.println("Tiempo de durarion de la consultoria");
                                                                        int tiempo = lea.nextInt();
                                                                        double sueldo3 = proyecto3 * 13280 * 4.13 / 4 + contratos3;

                                                                        lista.get(i).nombre3 = buscar;
                                                                        lista.get(i).apellido3 = apellido3;
                                                                        lista.get(i).id3 = id3;
                                                                        lista.get(i).nacionalidad3 = nacionalidad3;
                                                                        lista.get(i).proyecto3 = proyecto3;
                                                                        lista.get(i).contratos3 = contratos3;
                                                                        lista.get(i).princi = princi;
                                                                        lista.get(i).tiempo = tiempo;
                                                                        lista.get(i).sueldo3 = sueldo3;
                                                                        existente = true;
                                                                        System.out.println("El consulador se actualizo");
                                                                    } else {
                                                                    }
                                                                }
                                                                if (existente == false) {
                                                                    System.out.println("El consulador no existe");
                                                                }
                                                                break;
                                                            }
                                                            case 3: {
                                                                int posicionEliminar = -1;
                                                                posicionEliminar = -1;
                                                                System.out.println("Ingrese el nombre del consultor para eliminar:");
                                                                String buscar = lea.next();
                                                                for (int j = 0; j < lista.size(); j++) {
                                                                    if (lista.get(j).nombre3.equals(buscar)) {
                                                                        posicionEliminar = j;
                                                                    }
                                                                }
                                                                if (posicionEliminar >= 0) {
                                                                    lista.remove(posicionEliminar);
                                                                    System.out.println("Consultor  eliminado");
                                                                } else {
                                                                    System.out.println("Consultor que buscado no existe");
                                                                }

                                                                break;
                                                            }

                                                        }

                                                    }

                                                } else {
                                                    System.out.println("Contraseña incorrecta");
                                                    tries++;
                                                    continue;
                                                }
                                            } else {
                                                System.out.println("Usuario incorrecto");
                                                tries++;
                                                continue;
                                            }
                                            continue;
                                        }
                                        break;
                                    } while (tries <= 5);
                                    break;
                                }
                                case 4: {
                                    System.out.println("Listas de proyectos de cusultor");
                                    for (int x = 0; x < lista2.size(); x++) {
                                        System.out.println("Nombre del proyecto: " + lista2.get(x).nombre);
                                        System.out.println("Nombre de la empresa: " + lista2.get(x).empresa);
                                        System.out.println("Duracion del proyecto: " + lista2.get(x).duracion);
                                        System.out.println("Descripcion del proyecto: " + lista2.get(x).duracion);
                                        System.out.println("Estado: " + lista2.get(x).estado);
                                    }

                                }

                            }
                        }

                        break;
                    }// fin de case 2
                    case 3: {
                        int opcion2 = 0;
                        while (opcion2 != 5) {
                            System.out.printf("%s\n", " 1. Asignar proyecto a desarrolladores ");
                            System.out.printf("%s\n", " 2. Asignar proyectos Consultores");
                            System.out.printf("%s\n", " 3. Asignar proyecto Directores ");
                            System.out.printf("%s\n", " 4. Eliminar Desarrollador ");
                            System.out.printf("%s\n", " 5. Salir ");
                            opcion2 = lea.nextInt();
                            switch (opcion2) {
                                case 1: {
                                    boolean existente = false;
                                    String buscar;
                                    System.out.println("Ingrese el nombre del desarrolador");
                                    buscar = lea.next();
                                    String descri = "";
                                    String nombre = "";
                                    String empresa = "";
                                    int duracion = 0;
                                    String estado = "";
                                    for (int i = 0; i < lista.size(); i++) {
                                        if (lista.get(i).nombre.equals(buscar)) {
                                            try {
                                                System.out.println("Ingrese nombre del proyecto");
                                                nombre = lea.next();
                                            } catch (ArithmeticException e) {
                                                System.out.println("error");
                                            }
                                            try {
                                                System.out.println("Ingrese nombre de la empresa");
                                                empresa = lea.next();
                                            } catch (ArithmeticException e) {
                                                System.out.println("error");
                                            }
                                            try {
                                                System.out.println("Ingrese descripcion del proyecto ");
                                                descri = lea.next();
                                            } catch (InputMismatchException e) {
                                                System.out.println("Error solo lertras se puede ingresar ");

                                            }
                                            try {
                                                System.out.println("Cantidad de anos de duracion");
                                                duracion = lea.nextInt();
                                            } catch (ArithmeticException e) {
                                                System.out.println("error");
                                            }
                                            try {
                                                System.out.println("Estado actual");
                                                estado = lea.next();
                                            } catch (ArithmeticException e) {
                                                System.out.println("error");
                                            }
                                            lista.get(i).nombre = buscar;
                                            lista2.get(i).nombre = nombre;
                                            lista2.get(i).empresa = empresa;
                                            lista2.get(i).descri = descri;
                                            lista2.get(i).duracion = duracion;
                                            lista2.get(i).estado = estado;
                                            existente = true;
                                            System.out.println("Proyecto asignado con exito");
                                        }
                                    }
                                    if (existente == false) {
                                        System.out.println("La Franquisia no existe");
                                    }

                                }
                                case 2: {
                                    boolean existente = false;
                                    String buscar;
                                    System.out.println("Ingrese el nombre del Consultor");
                                    buscar = lea.next();
                                    String descri = "";
                                    String nombre = "";
                                    String empresa = "";
                                    int duracion = 0;
                                    String estado = "";
                                    for (int i = 0; i < lista.size(); i++) {
                                        if (lista.get(i).nombre3.equals(buscar)) {
                                            try {
                                                System.out.println("Ingrese nombre del proyecto");
                                                nombre = lea.next();
                                            } catch (ArithmeticException e) {
                                                System.out.println("error");
                                            }
                                            try {
                                                System.out.println("Ingrese nombre de la empresa");
                                                empresa = lea.next();
                                            } catch (ArithmeticException e) {
                                                System.out.println("error");
                                            }
                                            try {
                                                System.out.println("Ingrese descripcion del proyecto ");
                                                descri = lea.next();
                                            } catch (InputMismatchException e) {
                                                System.out.println("Error solo lertras se puede ingresar ");

                                            }
                                            try {
                                                System.out.println("Cantidad de anos de duracion");
                                                duracion = lea.nextInt();
                                            } catch (ArithmeticException e) {
                                                System.out.println("error");
                                            }
                                            try {
                                                System.out.println("Estado actual");
                                                estado = lea.next();
                                            } catch (ArithmeticException e) {
                                                System.out.println("error");
                                            }
                                            lista.get(i).nombre = buscar;
                                            lista2.get(i).nombre = nombre;
                                            lista2.get(i).empresa = empresa;
                                            lista2.get(i).descri = descri;
                                            lista2.get(i).duracion = duracion;
                                            lista2.get(i).estado = estado;
                                            existente = true;
                                            System.out.println("Proyecto asignado con exito");
                                        }
                                    }
                                    if (existente == false) {
                                        System.out.println("El proyecto no existe");
                                    }

                                    break;
                                }
                                case 3: {
                                    boolean existente = false;
                                    String buscar;
                                    System.out.println("Ingrese el nombre del Directos");
                                    buscar = lea.next();
                                    String descri = "";
                                    String nombre = "";
                                    String empresa = "";
                                    int duracion = 0;
                                    String estado = "";
                                    for (int i = 0; i < lista.size(); i++) {
                                        if (lista.get(i).nombre2.equals(buscar)) {
                                            try {
                                                System.out.println("Ingrese nombre del proyecto");
                                                nombre = lea.next();
                                            } catch (ArithmeticException e) {
                                                System.out.println("error");
                                            }
                                            try {
                                                System.out.println("Ingrese nombre de la empresa");
                                                empresa = lea.next();
                                            } catch (ArithmeticException e) {
                                                System.out.println("error");
                                            }
                                            try {
                                                System.out.println("Ingrese descripcion del proyecto ");
                                                descri = lea.next();
                                            } catch (InputMismatchException e) {
                                                System.out.println("Error solo lertras se puede ingresar ");

                                            }
                                            try {
                                                System.out.println("Cantidad de anos de duracion");
                                                duracion = lea.nextInt();
                                            } catch (ArithmeticException e) {
                                                System.out.println("error");
                                            }
                                            try {
                                                System.out.println("Estado actual");
                                                estado = lea.next();
                                            } catch (ArithmeticException e) {
                                                System.out.println("error");
                                            }
                                            lista.get(i).nombre = buscar;
                                            lista2.get(i).nombre = nombre;
                                            lista2.get(i).empresa = empresa;
                                            lista2.get(i).descri = descri;
                                            lista2.get(i).duracion = duracion;
                                            lista2.get(i).estado = estado;
                                            existente = true;
                                            System.out.println("Proyecto asignado con exito");
                                        }
                                    }
                                    if (existente == false) {
                                        System.out.println("El proyecto no existe");
                                    }

                                    break;
                                }
                                case 4: {

                                    break;
                                }

                            }
                        }

                        break;
                    }

                }// fin del switch
            }// fin del while 

        } catch (ArithmeticException e) {
            System.out.println("Lo siento ha habido un error en el programa");
        }
        System.out.println("Tene un lindo dia y no me bajes muchos puntos bye");
    }// fin del main 

}// fin de la clase 
