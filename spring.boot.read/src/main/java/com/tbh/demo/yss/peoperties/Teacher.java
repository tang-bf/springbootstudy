package com.tbh.demo.yss.peoperties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties(prefix = "teacher")
public class Teacher {

    private String name;

    private List<Student> students;


    @Override
    public String toString() {
        System.out.print("students:");
        for (Student student : students) {
            System.out.println(student);
        }
        return "Teacher{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
