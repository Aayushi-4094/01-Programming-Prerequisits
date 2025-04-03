import java.io.*;
import java.lang.*;
public class Conversion{
public static void main(String[] args)throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the temperature in celsius");
int celsius = Integer.parseInt(br.readLine());
int fahrenheit = (celsius * 9/5) + 32;
System.out.println("The temperature in fahrenheit is "+ fahrenheit + "F");
}
}

