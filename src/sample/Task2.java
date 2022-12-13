package sample;

import java.util.ArrayList;

public class Task2 
{
	public static void main(String[] args) {
		//[A,B,C]  [B,R,T]
		ArrayList al= new ArrayList();
		al.add('A');
		al.add('B');
		al.add('C');
		ArrayList al2= new ArrayList();
		al2.add('B');
		al2.add('R');
		al2.add('T');
		int temp=0;
		if(al.size()==al2.size())
		{
			for(int i=0; i<al2.size(); i++)
			{
				if(al.contains(al2.get(i)))
				{
					temp++;
					break;
				}
			}
		}
		if(temp==al.size())
		{
			System.out.println(al +" and "+ al2+"are equal");
		}
		else
		{
			System.out.println(al +" and "+ al2+"are not equal");
		}
			
	}
}
