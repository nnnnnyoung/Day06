
public class Day05_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// int a= Math.random()*4; �����(double) int���� ��Ʈ���� ũ�⶧���� �ڵ�����ȯ�� �Ͼ�� ���� 
		int a= (int) (Math.random()*4); //0,1,2,3�� �Ѱ��� ���� �� 
		System.out.println(a); 
		
		System.out.println((int)(Math.random()*3+1)); //0,1,2�� �Ѱ��� ���� �� ���� �� +1����
		System.out.println((int)(Math.random()*45+1)); //1-45�� ���ڸ� ���� �ζǹ�ȣ ����
		
		// 1. �ζǹ�ȣ 7���� �̱����� for�� �ۼ�
		for(int i=0; i<7; i++ ) {
			System.out.println((int)(Math.random()*45+1));
		}
		
		System.out.println("--------");
		// 2. �ζǹ�ȣ 7���� �����ϱ� ���� �迭 ����
		int [] b=new int[7]; //���� 7, �ε����� 0-6
		// 3. �迭 �ε��� 0-6���� ������� ������ ���� ����
		for (int i=0; i<7; i++) {
			b[i]=(int)(Math.random()*45+1);
		}
		
		/* or */
		
		for (int i=0; i<7; i++) {
			int c=(int)(Math.random()*45+1);
			b[i]= c;
			System.out.println(b[i]);
		}	
		
		// 4. ��� ���ڰ� ����Ǹ� ���
		for (int i=0; i<7; i++) {
			System.out.println(b[i]);
		}
	
		// 5. �ζǰ��� 3�� �ݺ��� ���� for���� ��������
		for(int k=0; k<3; k++) {
			for(int i=0; i<7; i++) {
				b[i]=(int)(Math.random()*45+1);
			}			
			for (int i=0; i<7; i++) {
				System.out.println(b[i]);
		}
		
			System.out.println("-------");
		}

	}

}
