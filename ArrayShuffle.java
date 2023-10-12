package assignment;

import java.util.Random;

public class ArrayShuffle {
	public static void shuffleArray(int[] a) {
		int n=a.length;
		Random r= new Random();
		
		for(int i=n-1;i>0;i--) {
			int j=r.nextInt(i+1);
			
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7};
		shuffleArray(a);
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
