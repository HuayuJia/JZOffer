package cn.huayu.test14;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		int[] prices={3,1,8,5,7,20};
		Solution solution=new Solution();
		System.out.println(solution.calculateMax(prices));
		Scanner scanner=new Scanner(System.in);
	}
	public int calculateMax(int[] prices) {
        int firstBuy=Integer.MIN_VALUE,firstSell=0;
        int secondBuy=Integer.MIN_VALUE,secondSell=0;
        for(int curPrice:prices)
            {
            firstBuy=Math.max(firstBuy,-curPrice);
            firstSell=Math.max(firstSell,firstBuy+curPrice);
            secondBuy=Math.max(secondBuy,firstSell-curPrice);
            secondSell=Math.max(secondSell,secondBuy+curPrice);
        }
        return secondSell;
    }
}
