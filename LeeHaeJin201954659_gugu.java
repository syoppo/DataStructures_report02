import java.util.Scanner;

public class LeeHaeJin201954659_gugu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input;	//입력받는 수
		int result;
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력해 주세요 : ");
		input = scan.nextInt();
		
		for(int i=1; i<10; i++) {
			result = i*input;
			System.out.println(input+"*"+i+"="+result);
		}
	}

}
