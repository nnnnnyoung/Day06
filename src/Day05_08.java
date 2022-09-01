
public class Day05_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {10,23,23,25,10,4};
//		짝수는 모두 몇개인가?
		int count=0;
		for (int i=0; i<6; i++) {
			if(a[i]%2==0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
