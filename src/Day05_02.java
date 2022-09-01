
public class Day05_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 10. 이중 for문
		1팩토리얼+2팩토리얼+3팩토리얼의 합을구하시오.
		3팩토리얼은 1*2*3 이다. */
		
		int sum=0;
		//sum은 누적이 되어야해서  for문 바깥쪽에 선언
		for (int i=1; i<5; i++) {
			int result=1; //result는 누적이 되면 안돼서 for문 안쪽에 선언
			for (int j=1; j<=i; j++ ) {
				result= result*j;
				System.out.println(result);
			}
			System.out.println("-");
			// 곱한것에 대한 결과값을 누적시켜야 한다
			sum= sum+result;
		}	
		System.out.println(sum);

	}

}
