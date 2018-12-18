package exam.spring.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainBean {
	public static void main(String[] args) {
		ApplicationContext con = 
				new ClassPathXmlApplicationContext("exam/spring/bean/bean-config.xml");

		AndroidPhone phone1 = 
				(AndroidPhone) con.getBean("androidPhone");
		phone1.run();

		/*
		AndroidPhone phone1 = 
				(AndroidPhone) con.getBean("androidPhone1");
		phone1.run();

		AndroidPhone phone2 = 
				(AndroidPhone) con.getBean("androidPhone2");
		phone2.run();
*/	}
}