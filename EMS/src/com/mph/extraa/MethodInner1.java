package com.mph.extraa;

import com.mph.extraa.MyOuter.MyInner;

public class MethodInner1 {

	int x=900;
	public void OuterMethod()
	{
		int y=20;
		class MInnerClass
		{
			int z=155;
			public void mInnerMethod()
			{
				System.out.println("x in inner method : " + x + " " + y + "  " + z);
			}
			
		}
		//System.out.println("z = " + z);
		MInnerClass mc = new MInnerClass();
		mc.mInnerMethod();
		
	}
	
	public static void main(String[] args) {
		MethodInner mo = new MethodInner();
		mo.OuterMethod();
		
		

	}

}