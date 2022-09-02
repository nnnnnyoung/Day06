
public class Day05_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		8. 
//		1번부터 45번 숫자를 랜덤으로 1000번 뽑는다.
//		가장 많이 나온 숫자 7개를 출력한다. <가장 많이 나온숫자가 여러번일경우는
//		작은 숫자가 우선한다>
		
		//분석
		/* 배열의 번호 인덱스로 보고, 배열의 값을 나온 횟수로 정의합니다.
		  0  1  2  3  4  5  6  7  8  ... 11 12 13 .... 41 42 << 인덱스
		  8  30 1  34 78 2  5 67  10     22 34 56       3 45  <<값
		  
		  */
		int [] lotto=new int[46]; // 길이 46 인덱스 0-45, 우리는 0번은 필요없다
		//입력부
		  for (int i=0; i<1000; i++) { //반복문 선언 이류 천번의 랜덤 수를 뽑기 위한 반복문
			  int tempa=(int)(Math.random()*45+1); //랜덤한 숫자를 뽑는다 이 숫자는 로또번호로 인덱스를 의미
			  lotto[tempa]++; // 랜덤으로 뽑힌 수가 인덱스로 설계하였다 그래서 그 인덱스의 값을 증가시킨다.
			  				//이렇게 되면 그 숫자가 인덱스에 저장된 수만큼 뽑힌 것이다.
		  }
		  
		  
		 //출력부 
		  //for(int i=0; i<lotto.length; i++) {
			 // System.out.println(i+"/"+lotto[i]); 결과 확인 후 진행
		  //}
		  for (int j=0; j<7;j++) {
			  int maxIndex=0; //로또번호는 인덱스!! 그렇지만 비교는 인덱스 값과 비교!
			                 // 가장 큰 값을 저장하는것이 아니라 그 값이 저장되어있는 인덱스 번호를 저장
			  for (int i=0; i<lotto.length; i++) { // i는 0부터 증가하면서 값이 가장 큰 경우를 찾습니다.
				  if(lotto[maxIndex]<lotto[i]) {
					  // < 를 사용하여 <가장 많이 나온숫자가 여러번일경우는
					  //	작은 숫자가 우선한다>라는 조건을 충족한다 
					  //lotto[i]값이 더 크다면... 내가 알고 있던 인덱스보다 더 큰값을 가지고 있는 인덱스가 나타났다! 
				  maxIndex=i;// 그래서 max값을 갱신
			  }
		  }
			  System.out.println("최고 많이 나온 인덱스 : "+maxIndex+"/ 값: "+lotto[maxIndex]);
			  lotto[maxIndex]=-1; //최곳값을 -1로 저장하여 다음 출력시엔 출력되지 않게 한다.
		  }
	
		
	
		}
	}


