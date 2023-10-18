package clases;

public class Perro {
    private int edad;
    private float  altura, peso;
    private String nombre, raza, color;

    //constructor

    //metodos
    public void comer(String tipoComida, double cantidadGramos){
        System.out.println(nombre + " ha ingerido " + cantidadGramos + " gramos de " + tipoComida + ".");
    }
    public String ladrar(){
        return "guau guau";
    }
    public void informacion(){
        System.out.println("-------------");
        System.out.println("nombre: " + nombre + "\n");
        System.out.println("raza: " + raza);
        System.out.println("color: " + color);
        System.out.println("edad: " + edad);
        System.out.println("altura: " + altura + "cm");
        System.out.println("peso: " + peso + "kg");
        System.out.println("------------- \n");
    }
    //getter
    public int getEdad() {
        return edad;
    }

    public float getAltura() {
        return altura;
    }

    public float getPeso() {
        return peso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public String getColor() {
        return color;
    }

    //setter

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
