
public class Day05_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] lotto = new int[7];
//		로또번호를 저장하세요. 중복가능
//		출력형태는 23/44/21/25/23/1+11
		
		for (int i=0; i<lotto.length; i++) {
			int a=(int)(Math.random()*45+1);
			// a의 데이터에 대한 유효성을 검증할 수 있는 코드가 추가될 수 있다. 더 증명된 값을 배열에 저장할 수도 있다.
			lotto[i]= a;

		}
		for (int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i]);
			if(i==lotto.length-2) {
				System.out.print("+");
			}else if(i!=lotto.length-1){
				System.out.print("/");
			}
		}
	}

}
