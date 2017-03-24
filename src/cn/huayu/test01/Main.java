package cn.huayu.test01;

public class Main {
	public static void main(String[] args){
		int a=1;
		int [][] arrays={{1,2,3},{2,3,4},{3,4,5}};
		System.out.println(Find(a,arrays));
	}
	
	public static boolean Find(int target, int [][] array ){
		int imax=array.length-1;
		int jmax=array[0].length-1;
		for(int i=imax,j=0;i>=0&&j<=jmax;)
		{
				if(array[i][j]==target){
					return true;
				}
				if(array[i][j]<target){
					j++;
					continue;
				}
				if(array[i][j]>target){
					i--;
					continue;
				}
				
		}
		return false;
	}

}
