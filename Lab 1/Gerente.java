class Gerente extends Empleado{
    public Gerente(String n, double s, int anio,int mes, int dia){
        super(n,s,anio,mes,dia);
        bono=0;
    }
    public double obtenerSalario(){
        double salarioBase=super.obtenerSalario();
        return salarioBase+bono;
    }
    public void obtenerBono(double b){
        bono=b;
    }
    private double bono;
}
