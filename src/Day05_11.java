
public class Day05_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] lotto = new int[7];
//		�ζ� ��ȣ�� �����ϼ���. �ߺ� �Ұ���
//		������´� 23/44/21/25/23/1+11
		
		for (int i=0; i<lotto.length; i++) {	
			int a=(int)(Math.random()*45+1);
			lotto[i]=a;
			for(int j=0; j<i; j++) {
				if(a==lotto[j]) {
					i--;
				}
			}		
		}
		
		
		/* ������ �� */
		for (int i=0; i<lotto.length; i++) {	
			int a=(int)(Math.random()*45+1);
			int chkFlag=0; //�ߺ� �߻� ������ �����ϴ� ����
			// 26���� �ݺ����� �ߺ��� Ȯ���ϴ� �ڵ� �� �ݺ����� ������ ��Ȯ�� ����� �� �� �ִ�
			for(int j=0; j<i; j++) {
				if(a==lotto[j]) {
					chkFlag=1;
				}
			}		
			//�ݺ��� ����� �Ǻ��ϴ� ���ǹ�
			if(chkFlag==0) { //�ߺ��� ���� ����.
				lotto[i]=a;
			}else { //�ߺ��� �߻���
				i--;
			}
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
