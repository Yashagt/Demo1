package basics;

import java.util.HashMap;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character,Integer> emp= new HashMap<Character,Integer>();
		String s="vengatram";
		char[] ch=s.toCharArray();
		for(char c:ch)
		{
			if(emp.containsKey(c))//If it is present, then increase its count using get() and put() function in Hashmap
			{
				int x=emp.get(c);
				emp.put(c, x+1);
			}
			else
			{
				emp.put(c, 1);//putting this char to emp with 1 as it's value
			}
		}
		
		
System.out.println(emp);
	}

}
