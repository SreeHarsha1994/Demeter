package ArrayPrograms;

public class GettheFirstMinimumNumber {
	public static void main(String[] args) 
	{
		int[] arr= {40,20,30,10,50};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;				
				}
			}
		}
		System.out.println("this is first minimum "+arr[0]);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");		
		}

	}
	
}
