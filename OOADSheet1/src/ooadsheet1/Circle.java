 
package ooadsheet1;

 
public class Circle implements Shape 
{
    private final double radius;
    
    public Circle( int radius)
    {
       this.radius = radius;
    }
    
    @Override
    public double calculateArea()
    {
        return Math.PI*radius*radius;
    }
    
    @Override
    public double calculatePerimeter()
    {
        return 2*Math.PI*radius;
    }
  
}
 