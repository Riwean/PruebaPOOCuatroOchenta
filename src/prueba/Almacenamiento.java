package prueba;

import java.util.Scanner;

//Clase madre que define los campos de los objetos
public abstract class Almacenamiento implements Disco {

    //BLOQUE DE DEFINICION DE VARIABLES
    protected String nombre, contenido, tipoDeDisco;
    protected final int capacidad;
    protected int velocidad;

    //CONSTRUCTOR CON TODOS LOS CAMPOS
    public Almacenamiento(String nombre, String contenido, String tipoDeDisco, int capacidad, int velocidad) {
        this.nombre = nombre;
        this.contenido = contenido;
        this.tipoDeDisco = tipoDeDisco;
        this.capacidad = capacidad;
        this.velocidad = velocidad;
    }

    //CONSTRUCTOR CON 3 CAMPOS PARA LP
    public Almacenamiento(String nombre, int capacidad, int velocidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.velocidad = velocidad;
    }

    //GETTER PARA NOMBRE
    public String getNombre() {
        return nombre;
    }

    //SETTER PARA NOMBRE
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //GETTER PARA CONTENIDO
    public String getContenido() {
        return contenido;
    }

    //SETTER PARA CONTENIDO
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    //GETTER PARA TIPO DE DISCO
    public String getTipoDeDisco() {
        return tipoDeDisco;
    }

    //SETTER PARA TIPO DE DISCO
    public void setTipoDeDisco(String tipoDeDisco) {
        this.tipoDeDisco = tipoDeDisco;
    }

    //GETTER PARA CAPACIDAD
    public int getCapacidad() {
        return capacidad;
    }

    //GETTER PARA VELOCIDAD
    public int getVelocidad() {
        return velocidad;
    }

    //SETTER PARA VELOCIDAD
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    //METODO IMPLEMENTADO DE DISCO
    @Override
    public void girarDisco() {
        System.out.print("girando...");
        System.out.println("(a " + this.getVelocidad() + " rpm.)");
    }

    //METODO PARA INTRODUCIR LOS DISCOS
    public void inicializar()  {
        System.out.println(" ");
        System.out.println("Introduciendo el disco...");
    }

    //METODO ABSTRACTO PARA LEER LA INFORMACION ALMACENADA EN LOS DISCOS
    abstract void leer();

    //METODO PARA FORMATEAR LA INFORMACION DE LOS DISCOS
    public void borrar()  {
        this.setContenido(" ");
        System.out.println("Formateando el disco...\n");

    }

    //METODO PARA ALMACENAR NUEVA INFORMACION EN EL DISCO
    public void almacenar() {
        Scanner sc = new Scanner(System.in);
        String cont;

        System.out.println("Escribe el contenido nuevo que deseas añadir:");
        cont = sc.nextLine();
        this.setContenido(cont);
    }

    //METODO PARA RETIRAR LOS DISCOS
    public void finalizar()  {
        System.out.println(" ");
        System.out.println("Sacando el disco...");
    }
}