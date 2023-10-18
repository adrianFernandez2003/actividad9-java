import clases.Perro;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int edad;
        float  altura, peso;
        Scanner sc = new Scanner(System.in);
        String nombre, raza, color;
        Perro perro1 = new Perro();
        Perro perro2 = new Perro();

        try {
            System.out.print("ingrese el nombre: ");
            nombre = sc.nextLine();
            System.out.print("ingrese la raza: ");
            raza = sc.nextLine();
            System.out.print("ingrese el color: ");
            color = sc.nextLine();
            System.out.print("ingrese la edad: ");
            edad = sc.nextInt();
            System.out.print("ingrese la altura (cm): ");
            altura = sc.nextFloat();
            System.out.print("ingrese el peso (kg): ");
            peso = sc.nextFloat();
            sc.nextLine();

            perro1.setNombre(nombre);
            perro1.setRaza(raza);
            perro1.setColor(color);
            perro1.setEdad(edad);
            perro1.setAltura(altura);
            perro1.setPeso(peso);

            System.out.print("ingrese el nombre: ");
            nombre = sc.nextLine();
            System.out.print("ingrese la raza: ");
            raza = sc.nextLine();
            System.out.print("ingrese el color: ");
            color = sc.nextLine();
            System.out.print("ingrese la edad: ");
            edad = sc.nextInt();
            System.out.print("ingrese la altura (cm): ");
            altura = sc.nextFloat();
            System.out.print("ingrese el peso (kg): ");
            peso = sc.nextFloat();

            perro2.setNombre(nombre);
            perro2.setRaza(raza);
            perro2.setColor(color);
            perro2.setEdad(edad);
            perro2.setAltura(altura);
            perro2. setPeso(peso);

            perro1.informacion();
            perro2.informacion();
        }catch (InputMismatchException e) {
            System.out.println("respuesta introducida no valida.");
        }

    }
}