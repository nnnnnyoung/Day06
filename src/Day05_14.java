
public class Day05_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		__[10번, 11번]______________________________________
		int[] a = {10,20,0,30,45,0,0,60,0,0,0,56};
//		위 배열은 토지 위에 건물을 나타낸 것이다. 숫자는 층(높이)이다
//		값이 0 인 경우는 빈자리이며 건물을 지을 수 있다
//		인덱스는 0부터 시작된다.
//		위 배열의 값은 바뀔 수 있다.
//		_________________________________________________--

//		10. [배열] 빈자리는 모두 몇 개인가?  
		
		int b=0;
		for(int i=0; i<a.length; i++) {
			if(a[i]==0) {
				b++;
			}
		}
		System.out.println(b);
		
//		11. 배열의 값 중 0이 하나 있으면 사이즈1, 0이 연속 2개 있으면 사이즈 2이다.   사이즈2짜리 건물을 세우려고 한다. 사이즈는 연속된 빈자리의 최대 범위이다.
//		       (사이즈가 2 이상이면 건물을 세울 수 있다)건물을 세울 수 있는 공간은 몇 개인가? 
//		       사이즈는 배열의 크기를 벗어 나지 않은 범위에서 어떤 숫자를 넣어도
//		       건물을 세울 수 있는 공간이 나와야 한다.
		
		// 내 답 사이즈가 2의 배수일 경우 사이즈/2의 갯수만큼 건물을 지을 수 있다고 해석
		int c=0; //건물사이즈
		int d=0; //지을 수 있는 건물갯수
		for (int i=0; i<a.length; i++) {
			if(a[i]==0) {
				c+=1;
				if(c%2==0) {
					d++;
				} 
			}else {
				c=0;
			} 
		}
		System.out.println(d);
		
		
		// 선생님 답 사이즈가 2이상일 경우 건물 하나를 지을 수 있다고 해석
		int bSize=2; //건물사이즈
		int pPoint=0; // 건축가능공간
		for (int i=0; i<a.length; i++) {
			int cnt=0; //0이 연속으로 몇개나 있는지를 저장하는 변수
			if(a[i]==0) {
				cnt++;
				System.out.println(i+"위치에 빈공간이 있어요");
				for (int j=i+1; j<a.length; j++) {
					if(a[j]==0) {
						cnt++;
					}else {
						j=100;
					}
				}
				System.out.println(cnt);
				if(cnt>= bSize) {
					pPoint++;
				}
				i=i+cnt;
			}
		}
		System.out.println("건물을 지을 수 있는 곳은 :"+pPoint+"곳 입니다.");

	}

}
