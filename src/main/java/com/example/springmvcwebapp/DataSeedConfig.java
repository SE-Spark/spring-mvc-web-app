package com.example.springmvcwebapp;

import com.example.springmvcwebapp.models.Student;
import com.example.springmvcwebapp.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DataSeedConfig {
//    @Bean
//    CommandLineRunner commandLineRunner(StudentRepository repository){
//        return args -> {
//           var st1= new Student("mali","mutua","nai","kenya");
//            var st2= new Student("rael","nelly","Eld","kenya");
//            var st3= new Student("tony","noel","mach","kenya");
//            repository.saveAll(List.of(st1,st2,st3));
//        };
//    }
}
