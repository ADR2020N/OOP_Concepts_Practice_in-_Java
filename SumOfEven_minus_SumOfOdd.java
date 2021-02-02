package Challenges.Collection.Adrien;

public class SumOfEven_minus_SumOfOdd {
	public static int sumOfEven_minus_SumOfOdd(int[] a)  
	{  
	int sumEven = 0;  int sumOdd = 0;  
	for (int i=0; i<a.length; i++)  
	{  
	if (a[i]%2 == 0)  
		sumEven += a[i];  
	else  
	   sumOdd += a[i];  
	}  
		return sumOdd - sumEven;	  
	}

}
