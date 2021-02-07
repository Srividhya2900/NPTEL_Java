import java.util.Scanner;

public class Circle extends Point{
	
public static void main(String[] args) {

	 Scanner sc = new Scanner(System.in);
	 Point p1=new Point();
	 p1.x=sc.nextDouble();
	 p1.y=sc.nextDouble();
	 Point p2=new Point();
	 p2.x=sc.nextDouble();
	 p2.y=sc.nextDouble(); 
	 Circle c1=new Circle();
	c1.distance(p1,p2);
	
  }

}
//Complete the code segment to define a class Point with parameter x,y and method distance()for calculating distance between two points.
//Note: Pass objects of type class Point as argument in distance() method. 
  class Point{
double x,y;
  void distance(Point tp1,Point tp2){
  System.out.println(Math.sqrt((tp1.x-tp2.x)*(tp1.x-tp2.x)+(tp1.y-tp2.y)*(tp1.y-tp2.y)));
  }
}
