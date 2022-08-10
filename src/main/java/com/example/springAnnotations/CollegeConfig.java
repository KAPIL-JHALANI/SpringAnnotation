package com.example.springAnnotations;

import org.springframework.context.annotation.*;

@Configuration  // this annoation is used to configure the file (we can also say t is replacement of xml file)
@ComponentScan(basePackages = "com.example.springAnnotations")  // this annotaton is used to scan all the component
@PropertySource("classpath:college-info.properties")  // this annoation is used t read properties file
public class CollegeConfig {


    @Bean
    public Principal principal(){
        return new Principal();
    }

    //by default bean id is same as the method name.
    //we also provider the list of bean id if we want to give several name to a single bean eg: @Bean(name={"collgebeanhai","co1","co2"})
    @Bean(name="collgebeanhai")
    public College collegehai(){
        College college=new College();
        return college;
    }
}
