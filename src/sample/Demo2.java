package sample;
//change for pull
public class Demo2 {
	public static void main(String[] args) {
	String s="Pramod";
	String rev="";
		for(int i=s.length(); i>=0; i--)
		{
			try {
			rev=rev+s.charAt(i);
			}
			catch (Exception e)
			{
				System.out.println("String index out of bound");
			}
		}
		System.out.println(rev);
	}
}
