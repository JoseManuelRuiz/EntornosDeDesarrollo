public class Linea {

    private int id;
    private Punto p1;
    private Punto p2;

    public Linea (int id, Punto p1, Punto p2){
        this.id = id;
        this.p1 = p1;
        this.p2 = p2;
    }

    public Linea(int id , Punto puntos[]){
        this.id = id;

        if(puntos.length == 2) {
            this.p1 = puntos[0];
            this.p2 = puntos[1];
        }
        else{
            System.out.println("ERROR");
        }
    }
}
