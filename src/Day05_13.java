
public class Day05_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] passInt={1,2,3,4,5,6,7,8,9};
		String mypass = " ";

//		�������� ��й�ȣ 4�ڸ��� ������� �Ѵ�.
//		passInt �迭���� ������ �� 4���� �̾Ƽ� mypass�� �ϼ��Ѵ�.
		
		for (int i=0; i<4; i++) {
			int j=(int)(Math.random()*9);
			mypass=mypass+passInt[j];
		}
		
		System.out.println(mypass);
	}

}
