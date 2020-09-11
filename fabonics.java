import java.io.*;
class fabonics
{
public static void main(String yu[])throws IOException
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int a,b,c;
	System.out.print("Enter Any Two No.\n");
	a=Integer.parseInt(br.readLine());
	b=Integer.parseInt(br.readLine());
	while(b<=100)
	{
		c=a+b;
		System.out.print("\t"+c);
		a=b;
		b=c;
	}
}
}
