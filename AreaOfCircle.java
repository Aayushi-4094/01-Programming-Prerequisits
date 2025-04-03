import java.io.*;

public class AreaOfCircle {
    public static final double PI = 3.14;     
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the radius");
        Double r = Double.parseDouble(br.readLine());
        double area = PI * r * r;
        System.out.println("The Area of circle is " + area);
    }
}