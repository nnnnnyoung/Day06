
public class Day05_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// int a= Math.random()*4; 결과가(double) int보다 비트수가 크기때문에 자동형변환이 일어날수 없다 
		int a= (int) (Math.random()*4); //0,1,2,3중 한개의 랜덤 수 
		System.out.println(a); 
		
		System.out.println((int)(Math.random()*3+1)); //0,1,2중 한개의 랜덤 수 추출 후 +1보정
		System.out.println((int)(Math.random()*45+1)); //1-45번 숫자를 가진 로또번호 추출
		
		// 1. 로또번호 7개를 뽑기위해 for문 작성
		for(int i=0; i<7; i++ ) {
			System.out.println((int)(Math.random()*45+1));
		}
		
		System.out.println("--------");
		// 2. 로또번호 7개를 저장하기 위한 배열 선언
		int [] b=new int[7]; //길이 7, 인덱스는 0-6
		// 3. 배열 인덱스 0-6까지 순서대로 랜덤한 숫자 저장
		for (int i=0; i<7; i++) {
			b[i]=(int)(Math.random()*45+1);
		}
		
		/* or */
		
		for (int i=0; i<7; i++) {
			int c=(int)(Math.random()*45+1);
			b[i]= c;
			System.out.println(b[i]);
		}	
		
		// 4. 모든 숫자가 저장되면 출력
		for (int i=0; i<7; i++) {
			System.out.println(b[i]);
		}
	
		// 5. 로또게임 3번 반복을 위한 for문을 만들어보세요
		for(int k=0; k<3; k++) {
			for(int i=0; i<7; i++) {
				b[i]=(int)(Math.random()*45+1);
			}			
			for (int i=0; i<7; i++) {
				System.out.println(b[i]);
		}
		
			System.out.println("-------");
		}

	}

}
