package cn.huayu.test15;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Main{
	    public static void main(String[] args)
	        {
	    	System.out.println(reInt());
	        }
	    public static int reInt(){
	    	try{
	    		return 1;
	    	}finally{
	    		System.out.println(2);
	    	}
    	}
    	
	}
