package com.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String ar[]) {


		 // created spring ioc container
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

		TextEditor textEditor = (TextEditor)applicationContext.getBean("texteditor");


		textEditor.SpellChk();// calling the method  of class textEditor


	}

}