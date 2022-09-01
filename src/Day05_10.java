
public class Day05_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] lotto = new int[7];
//		로또번호를 저장하세요. 중복가능
//		출력형태는 23/44/21/25/23/1+11
		
		for (int i=0; i<7; i++) {
			int a=(int)(Math.random()*45+1);
			lotto[i]= a;

		}
		for (int i=0; i<7; i++) {
			if(i<5) {
				System.out.print(lotto[i]+"/");
			}else if (i==5){
				System.out.print(lotto[i]+"+");
			}else {
				System.out.print(lotto[i]);
			}
		}
	}

}
