 
package ooadsheet1;

 
public class Square extends Rectangle {
    
    public Square(double length){
      super(length, length);
    }
    @Override
   public void setWidth(double width) {
       super.setWidth(width);
       super.setLength(width);
        
    }
    @Override
   public void setLength(double length) {
       super.setWidth(length);
       super.setLength(length);
        
    }
    
    
}
