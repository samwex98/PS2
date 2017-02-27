package base;

public class MyInteger {
	int iValue;
	public MyInteger(int iValue){
		this.iValue = iValue;
	}

	public int getiValue(){
		return iValue;
	}

	public static boolean isEven(int i){
		return (i%2==0);
	}
	public static boolean isOdd(int i){
		return (i%2!=0);
	}
	public static boolean isPrime(int i){
		for(int p=2; p<i; p++){
			if (i%p==0){
				return false;
			}
		}
		return true;
	}
	
	public boolean isEven(){
		return isEven(iValue);
	}
	public boolean isOdd(){
		return isOdd(iValue);
	}
	public boolean isPrime(){
		return isPrime(iValue);
	}
	public static boolean isEven(MyInteger i){
		return i.isEven();
	}
	public static boolean isOdd(MyInteger i){
		return i.isOdd();
	}
	public static boolean isPrime(MyInteger i){
		return i.isPrime();
	}
	
}
