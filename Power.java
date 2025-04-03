import java.io.*;
import java.lang.*;;
public class Power {
public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the base");
int b = Integer.parseInt(br.readLine());
System.out.println("Enter the exponent");
int e = Integer.parseInt(br.readLine());
double p = Math.pow(b,e);
        System.out.println("The Power is " + p);
    }
}