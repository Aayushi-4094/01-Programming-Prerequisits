import java.io.*;
import java.lang.*;
public class Addition{
public static void main(String[] args)throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the first number");
int a = Integer.parseInt(br.readLine());
System.out.println("Enter the second number");
int b = Integer.parseInt(br.readLine());
int c = a+b;
System.out.println("Sum of two numbers is "+ c);
}
}

