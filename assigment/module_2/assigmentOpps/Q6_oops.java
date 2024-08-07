package assigmentOpps;

import java.util.Scanner;

class Complex
{
	int real1, real2, imaginary1, imaginary2;
	
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the real part of the first complex number:");
		real1 = sc.nextInt();
		System.out.println("enter the imaginary part of the first complex number:");
		imaginary1 = sc.nextInt();
		
		System.out.println("enter the real part of the second complex number:");
		real2 = sc.nextInt();
		System.out.println("enter the imaginary part of the second complex number:");
		imaginary2 = sc.nextInt();
	}
	public void sum()
	{
		System.out.println("sum of the complex numbers:"+(real1+real2)+"+"+(imaginary1+imaginary2)+"i");
	}
	public void difference()
	{
		System.out.println("difference of the complex number:"+(real1-real2)+"+"+(imaginary1-imaginary2)+"i");
	}
  public void product()
  {
	  int realpart= (real1*real2)-(imaginary1*imaginary2);
	  int imaginarypart= (real1*imaginary2)+(real2*imaginary1);
	  System.out.println("product of the complex number:"+realpart+"+"+"i");
	  
  }
}
public class Q6_oops 
{
     public static void main(String[] args)
     {
		Complex c1 = new Complex();
		c1.input();
		c1.sum();
		c1.product();
	}
}
