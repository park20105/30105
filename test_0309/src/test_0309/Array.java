package test_0309;

public class Array {

	public static void main(String[] args) {
		int[] arr = {94,85,95,88,90};
		int max=0;
		for(int n=0; n<arr.length; n++) {
			if(max < arr[n]) {
				max = arr[n];
			}
		}
		System.out.println(max);
	}

}
