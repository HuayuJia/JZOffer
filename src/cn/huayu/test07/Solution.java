package cn.huayu.test07;

public class Solution {

	public static void main(String[] args) {
		System.out.println(Fibonacci(7));

	}
	public static int Fibonacci(int n) {
		int a[]=new int[n];
		a[0]=1;
		a[1]=1;
		int i=2;
		while(i<n){
			a[i]=a[i-1]+a[i-2];
			i++;
		}
		return a[n-1];
	}

}
