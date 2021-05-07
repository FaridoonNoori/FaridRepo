package testpro1;

import java.util.ArrayList;

public class PascalTri1 {

	public void pascal( int n) {
		
		int[][] ar= new int[n][n];
		
		for(int j=0; j<n; ++j)
		{
			
			for(int i=0; i<=j; ++i) 
			{
				if(i==j || i==0)  ar[j][i]=1;	
				else
						ar[j][i]=ar[j-1][i]+ar[j-1][i-1];
						System.out.print("       "+ar[j][i]);
				
			}
			System.out.println("");
		}
		
	}
}
