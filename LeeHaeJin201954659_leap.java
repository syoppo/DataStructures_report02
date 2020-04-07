import java.util.Scanner;

public class LeeHaeJin201954659_leap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		Scanner scan = new Scanner(System.in);
		System.out.print("년도를 입력해 주세요 : ");
		year = scan.nextInt();
		
		if((year%4==0 && year%100!=0)||year%400==0) {
			System.out.println(year+"년은 윤년입니다.");
		}
		else {
			System.out.println(year+"년은 평년입니다.");
		}
		
	}

}