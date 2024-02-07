import java.util.*;
class Empleado {
    public Empleado(String n, double s, int anio,int mes, int dia){
        nombre=n;
        salario=s;
        GregorianCalendar calendario = new GregorianCalendar(anio,mes-1,dia);
        fechaContratacion=calendario.getTime();

    }
    public String obtenerNombre(){
        return nombre;
    }
    public Double obtenerSalario(){
        return salario;
    }
    public Date obteneFechaContratacion(){
        return fechaContratacion;
    }
    private String nombre;
    private  Double salario;
    private Date fechaContratacion;
}
