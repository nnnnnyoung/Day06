
public class Day05_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10,23,23,25,10,4};
//		for���� ����Ͽ� �迭�� ���� ��ĭ�� �ڷ� �̵���Ű�ÿ� �� ���ڸ��� ó�� �ڸ��� �̵�
		
		int b=0;
		for (int i=0; i<6; i++) {
			b=i-1;
			if(b==-1) {
				b=5;
			}
			System.out.println(a[b]);
		}
		
		System.out.println("------");
		
		
		for (int i=0; i<6; i++) {
			System.out.println(a[i]);
		}
	}

}
