
public class Day05_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] lotto = new int[7];
//		로또 번호를 저장하세요. 중복 불가능
//		출력형태는 23/44/21/25/23/1+11
		
		for (int i=0; i<lotto.length; i++) {	
			int a=(int)(Math.random()*45+1);
			lotto[i]=a;
			for(int j=0; j<i; j++) {
				if(a==lotto[j]) {
					i--;
				}
			}		
		}
		
		
		/* 선생님 답 */
		for (int i=0; i<lotto.length; i++) {	
			int a=(int)(Math.random()*45+1);
			int chkFlag=0; //중복 발생 유무를 저장하는 변수
			// 26번의 반복문은 중복을 확인하는 코드 이 반복문이 끝나야 정확한 결과를 알 수 있다
			for(int j=0; j<i; j++) {
				if(a==lotto[j]) {
					chkFlag=1;
				}
			}		
			//반복문 결과로 판별하는 조건문
			if(chkFlag==0) { //중복된 값이 없다.
				lotto[i]=a;
			}else { //중복이 발생함
				i--;
			}
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
