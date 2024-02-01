public class EstructuraRepetitiva1 {
    public static void main(String[] args){
        long factorial=1;
        int i=1;
        int n=5;
        do{
            factorial=factorial*i;
            i++;
        }while(i<n+1);
        System.out.println("factorial de "+n+" es "+ factorial);
    }
}
