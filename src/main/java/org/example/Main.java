package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        String correo;
        String correoBD="carlos01@gmail.com";
        String usuario;
        String usuarioBD="Carlos";
        String contracena;
        String contrecenaBD="Urango3";
        Scanner leer=new Scanner(System.in);
        int opcion;
        int intentosMaximos=3;
        int intentos=0;
        int costoPlato;
        int opcionOrden=100;
        int cantidadPlatos = 0;

        System.out.println("**Bienvenido**");

        while (intentos<intentosMaximos){
            System.out.print("Digite su correo: ");
            correo=leer.nextLine();
            System.out.print("Digite su usuario: ");
            usuario=leer.nextLine();
            System.out.print("Digite su contraceña: ");
            contracena=leer.nextLine();

            if (correo.equals(correoBD)&&usuario.equals(usuarioBD)&&contracena.equals(contrecenaBD)){
                System.out.println("Iniciando secion");
                System.out.println("Bienvenido");
                break;
            }else {
                System.out.println("Compruebe sus datos y intentalo e nuevo");
                intentos++;

            }
        }
        if (intentos==intentosMaximos){
            System.out.println("Ha agotado sus intentos");
        }

        do {
            System.out.println("1.Ingresar orden");
            System.out.println("2.Modificar orden");
            System.out.println("3.Terminar orden y calcular total");
            System.out.println("4.Salir");
            System.out.print("Selecciona una opcion: ");
            opcion=leer.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("1.Entrada de cangrejo de urrao $28000");
                    System.out.println(("2.Escalopes a la rigo $35000"));
                    System.out.println("3.Filete tour de Francia $150000");
                    System.out.println("4.Corvina de rigo $80000");
                    System.out.println("5.Coctel michelle $20000");
                    System.out.println("6.Jugos de urrao $18500");
                    System.out.print("Selecciona una opcion: ");
                    opcionOrden=leer.nextInt();
                    System.out.print("Cuantos desea: ");
                    cantidadPlatos=leer.nextInt();

                    if (opcionOrden==1){
                        System.out.println("Has seleccionado");
                        System.out.println("Entrada de cangrejo de urrao");
                    }else if (opcionOrden==2){
                        System.out.println("Has seleccionado");
                        System.out.println("Escalopes a la rigo");
                    }else if (opcionOrden==3){
                        System.out.println("Has seleccionado");
                        System.out.println("Filete tour de Francia");
                    }else if (opcionOrden==4){
                        System.out.println("Has seleccionado");
                        System.out.println("Corvina de rigo");
                    }else if (opcionOrden==5){
                        System.out.println("Has seleccionado");
                        System.out.println("Coctel michelle");
                    }else if (opcionOrden==6){
                        System.out.println("Has seleccionado");
                        System.out.println("Jugos de urrao");
                    }
                    break;
                case 2:
                    System.out.println("1.Entrada de cangrejo de urrao $28000");
                    System.out.println(("2.Escalopes a la rigo $35000"));
                    System.out.println("3.Filete tour de Francia $150000");
                    System.out.println("4.Corvina de rigo $80000");
                    System.out.println("5.Coctel michelle $20000");
                    System.out.println("6.Jugos de urrao $18500");
                    System.out.print("Selecciona una opcion: ");
                    opcionOrden=leer.nextInt();
                    System.out.print("Cuantos desea: ");
                    cantidadPlatos=leer.nextInt();
                    break;
                case 3:
                    if (opcionOrden==1){
                        costoPlato=28000*cantidadPlatos;
                        System.out.println("costo $"+costoPlato);
                    } else if (opcionOrden==2) {
                        costoPlato=35000*cantidadPlatos;
                        System.out.println("costo $"+costoPlato);
                    } else if (opcionOrden==3) {
                        costoPlato=150000*cantidadPlatos;
                        System.out.println("costo $"+costoPlato);
                    } else if (opcionOrden==4) {
                        costoPlato=80000*cantidadPlatos;
                        System.out.println("costo $"+costoPlato);
                    } else if (opcionOrden==5) {
                        costoPlato=20000;
                        System.out.println("costo $"+costoPlato);
                    } else if (opcionOrden==6) {
                        costoPlato=18500*cantidadPlatos;
                        System.out.println("costo $"+costoPlato);
                    }
                    break;
                case 4:
                    System.out.println("Orden terminada");
                    break;
                default:
                    System.out.println("Opcion ivalida");
                    break;
            }

        }while (opcion!=4);












    }
}