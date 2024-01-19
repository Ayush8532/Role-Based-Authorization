package net.codejava;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordGenerator {

	public static void main(String[] args) {
		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
		String password="super";
		String encodedPassword=encoder.encode(password);
		System.out.println(encodedPassword);

	}

}
