package com.example.springAnnotations;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// here we provide the bean id  in @component annotation but by default the bean id for @component annoation is
// same as the class name with first letter is in lowercase for this Class i we do not want to give the manual name to bean then default id is "college"
//@Component("collegebean")
public class College {

    @Value("${college.name}")
    private String name;

    @Autowired
    @Qualifier("principal")
    private Principal principal;

//    public College(Principal principal) {
//        this.principal=principal;
//    }

    public void test(){
        principal.show();
        System.out.println("all good");
        System.out.println(name);
    }
}