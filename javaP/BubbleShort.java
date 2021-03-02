package javaP;

public class BubbleShort {
	
	public void bubbleshort()
	{
		int array1[]= {1,10,5,4,8};
		int temp,i,j,n;
		
		n=array1.length;
		System.out.println("size of an array = "+n);
		
		for(i=0; i<=n-1; i++)
		{
			//System.out.println("sizei = "+i);
			for(j=0; j<n-1; j++)
			{
				//System.out.println("sizej = "+j); 
				if(array1[j]>array1[j+1])
				{
					
					//System.out.println("sizeij = "+j);
					temp = array1[j];
					array1[j] = array1[j+1];
					array1[j+1] = temp;
				}				
				
			}	
		}
		System.out.println("The bubble sorted array is");
		for (i=0; i<=n-1; i++)
		{
			System.out.print(" ");
			System.out.print(array1[i]);
		}

		
	}
	 
	public void insertionsort()
	{
		int a2[]= {5, 4,1,7,2,9};
		int i,j,temp,length;
		length = a2.length;
		System.out.println(" ");
		System.out.println("The length of array is in insertionsort  = "+length);
		 for(i=1; i<=length-1; i++)
		 {
			 temp=a2[i];
			 j=i-1;
			 
			 while(j>=0 && a2[j]>temp)
			 {
				 a2[j+1] = a2[j];
				 j--;
			 }
			 a2[j+1] = temp;
		 }
		 System.out.println("The Insertion sorted array is ");
		 for(i=0; i<length; i++)
		 {
			 System.out.print(" ");
			 System.out.print(a2[i]);
		 }
		
	}
	
	public static void main(String[] args) {
		
		BubbleShort bs = new BubbleShort();
		bs.bubbleshort();
		bs.insertionsort();

	}
}
			
			
			
			
			
		
		
		
		
		
		
	
	
