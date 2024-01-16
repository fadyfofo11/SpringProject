package firstspringjavapackage;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		MobilePhone iphone = context.getBean(MobilePhone.class, "apple", "iphone", 10.5);
		// iphone.setModel("iPhone");
		// iphone.setScreenSize(6.5);
		// iphone.setManifacturer("Apple Corporations");
		MobilePhone samsong = context.getBean(MobilePhone.class, "Samsong", "Galaxy", 16.5);
		// samsong.setManifacturer("Samsong");
		// samsong.setModel("Galaxy");
		// samsong.setScreenSize(16.5);

		System.out.println(iphone);
		System.out.println(samsong);
	}

}
