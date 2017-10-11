 
package ooadsheet1;

 
public class complex {
    private double real;
    private double imag;

     complex(double real , double imag){
        this.real= real ;
        this.imag= imag;
    }
    public double getReal(  )
    {
        return real;
    }
    public double getImag(  )
    {
        return imag;
    }

    public void setReal(double Real)
    {
        this.real = real;
    }
     
    public void setImaginary(double Imaginary)
    {
        this.imag = imag;
    }
    public void print()
    {
        System.out.println(real+"+"+imag+"i");
    }
    public complex add(complex c) 
    {
        return new complex(c.getReal() + this.real, this.imag + c.getImag());
    }
    public complex sub (complex c) 
    {
        return new complex(c.getReal() - this.real, this.imag - c.getImag());
    }
    public complex multiply (complex c)
    {
        return new complex(c.getReal() * this.real - this.imag * c.getImag(), this.imag * c.getReal() + c.getImag() * this.real);
    }
    public double magnitude ()
    {
        return Math.sqrt(Math.pow(real, 2) + Math.pow(imag, 2));
    }
    public double angle ()
    {
        return Math.atan2(imag, real);
    }
}

