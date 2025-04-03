import java.io.*;
import java.lang.*;;
public class Average {
public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the first number");
int a = Integer.parseInt(br.readLine());
System.out.println("Enter the second number");
int b = Integer.parseInt(br.readLine());
System.out.println("Enter the third number");
int c = Integer.parseInt(br.readLine());
double avg = (a+b+c)/3;
        System.out.println("The average is " + avg);
    }
}