package com.springmaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Clint {

	public static void main(String[] args) {

		// BulbService bulbs=new BulbService();
		// System.out.println(bulbs.askForBulb());

		try {
			ApplicationContext context = new ClassPathXmlApplicationContext("com/springmaven/applicationContext.xml");
			System.out.println("**************************************************");
			BulbService bean1 = (BulbService) context.getBean("bulbService");
			System.out.println(bean1.askForBulb());

			System.out.println("**************************************************");
			PhilpsBulb bean2 = (PhilpsBulb) context.getBean("philipsB", PhilpsBulb.class);
			System.out.println(bean2.getBulb());

			System.out.println("**************************************************");
			SyskaBulb bean3 = (SyskaBulb) context.getBean("syskaB", SyskaBulb.class);
			System.out.println(bean3.getBulb());
		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
