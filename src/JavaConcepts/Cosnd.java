package JavaConcepts;

public class Cosnd {
	public static void main(String[] args) 
	{
		System.out.println("Hello World");
		int[] arr= {40,60,30,10,50};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;				
				}
			}
		}
		System.out.println("this is first maximum "+arr[0]);
		
		}
	}

