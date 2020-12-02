import java.util.*;
import java.io.*;
import java.lang.*;
class Complex{
    int real;
    int imaginary;

    public Complex(){
        real = 5;
        imaginary = 10;
    }

    public Complex(int r, int i){
        real = r;
        imaginary = i;
    }

    public Complex(Complex c1){
        real = c1.real+5;
        imaginary = c1.imaginary+10;
    }


    public Complex addition(Complex c, Complex b){
        Complex base = new Complex();
        base.real = c.real+b.real;
        base.imaginary = c.imaginary+b.imaginary;
        return base;
    }

    public Complex subtraction(Complex c, Complex b){
        Complex base = new Complex();
        base.real = Math.abs(c.real-b.real);
        base.imaginary = Math.abs(c.imaginary-b.imaginary);
        return base;
    }

    public Complex multiplication(Complex c, Complex b){
        Complex base = new Complex();              
        base.real = c.real*b.real-c.imaginary*b.imaginary;
        base.imaginary = c.real*b.imaginary+c.imaginary*b.real;
        return base;
    }
    public void printComplex(Complex c){
        System.out.println("Real part --> "+c.real+" imaginary part -- >"+c.imaginary);
    }

}

class ComplexNumOperation{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the real part");
        int r = Integer.parseInt(br.readLine());
        System.out.println("Enter the imaginary part");
        int i = Integer.parseInt(br.readLine());

        Complex c1 = new Complex(r,i);

        System.out.println("Enter real part again: ");
        int r1 = Integer.parseInt(br.readLine());
        System.out.println("Enter Imaginary part again: ");
        int i1 = Integer.parseInt(br.readLine());
        Complex c2 = new Complex(r1,i1);
        Complex ans1 = c1.addition(c1, c2);
        Complex mul = c1.multiplication(c1,c2);
        Complex sub = c1.subtraction(c1,c2);
        System.out.println("After addition: ");
        c1.printComplex(ans1);
        System.out.println("After multiplication");
        c1.printComplex(mul);
        System.out.println("After subtraction");
        c1.printComplex(sub);
          

        System.out.println("-----------------------------------");
        System.out.println("Default constructor");
        Complex c = new Complex();
        Complex b = new Complex();
        Complex ans = c.addition(c, b);
        Complex anss = c.subtraction(c, b);
        Complex ansm = c.multiplication(c, b);
        System.out.println("After addition");
        c.printComplex(ans);
        System.out.println("After subtraction");
        c.printComplex(anss);
        System.out.println("After multiplication");
        c.printComplex(ansm);

        System.out.println("----------------------------------");
        System.out.println("Complex class as parameter of constructor");
        Complex c3 = new Complex(c1);
        Complex c4 = new Complex(c2);
        Complex ans3 = c3.addition(c3,c4);
        Complex ans3s = c3.subtraction(c3,c4);
        Complex ans3m = c3.multiplication(c3,c4);
        System.out.println("After addition");
        c3.printComplex(ans3);
        System.out.println("After subtraction");
        c3.printComplex(ans3s);
        System.out.println("After multiplication");
        c3.printComplex(ans3m);



    }
}








