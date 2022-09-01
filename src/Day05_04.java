
public class Day05_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//배열의 값을 모두 더하시오
		int [] a = {10,23,23,35,10,4};
		int sum=0;
		for (int i=0; i<6; i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
		
		// 배열의 값을 모두 더하시오 중간값도 출력하고 결과도 출력
		int [] a1 = {10,23,23,35,10,4};
		int sum1=0;
		for (int i=0; i<6; i++) {
			sum1=sum1+a[i];
			System.out.println(sum);
		}
		System.out.println(sum);
		
		// 배열의 값 중 10은 모두 몇개인가요?
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
		System.out.println("a는 총"+cnt+"개");
	}

}
