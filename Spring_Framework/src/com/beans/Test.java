package com.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import com.beans.Sample_Prog;

public class Test {
  public static void main(String[]args) {
	  Resource r = new ClassPathResource("resource/Spring.xml");
//	  BeanFactory factory = new XmlBeanFactory(r);
	  ApplicationContext context = new ClassPathXmlApplicationContext("resource/Spring.xml");
//      Sample_Prog obj11=(Sample_Prog)context.getBean("t1");
//      Sample_Prog obj12=(Sample_Prog)context.getBean("t1");
//      Sample_Prog obj13=(Sample_Prog)context.getBean("t1");
      
      Sample_Const obj14=(Sample_Const)context.getBean("t3");
//    System.out.println(obj14.getId());
      System.out.println(obj14.getName());
//    System.out.println(obj11.getS());
//    System.out.println(obj12.getS());
//    System.out.println(obj13.getS());
      
//    creating beans for Sample_Prog2
//    Sample_Prog2 obj21=(Sample_Prog2)context.getBean("t2");
//    Sample_Prog2 obj22=(Sample_Prog2)context.getBean("t2");
      
//	  Object o = factory.getBean("t1");
//	  Sample_Prog obj = (Sample_Prog)o;
//	  obj.setInput("hello");
  }
}
