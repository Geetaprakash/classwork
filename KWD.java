public class KWD
	{
		public static void main(String[] args) {
			 KWD k=new  KWD();
			k. KWD();}
	public void  KWD() {		
		int i,j;
		for(i=1;i<=5;i++)//rows print
		{
			for(j=1;j<5;j++)//columns print
			{
				if(j ==1 ||(j==2 && i==3 )||(j==3 &&i==2)||(j==4 && i==1)||(j==3 && i==4)||(j==4 && i==5))
					System.out.print("**");
				else
					System.out.print(" ");
			}
			System.out.println();
		

	}
	}

}



