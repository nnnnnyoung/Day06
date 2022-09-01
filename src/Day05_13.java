
public class Day05_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] passInt={1,2,3,4,5,6,7,8,9};
		String mypass = " ";

//		무작위로 비밀번호 4자리를 만드려고 한다.
//		passInt 배열에서 랜던한 값 4개를 뽑아서 mypass를 완성한다.
		
		for (int i=0; i<4; i++) {
			int j=(int)(Math.random()*9);
			mypass=mypass+passInt[j];
		}
		
		System.out.println(mypass);
	}

}
