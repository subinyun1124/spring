package spring.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import spring.di.entity.Exam;
import spring.di.entity.SubinExam;

@ComponentScan("spring.di.ui")
@Configuration
public class SubinDIConfig {

	@Bean
	public Exam exam() {
		return new SubinExam();
	}

}
