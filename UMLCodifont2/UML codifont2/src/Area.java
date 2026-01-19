import java.lang.reflect.Array;

public class Area {

    private int id;
    private Punto p1;
    private Punto p2;
    private Punto p3;

    public Area (int id, Punto p1, Punto p2, Punto p3){
        this.id = id;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Area (int id, Punto puntos[]){

        this.id = id;

        if(puntos.length == 3) {
            this.p1 = puntos[0];
            this.p2 = puntos[1];
            this.p3 = puntos[2];
        }
        else{
            System.out.println("ERROR");
        }
    }
}
