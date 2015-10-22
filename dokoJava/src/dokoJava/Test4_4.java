package dokoJava;
import java.util.Scanner;

public class Test4_4 {
	public static void main(String[] args){
	    int[] numbers = {3,4,9};
	
    	System.out.println("please input number.");
    	Scanner scan = new Scanner(System.in);
    	int input = scan.nextInt();
    	
    	for( int i = 0; i< numbers.length; i++){
    		if( numbers[i] == input){
    			System.out.println("HIT!");
    		}
    	scan.close();

    	}
	}
}
