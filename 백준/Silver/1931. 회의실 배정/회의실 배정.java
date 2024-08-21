import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		
		int[][] arr = new int[N][2];
		
		for(int i=0;i<N;i++) {
			arr[i][0] = in.nextInt();
			arr[i][1] = in.nextInt();
		}
		
		Arrays.sort(arr, (o1,o2)->{
			if(o1[1]==o2[1]) {
				return Integer.compare(o1[0], o2[0]);
			}else {
				return Integer.compare(o1[1], o2[1]);
			}
		});

		int result =0;
		int lastTime=0;
		for(int i=0;i<N;i++) {
			if(lastTime <= arr[i][0]) {
				lastTime = arr[i][1];
				result++;
			}
		}
		
		System.out.println(result);
	}

}
