interface IFig{
    public void calcAreaQ();
    public void calcVolumnO();
    final double pi = 3.1428;
}
abstract class Figure{
    double r, a, v;
    public abstract void displayAreaQ();
    public abstract void displayVolumnO();
}
class Cone extends Figure implements IFig{
    Cone(double r, double a){
        this.r = r;
        this.a = a;
    }
    public void calcAreaQ(){
        this.a = pi * r * r * (1 + (a / 2));
    }
    public void calcVolumnO(){
        this.v = pi * r * r * a / 3;
    }
    public void displayAreaQ(){
        System.out.println("Area of Cone: " + a);
    }
    public void displayVolumnO(){
        System.out.println("Volumn of Cone: " + v);
    }    
}
class Sphere extends Figure implements IFig{
    Sphere(double r){
        this.r = r;
    }
    public void calcAreaQ(){
        this.a = 4 * pi * r * r;
    }
    public void calcVolumnO(){
        this.v = 4 * pi * r * r * r / 3;
    }
    public void displayAreaQ(){
        System.out.println("Area of Sphere: " + a);
    }
    public void displayVolumnO(){
        System.out.println("Volumn of Sphere: " + v);
    }
}
class Cylinder extends Figure implements IFig{
    Cylinder(double r, double h){
        this.r = r;
        this.a = 2 * pi * r * h;
    }
    public void calcAreaQ(){
        this.a = 2 * pi * r * r;
    }
    public void calcVolumnO(){
        this.v = pi * r * r * a;
    }
    public void displayAreaQ(){
        System.out.println("Area of Cylinder: " + a);
    }
    public void displayVolumnO(){
        System.out.println("Volumn of Cylinder: " + v);
    }
}
public class Shape{
    public static void main(String args[]){
        Cone coneObj = new Cone(5,10);
        coneObj.calcAreaQ();
        coneObj.calcVolumnO();
        coneObj.displayAreaQ();
        coneObj.displayVolumnO();

        Sphere sphereObj = new Sphere(5);
        sphereObj.calcAreaQ();
        sphereObj.calcVolumnO();
        sphereObj.displayAreaQ();
        sphereObj.displayVolumnO();

        Cylinder cylinderObj = new Cylinder(5,15);
        cylinderObj.calcAreaQ();
        cylinderObj.calcVolumnO();
        cylinderObj.displayAreaQ();
        cylinderObj.displayVolumnO();
    }
}