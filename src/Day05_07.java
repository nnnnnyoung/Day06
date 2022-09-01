
public class Day05_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {10,23,23,25,10,4};
//		홀수의 합을 구하시오
		int sum=0;
		for (int i=0; i<6; i++) {
			if(a[i]%2==1){
				sum=sum+a[i];				
			}

		}
		System.out.println(sum);
	
	}


}
