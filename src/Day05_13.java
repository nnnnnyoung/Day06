
public class Day05_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] passInt={1,2,3,4,5,6,7,8,9};
	//	char[] passInt= {'a','b','c','d','e','f','g','h','i'}; 
	//	String[] passInt= {"��","��",��","��","��","��","ĥ","��","��"}; �ڷ����� ���� �̷��� ������ ���� �ִ�
		String mypass = " ";

//		�������� ��й�ȣ 4�ڸ��� ������� �Ѵ�.
//		passInt �迭���� ������ �� 4���� �̾Ƽ� mypass�� �ϼ��Ѵ�.
		
		for (int i=0; i<4; i++) {
			int j=(int)(Math.random()*9);
			mypass=mypass+passInt[j];
		}
		
		System.out.println(mypass);
		
		//100�� �ݺ��Ͽ� ���� ���� ��µ� 4���� ����Ѵٸ�?
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
		System.out.println("������ �޴� :"+ passInt[maxIndex]);
	}

}
