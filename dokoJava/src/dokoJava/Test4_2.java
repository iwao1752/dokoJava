package dokoJava;

public class Test4_2 {
	public static void main(String[] args){
		int[] moneyList = {121902, 8302, 55100};
		
		for(int i = 0; i < moneyList.length; i++){
			System.out.println("moneyList[" + i + "] is " + moneyList[i]);
		}
		System.out.println("-----<extended forLoop Statement>-----");
		for( int n : moneyList){
			System.out.println("moneyList is " + n);
		}
	}

}
