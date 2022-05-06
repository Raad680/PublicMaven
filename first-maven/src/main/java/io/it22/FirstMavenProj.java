package io.it22;

public class FirstMavenProj {
	
	// add 2 numbers...
		public static float Sum(float a, float b) {
			return a+b;
		}
		// this method finds the max value from a given array..
		public static int findMax(int arr[]){  
	        int max=arr[0];  
	        for(int i=1;i<arr.length;i++){  
	            if(max<arr[i])  
	                max=arr[i];  
	        }  
	        return max;  
		}
}
