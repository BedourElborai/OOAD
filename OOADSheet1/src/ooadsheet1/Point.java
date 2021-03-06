 
package ooadsheet1;

public class Point {
    private int x;
    private int y ;
 
    public Point (int x , int y )
    {
        this.x=x;
        this.y= y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public double getLength (Point P)
    {
        return Math.sqrt(Math.pow(this.x- P.getX(),2)+ Math.pow(this.y- P.getY(),2));
    }
}
