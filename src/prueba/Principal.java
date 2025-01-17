package prueba;

public class Principal {

    //BLOQUE DE DEFINICION DE VARIABLES ESTATICAS
    static final int CAPACIDAD_CD=700, CAPACIDAD_BR=25600, VELOCIDAD_CD=500, VELOCIDAD_BLUERAY=200, VELOCIDAD_HDD=5400,
                        CAPACIDAD_LP=5, VELOCIDAD_LP=45;

    //MAIN
    public static void main(String[] args) {

        CD CD1 = new CD("Album", "Musica", "CD-RW", CAPACIDAD_CD, VELOCIDAD_CD);
        DiscoDuro DD1 = new DiscoDuro("C:", "Sistema Operativo", "HDD", 512000, VELOCIDAD_HDD);
        BlueRay BR1 = new BlueRay("Interestelar", "pelicula", "BlueRay", CAPACIDAD_BR, VELOCIDAD_BLUERAY);
        LP LP1 = new LP ("Kashmir - Led Zeppelin", CAPACIDAD_LP, VELOCIDAD_LP, (byte) 2);
        Frisbee FB1 = new Frisbee((((Math.random() * 100) + 1)));
        Rueda RD1= new Rueda("monociclo");

        //Metodos para CD
        CD1.girarDisco();
        CD1.leer();
        CD1.borrar();
        CD1.almacenar();
        CD1.leer();

        //Metodos para Disco Duro
        DD1.girarDisco();
        DD1.leer();
        DD1.borrar();
        DD1.almacenar();
        DD1.leer();

        //Metodos para BlueRay
        BR1.girarDisco();
        BR1.leer();
        BR1.borrar();
        BR1.almacenar();
        BR1.leer();

        //Metodos para Disco de Vinilo (LP)
        LP1.girarDisco();
        LP1.leer();

        //Metodos para Frisbee
        FB1.girarDisco();

        //Metodos para Rueda
        RD1.girarDisco();

    }
}
