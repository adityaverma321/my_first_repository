class CartesianPoint{
    int x, y;
    int getX(){
        return x;
    }
    int getY(){
        return y;
    }
    void move(int x, int y){
        this.x = x;
        this.y = y;
    }
    void display(){
        System.out.println("X is " + x + " Y is " + y);
    }
    void move(int temp){
        x = temp;
        y = temp;
    }
    public CartesianPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public CartesianPoint(int x) {
        this.x = x;
        this.y = x;
        System.out.println("The value of y set to  be same as the value of x");
    }
}

public class CartesianMain {
    
}
