package cn.huayu.test02;

public class Main {
	public static void main(String[] args)
	{
		StringBuffer str=new StringBuffer("You are welcome!");
		System.out.println(replaceSpace(str));
	}
	public static String replaceSpace(StringBuffer str){
		String string = str.toString();
		return string.replace(" ", "%20");
	}

}
