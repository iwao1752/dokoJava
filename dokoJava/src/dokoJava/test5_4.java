package dokoJava;

public class test5_4 {
	public static double calcTriangleArea(double bottom, double height){
		return bottom * height / 2;
	}
	
	public static double calcCircleArea(double radius){
		return radius * radius * 3.14;
	}
	
	public static void main(String[] args){
		double bottom = 25.5;
		double height = 69.3;
		double radius = 78.9;

		System.out.println("----calcurate TriangleArea-----");
		double TriangleArea = calcTriangleArea(bottom,height);
		System.out.println("TriangleArea = " + TriangleArea);
		
		System.out.println("----calcurate CircleArea-----");
		double CircleArea = calcCircleArea(radius);
		System.out.println( "CircleArea = " + CircleArea );		
	}

}
