package dokoJava;

public class Test3_6 {
	public static void main(String[] args){
		System.out.println("[matching figure game]");
		
		int ans = new java.util.Random().nextInt(9);
		
		for( int i = 0; i < 5; i++){
			System.out.println("game[" + (i+1) + "]");
			System.out.println("input number from 0 to 9.");
			int num = new java.util.Scanner(System.in).nextInt();
			
			if( ans == num){
				System.out.println("matching!");
				break;
			} else
				System.out.println("unmatch...");
		}
		
		System.out.println("finish the game.");

	}

}
