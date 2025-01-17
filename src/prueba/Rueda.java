package prueba;

//OBJETO RUEDA
public class Rueda implements Disco{

    //BLOQUE DE DEFINICION DE VARIABLES DE OBJETO
    protected String tipo;

    //CONSTRUCTOR PARA DEFINIR EL TIPO
    public Rueda(String tipo) {
        this.tipo = tipo;
    }

    //GETTER PARA TIPO
    public String getTipo() {
        return tipo;
    }

    //SETTER PARA TIPO
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //METODO IMPLEMENTADO DE DISCO PARA GIRAR LA RUEDA
    @Override
    public void girarDisco() {
        System.out.println(" ");
        System.out.println("Girando la rueda...");
        System.out.println("Se mueve el "+ this.getTipo() +"...");
    }
}
