package assigment1;

public class assigArrays_1 
{
   public static void main(String[] args) 
   {
	   int a[] = new int[5];
	   a[0] = 30;
	   a[1] = 24;
	   a[2] = 40;
	   a[3] = 39;
	   a[4] = 65;
	   
	   int i,max=0;
	   for(i=0; i<=5; i++)
	   {
		   if(a[i]>max)
		   {
			  max=a[i];
		   }
	   }
	   System.out.println("maximum :"+max);
   }
}

