package prueba;

//OBJETO FRISBEE
public class Frisbee implements Disco{

    //BLOQUE DE DEFINICION DE VARIABLES DE OBJETO
    protected double metros;

    //CONSTRUCTOR PARA DEFINIR LOS METROS A LOS QUE LLEGA EL FRISBEE VOLANDO
    public Frisbee(double metros) {
        this.metros = metros;
    }

    //GETTER PARA METROS
    public double getMetros() {
        return metros;
    }

    //SETTER PARA METROS
    public void setMetros(double metros) {
        this.metros = metros;
    }

    //METODO IMPLEMENTADO DE DISCO PARA GIRAR EL FRISBEE
    @Override
    public void girarDisco() {
        System.out.println(" ");
        System.out.println("Lanzas el freesbie...");
        System.out.println("Girando en el aire...");
        System.out.println("Alcanza una distancia de " + this.getMetros() + " metros.");
    }
}
