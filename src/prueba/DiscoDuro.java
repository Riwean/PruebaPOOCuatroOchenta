package prueba;

//OBJETO DISCO DURO
public class DiscoDuro extends Almacenamiento {

    //CONSTRUCTOR DEL OBJETO QUE HEREDA LOS CAMPOS DE ALMACENAMIENTO
    public DiscoDuro(String nombre, String contenido, String tipoDeDisco, int capacidad, int velocidad) {
        super(nombre, contenido, tipoDeDisco, capacidad, velocidad);
    }

    //METODO HEREDADO DE ALMACENAMIENTO PARA GIRAR EL DISCO DURO
    @Override
    public void girarDisco() {
        System.out.print("Disco ");
        super.girarDisco();
    }

    //METODO HEREDADO DE ALMACENAMIENTO PARA ALMACENAR NUEVA INFORMACION EN EL DISCO DURO
    @Override
    public void almacenar() {
        super.almacenar();
        System.out.println("(Escribiendo la información mediante un cabezal magnético...)");
    }

    //METODO ABSTRACTO HEREDADO DE ALMACENAMIENTO PARA LEER LA INFORMACION ALMACENADA EN EL DISCO DURO
    @Override
    public void leer() {
        System.out.println(" ");
        System.out.println("(Leyendo la información mediante el uso de un cabezal magnético...)");
        System.out.println("El nombre del Disco Duro es: " + this.getNombre() + ".");
        System.out.println("El contenido del Disco Duro introducido es: " + this.getContenido() + ".");
        System.out.println("El tipo del Disco Duro introducido es: " + this.getTipoDeDisco() + ".");
        System.out.println("La capacidad del Disco Duro introducido es: " + (this.getCapacidad() / 1024) + " GB.");
    }

    //METODO PARA INICIALIZAR EL DISCO DURO
    @Override
    public void inicializar()  {
        System.out.println(" ");
        System.out.println("Encendiendo el disco duro...");
    }

    //METODO PARA APAGAR EL DISCO DURO
    @Override
    public void finalizar()  {
        System.out.println(" ");
        System.out.println("Apagando el disco duro...");
    }
}
