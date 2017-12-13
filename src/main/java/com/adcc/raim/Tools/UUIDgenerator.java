package com.adcc.raim.Tools;

import java.util.UUID;

/**
 * ID生成策略类
 * @author 
 *
 */
public class UUIDgenerator {

	/**
	 * 使用JDK自带的uuid生成策略
	 * @return uuid
	 */
	public static String generateUuid() {
		UUID uuid = UUID.randomUUID();
		//return String.valueOf(uuid).replace("-", "");
		return uuid.toString();

	}

	public static String generateSequenceID(){
		return "";
	}
	
	public static void main(String[] args) {
		System.out.println("sequence:" + generateSequenceID());
		System.out.println("uuid:" + generateUuid());
	}
}