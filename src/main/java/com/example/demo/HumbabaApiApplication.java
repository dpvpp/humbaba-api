package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import humbaba.cipher.CaesarCipher;
import humbaba.cipher.HumbabaCipher;

@SpringBootApplication
public class HumbabaApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HumbabaApiApplication.class, args);
		HumbabaCipher cipher = new CaesarCipher();
		
		char[] cipherText = cipher.encrypt("Secret message");
		System.out.println(cipherText);
		char[] plainText = cipher.decrypt(cipherText);
		System.out.println(plainText);
	}

}
