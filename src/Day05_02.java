
public class Day05_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 10. ���� for��
		1���丮��+2���丮��+3���丮���� �������Ͻÿ�.
		3���丮���� 1*2*3 �̴�. */
		
		int sum=0;
		//sum�� ������ �Ǿ���ؼ�  for�� �ٱ��ʿ� ����
		for (int i=1; i<5; i++) {
			int result=1; //result�� ������ �Ǹ� �ȵż� for�� ���ʿ� ����
			for (int j=1; j<=i; j++ ) {
				result= result*j;
				System.out.println(result);
			}
			System.out.println("-");
			// ���ѰͿ� ���� ������� �������Ѿ� �Ѵ�
			sum= sum+result;
		}	
		System.out.println(sum);

	}

}
