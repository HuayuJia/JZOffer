package cn.huayu.test08;

public class Solution {
	public static void main(String[] args){
		System.out.println((int) Math.pow(2, 3));
	}
    public static int JumpFloor(int target) {
        if(target==0)return 0;
        if(target==1) return 1;
        if(target==2) return 2;
        int i=3;
        int a[]=new int[target+1];
        a[0]=0;
        a[1]=1;
        a[2]=2;
        while(i<=target)
        {
            a[i]=a[i-1]+a[i-2];
            i++;
        }
        return a[target];
        
    }
}