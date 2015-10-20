package dokoJava;

public class Test3_5 {
	public static void main(String[] args) {
		System.out.println("[menu] 1:search 2:register 3:delete 4:modify >");
		
		int selected = new java.util.Scanner(System.in).nextInt();
		
		switch(selected){
		    case 1:
		    	System.out.println("search");
		    	break;
		    case 2:
		    	System.out.println("register");
		    	break;
		    case 3:
		    	System.out.println("delete");
		    	break;
		    case 4:
		    	System.out.println("modify");
		    	break;
		}		
	}
}
