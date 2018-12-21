package algorithm.ch1;

public class ArrayQ2Q3 {
	public static void q2(){
		int[]ar= {5,10,73,2,-5,42};
		for(int i=0; i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		int temp=0;
		for(int i=0; i<ar.length-i;i++) {
			System.out.println("ar["+i+"]+과(와)"+"ar["+(ar.length-i-1)+"]를 교환합니다");
			
			temp=ar[i];
			ar[i]=ar[ar.length-i-1];
			ar[ar.length-i-1]=temp;
			
			for(int j=0; j<ar.length;j++) {
				System.out.print(ar[j]+" ");
			}
			System.out.println();
		
		}
	}
	
	public static int q3(int[] a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		//q2();
		int[]ar= {5,10,73,2,-5,42};
		System.out.println("배열의 합 : "+q3(ar));
	}
}
