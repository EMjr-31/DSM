public class Ecuaciones {
    public static void main(String[] args){
        float x1=2, y1=4,c1=-2;
        float x2=-3,y2=5,c2=10;
        float x = (c1*y2-c2*y1)/(x1*y2-x2*y1);
        float y = (c2*x1-c1*x2)/(x1*y2-x2*y1);
        System.out.println("x =" + x);
        System.out.println("y =" + y);
    }
}
