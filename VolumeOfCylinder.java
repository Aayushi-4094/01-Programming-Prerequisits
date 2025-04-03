import java.io.*;
import java.lang.*;;
public class VolumeOfCylinder {
public static final double PI = 3.14;     
public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the radius");
Double r = Double.parseDouble(br.readLine());
System.out.println("Enter the height");
Double h = Double.parseDouble(br.readLine());
double volume = PI * Math.pow(r,2) *h;
        System.out.println("The Volume of cylinder is " + volume);
    }
}