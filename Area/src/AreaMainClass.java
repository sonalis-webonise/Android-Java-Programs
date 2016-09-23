/**
 * Created by webonise on 14/9/16.
 */
public class AreaMainClass {

    public static void main(String[] args){
        Triangle triangle=new Triangle();
        Rectangle rectangle=new Rectangle();
        double area=triangle.calculateArea(3.5,5);
        System.out.print("Triangle Area : " + area);
        area=rectangle.calculateArea(4.5,5);
        System.out.print("\nRectangle Area : " + area);
    }
}
