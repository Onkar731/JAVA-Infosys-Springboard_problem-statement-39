public class PyramidPattern {
    public static void printPyramidPattern(int N) {
        // printing pyramid pattern - logic
        for(int i=1;i<=N;i++) {
			for(int j=1;j<N*2;j++) {
				if(i+j>=N+1 && j-i<=N-1) {
                    if(i >=10) {
                        System.out.print(i);
                    } else {
                        System.out.print(i+" ");
                    }
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
    }
}