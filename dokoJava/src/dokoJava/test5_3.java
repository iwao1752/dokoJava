package dokoJava;

public class test5_3 {
	public static void email(String title, String address, String text){
		System.out.println("send email to: " + address);
		System.out.println("subject: " + title );
		System.out.println("context: " + text);
	}
	
	public static void email(String address, String text){
		System.out.println("send email to: " + address);
		System.out.println("subject: anonymous");
		System.out.println("context: " + text);
	}
	
	public static void main(String[] args){
		email("test", "aaa@abc.com", "hello world");
		email("aaa@abc.com2", "hello world");
	}

}
