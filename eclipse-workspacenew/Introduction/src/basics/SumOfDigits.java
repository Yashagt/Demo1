package basics;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="12345";
		int sum=0;
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isDigit(ch[i]))
			{
				int num=Integer.parseInt(String.valueOf(ch[i]));
				sum=sum+num;
			}
		}
		System.out.println(sum);

	}
}
