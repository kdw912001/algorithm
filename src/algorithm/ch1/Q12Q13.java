package algorithm.ch1;

public class Q12Q13 {

	public static void q12() {
		/*System.out.print(" | ");
		for(int i=1; i<=9;i++) {
			System.out.print(i+"  ");
		}
		System.out.println();
		System.out.println("-+--------------------------");
		for(int i=1; i<=9; i++) {
			System.out.print(i+"| ");
			for(int j=1; j<=9;j++){
				
				System.out.print(i*j+" ");
				if(i*j<10) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}*/
		
		//가로 11 세로 11 좌표
		for(int i=-1;i<=9;i++) {
			for(int j=-1;j<=9;j++) {
				if(i==-1) {
					if(j==-1)
						System.out.print("   ");
					else if(j>=1)
						System.out.print(j+"  ");
				}
				if(i==0) {
					if(j==0){
						System.out.print("+");
					}
					else
						System.out.print("---");
				}
				if(j==-1) {
					if(i>=1)
						System.out.print(i+"  ");
				}
				if(j==0) {
					if(i==0) {
						//중복
					}else {
						System.out.print("| ");
					}
				}
				
				if(i>=1 &&j>=1)	{
					System.out.print(i*j+" ");
					if(i*j<10)
						System.out.print(" ");
				}
			}
			System.out.println();
		}
}

public static void q13() {
	//
	for(int i=-1;i<=9;i++) {
		for(int j=-1;j<=9;j++) {
			if(i==-1) {
				if(j==-1)
					System.out.print("   ");
				else if(j>=1)
					System.out.print(j+"  ");
			}
			if(i==0) {
				if(j==0){
					System.out.print("+");
				}
				else
					System.out.print("---");
			}
			if(j==-1) {
				if(i>=1)
					System.out.print(i+"  ");
			}
			if(j==0) {
				if(i==0) {
					//중복
				}else {
					System.out.print("| ");
				}
			}
			
			if(i>=1 &&j>=1)	{
				System.out.print((i+j)+" ");
				if(i+j<10)
					System.out.print(" ");
			}
		}
		System.out.println();
	}
}

public static void main(String[] args) {
	q12();
	//q13();

}

}
