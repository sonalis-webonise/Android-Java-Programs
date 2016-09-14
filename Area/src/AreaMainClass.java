/**
 * Created by webonise on 14/9/16.
 */
public class AreaMainClass {

    public static void main(String[] args){
        Triangle tri=new Triangle(50,6);
        double area=tri.calculateArea();
        System.out.print("Area : " + area);
    }
}
