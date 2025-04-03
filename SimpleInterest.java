import java.io.*;
import java.lang.*;;
public class SimpleInterest {
public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the principle");
int p = Integer.parseInt(br.readLine());
System.out.println("Enter the rate");
Double r = Double.parseDouble(br.readLine());
System.out.println("Enter the time (in years)");
int t = Integer.parseInt(br.readLine());
double si = (int)(p*r*t)/100;
        System.out.println("The Simple Interest is " + si);
    }
}