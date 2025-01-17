package prueba;

//OBJETO LP
public class LP extends Almacenamiento {

    //BLOQUE DE DEFINICION DE VARIABLES DE OBJETO
    protected byte caras;

    //CONSTRUCTOR DEL OBJETO QUE HEREDA LOS CAMPOS DE ALMACENAMIENTO
    public LP(String nombre, int capacidad, int velocidad, byte caras) {
        super(nombre, capacidad, velocidad);
        this.caras = caras;
    }

    //METODO HEREDADO DE ALMACENAMIENTO PARA GIRAR EL LP
    @Override
    public void girarDisco() {
        System.out.println(" ");
        System.out.print("LP ");
        super.girarDisco();
    }

    //GETTER PARA CARAS
    public byte getCaras() {
        return caras;
    }

    //SETTER PARA CARAS
    public void setCaras(byte caras) {
        this.caras = caras;
    }

    //METODO PARA ESCUCHAR LA CANCION DEL LP
    @Override
    public void leer() {
        if (this.getCaras() == 2) {
            System.out.println("Reproduciendo la canción Kashmir - Led Zeppelin...");
            System.out.println("Finaliza la canción, cambiando la cara...");
            System.out.println("Reproduciendo la canción Black Smoke Rising - Greta Van Fleet...");
        } else {
            System.out.println("Reproduciendo la canción Kashmir - Led Zeppelin...");
        }
    }
}
