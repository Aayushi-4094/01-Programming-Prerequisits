import java.io.*;
import java.lang.*;;
public class PerimeterOfRectangle {
public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the length");
int l = Integer.parseInt(br.readLine());
System.out.println("Enter the breadth");
int b = Integer.parseInt(br.readLine());
double perimeter = 2*(l+b);
        System.out.println("The Perimeter of Rectangle is " + perimeter);
    }
}