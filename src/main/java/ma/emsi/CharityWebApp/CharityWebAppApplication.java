package ma.emsi.CharityWebApp;

import jdk.swing.interop.SwingInterOpUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CharityWebAppApplication {

	public static void main(String[] args) {

		System.out.println("hello");
		SpringApplication.run(CharityWebAppApplication.class, args);
	}

}
