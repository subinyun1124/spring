package spring.aop;

import spring.aop.entity.SubinExam;
import spring.di.SubinDIConfig;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.aop.entity.Exam;


public class Program {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/aop/setting.xml");
		//ApplicationContext context = new AnnotationConfigApplicationContext(SubinDIConfig.class);
		
		Exam proxy = (Exam) context.getBean("proxy");
		// proxy, exam(원본)
		System.out.printf("Total is %d\n", proxy.total());
		System.out.printf("Total is %d\n", proxy.total());
		
//		Exam exam = new SubinExam(1,1,1,1);	
//		
//		// Cross-cutting concern
//		Exam proxy = (Exam) Proxy.newProxyInstance(SubinExam.class.getClassLoader(),
//				new Class[] {Exam.class},
//				new InvocationHandler() {
//					
//					@Override
//					public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
//						long start = System.currentTimeMillis();
//					
//						// Primary Concern
//						Object result = method.invoke(exam, args);
//						
//						long end = System.currentTimeMillis();
//						String message = (end - start) + "ms 시간이 걸렸습니다.";
//						
//						System.out.println(message);
//						
//						return result;
//						
//					}
//				}
//			);
		
	}

}
