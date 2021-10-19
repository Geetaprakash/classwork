import java.util.*;
class RevStrBuff{
	public static String rev(String s){
	//reverse is inbuilt fn in String Buffer
	return new StringBuilder(s).reverse().toString();
	}
public static void main(String[] args){
String s="geeta biradar";
s=rev(s);
System.out.println("string after reverse:"+s);
}
}
	