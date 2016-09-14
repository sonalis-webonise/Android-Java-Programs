/**
 * Created by webonise on 14/9/16.
 */
public class Triangle extends Rectangle {

    public Triangle(int wid,int high){
        super(wid,high);
    }
    public double calculateArea(){
        return (height*width)/2;
    }
}
