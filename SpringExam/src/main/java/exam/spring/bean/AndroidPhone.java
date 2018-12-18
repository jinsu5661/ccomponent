package exam.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AndroidPhone {
	/*
	public static void main(String[] args) {
		AndroidPhone phone1 = new AndroidPhone();
	}
	*/
	
	@Autowired	
	@Qualifier("instagram")
	private App app;

	@Qualifier("androidPhone2")
	private String name;

	public void run() {
		System.out.println(name);
		app.execute();
	}


	
	// app setter 코드 작성
	public void setApp(App app) {
		this.app = app;
	}
	// name setter 코드 작성
	public void setName(String name) {
		this.name = name;
	}
	// 생성자 코드 작성 (매개변수 2개 – App, String)
	public AndroidPhone(App app, String name) {
		this.app = app;
		this.name = name;
	}
	// 생성자 코드 작성 (기본 생성자)
	public AndroidPhone() {}

}










