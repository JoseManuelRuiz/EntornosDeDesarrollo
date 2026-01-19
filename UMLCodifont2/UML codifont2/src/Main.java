//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    Punto p1 = new Punto(1,2,2);
    Punto p2 = new Punto(1,2,3);
    Punto p3 = new Punto(1,3,2);

    Punto[] puntosLinea = new Punto[2];
    Punto[] puntosArea = new Punto[3];

    puntosLinea[0] = p1;
    puntosLinea[1] = p2;
    puntosArea[0] = p1;
    puntosArea[1] = p2;
    puntosArea[2] = p3;



    Linea l = new Linea(1,p1,p2);

    Area a = new Area(1,p1,p2,p3);

    Linea l2 = new Linea(2,puntosLinea);
    Area a2 = new Area(2,puntosArea);


}
