package CodingJava;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		
		int arr[]= {7,5,8,9,3,6,4,1,2};
		
		int temp;
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=1;j<arr.length-i;j++) {
				
				if(arr[j]<arr[j-1]) {
					
					temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
							
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
