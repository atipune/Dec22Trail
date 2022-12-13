package sample;

public class Sample 
{
	public static void main(String[] args) {
		int[][] a= {{1,2},{4,3}};
		for(int i=a.length-1;i>=0; i--)
		{
			int temp=0;
			while(temp>=i)
			{
			System.out.println(a[i][temp]);
			temp++;
			}	
			System.out.println();
		}
	}
}
