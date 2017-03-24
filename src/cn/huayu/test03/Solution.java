package cn.huayu.test03;

import java.util.ArrayList;
public class Solution {
    ArrayList<Integer> arrayList=new ArrayList<Integer>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if(listNode!=null)
		{
			this.printListFromTailToHead(listNode.next);
			arrayList.add(listNode.val);
		}
			return arrayList;
        
    }
}