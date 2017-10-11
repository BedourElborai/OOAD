package ooadsheet1;


public class Triangle implements Shape  {
    
    private Point p1;
    private Point p2;
    private Point p3;

    public Triangle(Point p1 , Point p2, Point p3) {
        this.p1= p1;
        this.p2= p2;
        this.p3= p3;
    }
    
    @Override
    public double calculateArea(){
        double x = p1.getLength(p2);
        double y = p2.getLength(p3);
        double z = p1.getLength(p3);
        double S=  (x+y+z)/2;
        double area = Math.sqrt(S*(S-x)*(S-y)*(S-z));
        return area ;
    }
    
    @Override
     public double calculatePerimeter(){
         return  p1.getLength(p2)+p2.getLength(p3)+ p1.getLength(p3);

    
}
     

}
