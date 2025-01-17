package prueba;

//OBJETO BLUERAY
public class BlueRay extends Almacenamiento {

    //CONSTRUCTOR DEL OBJETO QUE HEREDA LOS CAMPOS DE ALMACENAMIENTO
    public BlueRay(String nombre, String contenido, String tipoDeDisco, int capacidad, int velocidad) {
        super(nombre, contenido, tipoDeDisco, capacidad, velocidad);
    }

    //METODO HEREDADO DE ALMACENAMIENTO PARA GIRAR EL BLUERAY
    @Override
    public void girarDisco() {
        System.out.print("BlueRay ");
        super.girarDisco();
    }

    //METODO HEREDADO DE ALMACENAMIENTO PARA ALMACENAR NUEVA INFORMACION EN EL BLUERAY
    @Override
    public void almacenar() {
        super.almacenar();
        System.out.println("(Escribiendo la información mediante un láser azul...)");
    }

    //METODO ABSTRACTO HEREDADO DE ALMACENAMIENTO PARA LEER LA INFORMACION ALMACENADA EN EL BLUERAY
    @Override
    public void leer() {
        System.out.println(" ");
        System.out.println("(Leyendo la información mediante el uso de un láser azul...)");
        System.out.println("El nombre del BlueRay introducido es: " + this.getNombre() + ".");
        System.out.println("El contenido del BlueRay introducido es: " + this.getContenido() + ".");
        System.out.println("El tipo del BlueRay introducido es: " + this.getTipoDeDisco() + ".");
        System.out.println("La capacidad del BlueRay introducido es: " + (this.getCapacidad() / 1024) + " GB.");
    }
}
