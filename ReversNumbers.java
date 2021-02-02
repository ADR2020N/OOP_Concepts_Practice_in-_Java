package Challenges.Collection.Adrien;

public class ReversNumbers {
	public static int reverseNumber(int n){
        int revNum=0,rem;
     while(n!=0){
            rem=n%10;     
            revNum=revNum*10+rem; n=n/10; 
     }
    return revNum; 
}
}
