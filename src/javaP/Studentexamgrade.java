package javaP;



public class Studentexamgrade 
{
	private static double[][] array;		
public static void main(String[] args) 
{	
	
	 initializeArray();



     //  Calculate average
     System.out.println(getAverage());
}
     
     private static void initializeArray()
     {
     
	double[][]array=new double[1][2];
	array[0][0]=2.1;
	array[0][1]=3.1;
	array[0][2]=5.2;
	//array[1][0]=7.3;
	//array[1][1]=6.3;
	//array[1][2]=3.4;
     }  

private static double getAverage()
{
 
int counter=0;
double sum=0;
for (int i=0;i<array.length;i++)
{
	for (int j=0;j<array[i].length;j++)
	{
		sum=sum+array[i][j];
		counter++;
	}
}
return sum / counter;
          
}}


