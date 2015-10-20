package dokoJava;

public class List5 {
	public static void main(String[] args){
		System.out.println("----call method----");
		
		hello("minato");
		hello("asaka");
		hello("sugawara");
		
		System.out.println("----finished calling method----");
		}
	
	public static void hello(String name){
		System.out.println( "hello, " + name );
	}
}
