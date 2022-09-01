
public class Day05_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1. 다음과 같이 출력하세요
//		0000*
//		000**
//		00***
//		0****
		
		for (int i=0; i<4; i++) {
			for(int j=0; j<=3-i; j++) {
				System.out.print("0");
			}
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}

}
