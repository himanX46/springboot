package com.himan.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
          new Course(1,"Spring","Himan"),
                new Course(2,"SpringBoot","Himan2"),
                new Course(3,"Kafka","Himan3"),
                new Course(4,"Kubernetes","Himan4"),
                new Course(5,"Docker","Himan5")
        );
    }
}
