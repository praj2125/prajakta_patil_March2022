import java.util.Scanner;
class A2
{
public static void main(String args[])
{
double Area;
float peri;
Scanner sc = new Scanner(System.in);
System.out.println(" Enter the width W ");
System.out.println(" Enter the Height H");
float W = sc.nextFloat();
Float H = sc.nextFloat();
Area = (W*H);
peri = 2*(W+H);
System.out.println("Area is=" + Area);
System.out.prinntln("Perimeter is=" +peri);
}
}


