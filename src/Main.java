import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Enter number from 0 to 9:");
		int a = in.nextInt();
		
		if(a==1){
			System.out.println("You entered one.");
		}else if(a==2){
			System.out.println("You entered two.");
		}else if(a==3){
			System.out.println("You entered three.");
		}else if(a==4){
			System.out.println("You entered four.");
		}else if(a==5){
			System.out.println("You entered five.");
		}else if(a==6){
			System.out.println("You entered six.");
		}else if(a==7){
			System.out.println("You entered seven.");
		}else if(a==8){
			System.out.println("You entered eight.");
		}else if(a==9){
			System.out.println("You entered nine.");
		}else if(a==0){
			System.out.println("You entered zero.");
		}else{
			System.out.println("I can't recognize this number.");
		}

	}

}
