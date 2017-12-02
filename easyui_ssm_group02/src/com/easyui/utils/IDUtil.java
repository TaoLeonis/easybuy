package com.easyui.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class IDUtil {
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd") ;
	private static Random rand = new Random() ;
	public static Integer randId(){
		return (int) (Math.random()*10000+Math.random()*10000) ;
	}
	
	
	public static String randStringId(){
		return sdf.format(new Date())+(rand.nextInt(900)+100) ;
	}
}
