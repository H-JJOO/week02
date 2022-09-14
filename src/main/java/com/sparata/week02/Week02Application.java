package com.sparata.week02;

import com.sparata.week02.domain.Course;
import com.sparata.week02.domain.CourseRepository;
import com.sparata.week02.domain.Student;
import com.sparata.week02.domain.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Week02Application {

    public static void main(String[] args) {
        SpringApplication.run(Week02Application.class, args);
    }

    // Week02Application.java 의 main 함수 아래에 붙여주세요.
    @Bean
    public CommandLineRunner demo(CourseRepository repository) {
        return (args) -> {

            Course course1 = new Course("웹개발의 봄 Spring", "남병관");
            repository.save(course1);

            List<Course> courseList = repository.findAll();
            for (int i = 0; i < courseList.size(); i++) {
                Course c = courseList.get(i);
                System.out.println(c.getTitle());
                System.out.println(c.getTutor());
            }

        };
    }

//    @Bean
//    public CommandLineRunner demo(StudentRepository repository) {
//        return (args) -> {
//
//
//            Student student1 = new Student("주현진", 30);
//            repository.save(student1);
//
//            List<Student> studentList = repository.findAll();
//            for (int i = 0; i < studentList.size(); i++) {
//                Student s = studentList.get(i);
//                System.out.println(s.getName());
//                System.out.println(s.getAge());
//            }
//        };
//    }

}
