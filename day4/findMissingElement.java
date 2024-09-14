package week1.day4;

import java.util.Arrays;

public class findMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1, 4,3,2,8, 6, 7};
		Arrays.sort(a);
		for(int i=0;i<=6;i++)
		{
			int j=i+1;
			if(a[i]!=j) 
			{
				System.out.println("The missing element is "+j);
				break;
		}
	}
	}
}
