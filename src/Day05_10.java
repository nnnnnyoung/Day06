
public class Day05_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] lotto = new int[7];
//		�ζǹ�ȣ�� �����ϼ���. �ߺ�����
//		������´� 23/44/21/25/23/1+11
		
		for (int i=0; i<lotto.length; i++) {
			int a=(int)(Math.random()*45+1);
			// a�� �����Ϳ� ���� ��ȿ���� ������ �� �ִ� �ڵ尡 �߰��� �� �ִ�. �� ����� ���� �迭�� ������ ���� �ִ�.
			lotto[i]= a;

		}
		for (int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i]);
			if(i==lotto.length-2) {
				System.out.print("+");
			}else if(i!=lotto.length-1){
				System.out.print("/");
			}
		}
	}

}
