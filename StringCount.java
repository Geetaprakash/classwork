import java.util.HashMap;
public class StringCount{
	public static void main(String[] args){	
	//declaring a string
	String str="my name is geeta";
	System.out.println("String=" +str);
	//char,Int(key,value)
	HashMap<Character,Integer>hashMap=new HashMap<>();

	for(int i=str.length()-1;i>=0;i--){
	
//conatainskey(0,charAt())count the occ of each char
	if(hashMap.containsKey(str.charAt(i)))
	{
		int count=hashMap.get(str.charAt(i));
		//put char in map & map to the curnt char
		hashMap.put(str.charAt(i),1);
		}else{
			hashMap.put(str.charAt(i),1);
			}
	}
	System.out.println("counting occurence of each word = " +hashMap);
	}
}
//hashMap clas implements the Map I/f which allows us to store key and value pair,unique key shoudl be there