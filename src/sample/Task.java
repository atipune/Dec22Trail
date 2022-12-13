package sample;

public class Task {
public static void main(String[] args) {
	String s1="Grab";
	String s2="rbaG";
	int temp=0;
	for(int i=0; i<s1.length();i++)
	{
		for(int j=0; j<s2.length(); j++)
		{
			if(s1.charAt(i)==s2.charAt(j))
			{
				temp++;
				break;
			}
		}
	}
	if(temp==s1.length())
	{
		System.out.println("String is anagram");
	}
	else
	{
		System.out.println("String is not anagram");
	}
}
}
