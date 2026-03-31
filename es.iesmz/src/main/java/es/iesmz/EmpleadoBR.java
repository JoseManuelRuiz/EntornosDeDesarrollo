package es.iesmz;

public class EmpleadoBR {
    public enum TipoEmpleado {venedor, encarregat};


    public EmpleadoBR() {
    }

    public static float calculaSalarioBruto(TipoEmpleado tipo,
                                            float ventasMes,
                                            float horasExtra){
        float salarioBase = 0;
        float prima = 0;
        float extra = 0;
        float salarioBruto = 0;

        if(tipo == null) return -1;
        //Saldo según el tipo de empleado
        if(tipo == TipoEmpleado.venedor){
            salarioBase = 1000;
        } else if (tipo == TipoEmpleado.encarregat) {
            salarioBase = 1500;
        }else
        {
            return -1;
        }

        //Prima según las ventas del mes
        if(ventasMes >=1000 && ventasMes <1500){
            prima = 100;
        } else if (ventasMes >= 1500) {
            prima = 200;
        } else if (ventasMes < 0){
            return -1;
        }

        //Horas extra
        if(horasExtra >= 0){
            extra = 20 * horasExtra;
        }else{
            return -1;
        }

        salarioBruto = salarioBase + prima + extra;
        return salarioBruto;
    }

    public static float calculaSalarioNeto(float salarioBruto){

        float salarioNeto = 0;
        float retencion = 0;

        if(salarioBruto < 1000 && salarioBruto >= 0){
            salarioNeto = salarioBruto;
        } else if (salarioBruto >= 1000 && salarioBruto < 1500) {
            retencion = 16;
            salarioNeto = salarioBruto * (1-(retencion/100));
        } else if (salarioBruto >= 1500) {
            retencion = 18.0f;
            float porcentaje = 1-retencion;
            salarioNeto = salarioBruto * (1-(retencion/100.0f));
        } else{
            salarioNeto = -1;
        }

        return salarioNeto;
    }



}
