package array;

public class InterviewArray {

	public static void main(String[] args) {
		
		int[] arr = {8,9,10,11,12,13,17,18,19,20,1,2,3,14,15,16,4,5,6,7};
		
		int sum = 25;
		int valueSum =0;
		int i = arr.length-1;
		
		for(int j = 0 ; j <= i; j++) {
			for (int k= j + 1; k <= i ; k++) {
				valueSum = arr[j] + arr[k];
				if (valueSum == sum ) {
					System.out.println(" " + arr[j] + " " + arr[k]);
				}
			}
		}
		
	}

}
