package com.jod.main;

import com.jod.main.service.FirstService;
import com.jod.main.service.ServiceBase;

public class MainClass {

	public static void main(String[] args){
		
		ServiceBase service = new FirstService();
		service.execute();
	}
}
