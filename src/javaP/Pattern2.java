package javaP;

public class Pattern2
{

	public static void main(String[] args) 
	{
		
		
//			for(int i=1;i<5;i++)//row
//		{
//			for(int j=0;j<i;j++)//column
//			{
//			//	System.out.print(" "+i);
//				System.out.print(" *");
//			}
//			System.out.println(" ");
//			
//		}
		
	

	
	
//	for(int i=5;i>=0;i--)
//	{
//		for(int j=0;j<=i;j++)
//		        {
//					System.out.print(" *");
//		       }
//           System.out.println(" ");
//	}
//}
//}
//	}
//}
		{    
			//i for rows and j for columns      
			//row denotes the number of rows you want to print  
			int i, j, row = 6;       
			//Outer loop work for rows  
			for (i=0; i<row; i++)   
			{  
			//inner loop work for space      
			for (j=2*(row-i); j>=0; j--)         
			{  
			//prints space between two stars      
			System.out.print(" ");   
			}   
			//inner loop for columns  
			for (j=0; j<=i; j++ )   
			{   
			//prints star      
			System.out.print("* ");   
			}   
			//throws the cursor in a new line after printing each line  
			System.out.println();   
			}   
			}   
	}}



