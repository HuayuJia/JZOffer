package cn.huayu.test13;

import java.util.ArrayList;

public class Solution {

	public static void main(String[] args) {
		Solution solution =new Solution();
		int [] array=new int[10];
		for(int i=0;i<array.length;i++)
		{
			array[i]=i-5;
		}
		solution.reOrderArray(array);
	}
	public void reOrderArray(int [] array) {
		ArrayList<Integer> aList=new ArrayList<Integer>();
		ArrayList<Integer> bList=new ArrayList<Integer>();
       for(int i=0;i<array.length;i++)
       {
    	   if( array[i]%2==1||array[i]%2==-1) aList.add(array[i]);
    	   if( array[i]%2==0) bList.add(array[i]);
       }
       int k=0;
       for(int i=0;i<aList.size();i++)
       {
    	   array[k++]=aList.get(i);
       }
       for(int i=0;i<bList.size();i++)
       {
    	   array[k++]=bList.get(i);
       }
//       for(int i=0;i<array.length;i++)
//       {
//    	   System.out.print(array[i]+" ");
//       }
    }

	
}
