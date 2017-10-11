 
package ooadsheet1;

 
public class SecondOrderEquation {
   
    private double a;
    private double b;
    private double c;
    
    public SecondOrderEquation(double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public complex[] Solve()
    {
        double d = b*b-4*a*c;
        complex [] c = new complex [2] ;
        if (d==0){
            
            c[0]= new complex(-b/2*a,0);
            c[1]= new complex(-b/2*a,0);
           return c;
        }
        else if (d>0){
            c[0]= new complex((-b+Math.sqrt(d))/2*a,0);
            c[1]= new complex((-b-Math.sqrt(d))/2*a,0);
            return c;
        }
        else 
        {
            c[0]= new complex(-b/2*a,Math.sqrt(-d)/2*a);
            c[1]= new complex(-b/2*a,-Math.sqrt(-d)/2*a);
            return c;
        }
        
    }
    public void Differentiate()
    {
        System.out.println(a*2+"X"+b);
    }
    
    public double Evaluate(double x)
    {
        double result = (a*Math.pow(x,2))+(b*x)+c;
        return result;
    }

}
