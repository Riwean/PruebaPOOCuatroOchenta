package prueba;

//OBJETO CD
public class CD extends Almacenamiento {

    //CONSTRUCTOR DEL OBJETO QUE HEREDA LOS CAMPOS DE ALMACENAMIENTO
    public CD(String nombre, String contenido, String tipoDeDisco, int capacidad, int velocidad) {
        super(nombre, contenido, tipoDeDisco, capacidad, velocidad);
    }

    //METODO HEREDADO DE ALMACENAMIENTO PARA GIRAR EL CD
    @Override
    public void girarDisco() {
        System.out.println(" ");
        System.out.print("CD ");
        super.girarDisco();
    }

    //METODO HEREDADO DE ALMACENAMIENTO PARA ALMACENAR NUEVA INFORMACION EN EL CD
    @Override
    public void almacenar() {
        super.almacenar();
        System.out.println("(Escribiendo la información mediante un láser...)");
    }

    //METODO ABSTRACTO HEREDADO DE ALMACENAMIENTO PARA LEER LA INFORMACION ALMACENADA EN EL CD
    @Override
    public void leer() {
        System.out.println(" ");
        System.out.println("(Leyendo la información mediante el uso de un láser...)");
        System.out.println("El nombre del CD introducido es: " + this.getNombre() + ".");
        System.out.println("El contenido del CD introducido es: " + this.getContenido() + ".");
        System.out.println("El tipo del CD introducido es: " + this.getTipoDeDisco() + ".");
        System.out.println("La capacidad del CD introducido es: " + this.getCapacidad() + " MB.");
    }
}
