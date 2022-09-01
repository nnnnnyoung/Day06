
public class Day05_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//      0 : 0 1 2 3 4 --------
//		1 : 1 2 3 4 --------
//		2 : 2 3 4 --------
//		3 : 3 4 --------		
//		를 출력하시오
		
		for ( int i=0; i<4 ;i++ ) {
			System.out.print(i+" : ");
			for(int j=i; j<=4 ; j++) {
				System.out.print(j+" ");
			}
			System.out.println("--------");
		}
				
//		0 : 1 2 3 4 --------
//		1 : 1 2 3 --------
//		2 : 1 2 --------
//		3 : 1 --------		
//		를 출력하시오
		
		for ( int i=0; i<4 ;i++ ) {
			System.out.print(i+" : ");
			for(int j=1; j<=4-i ; j++) {
				System.out.print(j+" ");
			}
			System.out.println("--------");
		}
		
		
		for(int i=1; i<6; i++) {
			for(int j=1; j<10; j++) {
				System.out.println(i+"*"+j+"="+(j*i));
			}
			System.out.println();
		}
		

	}

}
