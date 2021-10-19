import java.util.Scanner;
 class StringRevWhile{
	public static void main(String[] args)
	{
	String str;
	Scanner scan=new Scanner(System.in);
	//take a input from user
	System.out.println("enter string:");
	str=scan.nextLine();
	//read a string
	System.out.println("rev of string is'"+str+"' is:");
	//print char until i>0
	int i=str.length();
	while(i>0)
	{
	//charAt(returns specified index)//
	System.out.print(str.charAt(i-1));
	i--;
	}
}
}
