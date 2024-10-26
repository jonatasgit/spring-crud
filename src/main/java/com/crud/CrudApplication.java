package com.crud;

import com.crud.model.Course;
import com.crud.repository.CourseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}

	@Bean
	CommandLineRunner enrichCourses(final CourseRepository courseRepository){
		return args -> {
			Course course1 = new Course();
			course1.setName("Quarkus");
			course1.setCategory("back-end");
			courseRepository.save(course1);

			Course course2 = new Course();
			course2.setName("Springazadaa2");
			course2.setCategory("back-end");
			courseRepository.save(course2);

			Course course3 = new Course();
			course3.setName("Angulinha");
			course3.setCategory("front-end");
			courseRepository.save(course3);
		};
	}

}
