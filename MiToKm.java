import java.io.*;
import java.lang.*;;
public class MiToKm {
public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the distance in kilometers");
int kilo = Integer.parseInt(br.readLine());
double miles = kilo*0.621371;
        System.out.println("Conversion of Kilometer to Miles " + miles +"mi");
    }
}