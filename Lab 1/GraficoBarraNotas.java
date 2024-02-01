public class GraficoBarraNotas {
    public static void main(String[] args){
        int array[]={0,0,0,0,0,0,3,12,6,2,1};
        System.out.println("Distribucion de Notas");
        for(int contador =0;contador<array.length;contador++){
            if(contador==10){
                System.out.printf("%5d:", 100);
            }else{
                System.out.printf("%02d-%02d",contador*10,contador*10+9);
            }
            for(int astericos=0; astericos<array[contador];astericos++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
