import java.util.Scanner;
class A2_12
{
public static void main(String args[])
{
	double Avg;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number n1");
System.out.println("Enter the number n2");
System.out.println("Enter the number n3");
double n1 = sc.nextDouble();
double n2 = sc.nextDouble();
double n3 = sc.nextDouble();
Avg = (n1+n2+n3)/3;
System.out.println("average"+Avg);
}
}
