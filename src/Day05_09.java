
public class Day05_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] b=new int[5];
//		랜덤숫자 1-15까지 뽑아서 짝수인 숫자만 저장하세요
		
		for(int i=0; i<5; i++) {
			int c=(int)(Math.random()*15+1);
			if(c%2==0) {
				b[i]=c;
			}else {
				i--;
			}
		}
		
			
			
			
		for (int i=0; i<5; i++) {
			System.out.println(b[i]);
		}
		

	}

}
