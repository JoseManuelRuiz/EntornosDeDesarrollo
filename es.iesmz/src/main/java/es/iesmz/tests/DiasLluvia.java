package es.iesmz.tests;

public class DiasLluvia {

    private boolean[] dias;

    public DiasLluvia() {
        dias = new boolean[365];
    }


    public boolean registroDia(int dia, int mes, boolean lluvia){
        int pos = convertirDia(dia, mes);
        if (pos == -1) return false;

        dias[pos] = lluvia;
        return true;
    }


    public boolean consultarDia(int dia, int mes){
        int pos = convertirDia(dia, mes);
        if (pos == -1) return false;

        return dias[pos];
    }

    public int contarDiasLluviosos(){
        int contador = 0;
        for (int i=0; i<dias.length; i++) {
            if (dias[i])
                contador++;
        }
        return contador;
    }

    public int trimestreLluvioso(){
        int[] trimestre = new int[4];

        for (int i = 0; i < 365; i++) {
            if (dias[i]) {
                if (i < 90) // de Enero a Marzo
                    trimestre[0]++;
                else if (i < 181) // de Abril a Junio
                    trimestre[1]++;
                else if (i < 273) // de Julio a Septiembre
                    trimestre[2]++;
                else
                    trimestre[3]++; // de Octubre a Diciembre
            }
        }

        int max = trimestre[0];
        int pos = 1;

        for (int i = 1; i < 4; i++) {
            if (trimestre[i] > max) {
                max = trimestre[i];
                pos = i + 1;
            }
        }

        return pos;
    }

    public int primerDiaLluvia(){
        for (int i = 0; i < 365; i++) {
            if (dias[i]) {
                return i + 1;
            }
        }
        return -1;
    }

    // Convierte día y mes a posición del array
    private int convertirDia(int dia, int mes) {
        int[] diasMes = {31,28,31,30,31,30,31,31,30,31,30,31};

        if (mes < 1 || mes > 12) return -1;
        if (dia < 1 || dia > diasMes[mes - 1]) return -1;

        int posicion = 0;
        for (int i = 0; i < mes - 1; i++) {
            posicion += diasMes[i];
        }
        posicion += (dia - 1);

        return posicion;
    }
}
