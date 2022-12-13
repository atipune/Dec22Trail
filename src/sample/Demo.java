package sample;

import java.util.ArrayList;

public class Demo {
	public static void main(String[] args) {
		 ArrayList<Integer> al= new ArrayList<Integer>();
	      al.add(1);
	      
	      //my change
	      al.add(22);
	      al.add(54);
	      al.add(52);
	      al.add(46);
	      al.add(45) ;
	      al.add(87);
	      al.add(12);
	      al.add(54);
	      al.add(45);
	      int temp=0;
	      int temp1=0;
	      int temp2=0;
	      for(int i=0; i<al.size(); i++)
	      {
	        	  if(temp<al.get(i))
	        	  {
	        		  temp2=temp1;
	        		  temp1=temp;
	        		  temp=al.get(i);
	        	  }
	      }
	      System.out.println(temp2);
		}
}
