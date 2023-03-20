
package org.tnsif.objectsinjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.tnsif.literals.SwiftEngine;

public class DIUsingObjects {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		BeanFactory f =new ClassPathXmlApplicationContext("web.xml");
		CellPhone e1 = f.getBean("c2", CellPhone.class);
		e1.accept();
	}

}  