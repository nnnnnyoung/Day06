
public class Day05_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�迭�� ���� ��� ���Ͻÿ�
		int [] a = {10,23,23,35,10,4};
		int sum=0;
		for (int i=0; i<6; i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
		
		// �迭�� ���� ��� ���Ͻÿ� �߰����� ����ϰ� ����� ���
		int [] a1 = {10,23,23,35,10,4};
		int sum1=0;
		for (int i=0; i<6; i++) {
			sum1=sum1+a[i];
			System.out.println(sum);
		}
		System.out.println(sum);
		
		// �迭�� �� �� 10�� ��� ��ΰ���?
		int b=0;
		for(int i=0; i<6; i++) {
			if(a[i]==10) {
				b++;
			}
		}
		System.out.println(b);
		
		String name="abaaefg12c";
		//  index    0123456789
		
		int cnt=0;
		for(int i=0; i<10; i++) {
			//System.out.println(name.cahrAt(i));
			if(name.charAt(i)=='a') {
				System.out.println(name.charAt(i));
				cnt++;
			}
		}
		System.out.println("a�� ��"+cnt+"��");
	}

}
