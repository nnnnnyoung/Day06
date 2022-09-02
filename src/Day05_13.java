
public class Day05_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] passInt={1,2,3,4,5,6,7,8,9};
	//	char[] passInt= {'a','b','c','d','e','f','g','h','i'}; 
	//	String[] passInt= {"일","이",삼","사","오","육","칠","팔","구"}; 자료형에 따라 이렇게 응용할 수도 있다
		String mypass = " ";

//		무작위로 비밀번호 4자리를 만드려고 한다.
//		passInt 배열에서 랜덤한 값 4개를 뽑아서 mypass를 완성한다.
		
		for (int i=0; i<4; i++) {
			int j=(int)(Math.random()*9);
			mypass=mypass+passInt[j];
		}
		
		System.out.println(mypass);
		
		//100번 반복하여 가장 많이 출력된 4개를 출력한다면?
		int [] hitPass=new int[passInt.length];
		
		for(int i=0; i<100; i++) {
			int tempIndex=(int)(Math.random()*9);
			hitPass[tempIndex]++;
		}
	
		int maxIndex=0;
		for (int i=1; i<hitPass.length; i++) {
			if(hitPass[maxIndex]< hitPass[i]) {
				maxIndex=i;
			}
		}
		System.out.println("오늘의 메뉴 :"+ passInt[maxIndex]);
	}

}
