public class DuplicateVal{
	public static void main(String[] args){
	int array[]=new int[] {1,3,2,3,1,5,8,10};
	System.out.println("duplicate element in array:");
	for(int i=0;i<array.length;i++)
	{
		for(int j=i+1;j<array.length;j++)
		{	
			if(array[i]==array[j])
			System.out.println(array[j]);
		}
	}
	
}
}	