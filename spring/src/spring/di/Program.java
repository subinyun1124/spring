package spring.di;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import spring.di.entity.Exam;
import spring.di.entity.SubinExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsole;
import spring.di.ui.InlineExamConsole;

public class Program {

	public static void main(String[] args) {
		
		// 스프링에게 지시하는 방법으로 코드를 변경
//		Exam exam = new SubinExam();
//		ExamConsole console = new GridExamConsole();
//		
//		console.setExam(exam);
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring/di/setting.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(SubinDIConfig.class);
		
		// 여러개 config 관리도 가능
//		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
//		ctx.register(AppConfig.class, OtherConfig.class);
//		ctx.refresh();
		
//		Exam exam = context.getBean(Exam.class);
//		System.out.print(exam.toString());
		
		//ExamConsole console = (ExamConsole) context.getBean("console"); //이름으로 가져오기, 형식변환 필수 + @Component("console")이름 세팅 
		ExamConsole console = context.getBean(ExamConsole.class); //자료형  << 많이
		
		console.print();
		
//		List<Exam> exams = new ArrayList<>();
//		exams.add(new SubinExam(1, 1, 1, 1));
		
//		List<Exam> exams = (List<Exam>) context.getBean("exams");
		//exams.add(new SubinExam(1, 1, 1, 1));
		
//		for(Exam e : exams) {
//			System.out.println(e);
//		}
	
	
	}
	
}
